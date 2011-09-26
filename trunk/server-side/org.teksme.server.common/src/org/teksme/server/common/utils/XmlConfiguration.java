package org.teksme.server.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.teksme.server.common.messaging.AMQPBrokerParameters;

public class XmlConfiguration {

	private Logger logger = Logger.getLogger(XmlConfiguration.class.getName());

	private static final String CONFIG_DIR_VAR = "teksme.configurationDir";

	public TeksConfig.MessageMiddleware readMessageMiddlewareConfig(String configFile) {
		TeksConfig.MessageMiddleware msgMiddleware = null;
		try {
			// First create a new XMLInputFactory
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();

			InputStream inputStream = null;
			try {
				final String filePath = System.getProperty(CONFIG_DIR_VAR).concat(File.separator).concat(configFile);
				logger.info("Loading configuration $" + filePath + "...");
				inputStream = new FileInputStream(new File(filePath));
			} catch (IOException e) {
				e.printStackTrace();
			}

			XMLEventReader eventReader = inputFactory.createXMLEventReader(inputStream);
			// Read the XML document
			List<TeksConfig.MessageMiddleware.Queue> queues = new ArrayList<TeksConfig.MessageMiddleware.Queue>();
			TeksConfig.MessageMiddleware.Queue queue = null;

			while (eventReader.hasNext()) {
				XMLEvent event = eventReader.nextEvent();

				if (event.isStartElement()) {
					StartElement startElement = event.asStartElement();

					// If we have a msgMiddleware element we create a new item
					if (startElement.getName().getLocalPart() == (AMQPBrokerParameters.MESSAGE_MIDDLEWARE)) {
						msgMiddleware = new TeksConfig.MessageMiddleware();
					}

					if (event.isStartElement()) {
						if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.CONNECTION_NAME)) {
							event = eventReader.nextEvent();
							msgMiddleware.setName(event.asCharacters().getData().trim());
							continue;
						}
					}
					if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.HOST)) {
						event = eventReader.nextEvent();
						msgMiddleware.setHost(event.asCharacters().getData().trim());
						continue;
					}
					if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.PORT)) {
						event = eventReader.nextEvent();
						msgMiddleware.setPort(Integer.parseInt(event.asCharacters().getData().trim()));
						continue;
					}
					if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.USERNAME)) {
						event = eventReader.nextEvent();
						msgMiddleware.setUsername(event.asCharacters().getData().trim());
						continue;
					}
					if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.PASSWD)) {
						event = eventReader.nextEvent();
						msgMiddleware.setPasswd(event.asCharacters().getData().trim());
						continue;
					}
					if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.VIRTUAL_HOST)) {
						event = eventReader.nextEvent();
						msgMiddleware.setVirtualHost(event.asCharacters().getData().trim());
						continue;
					}

					if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.QUEUES)) {

						while (eventReader.hasNext()) {
							event = eventReader.nextEvent();

							if (event.isStartElement()) {
								startElement = event.asStartElement();

								// If we have a msgMiddleware element we create
								// a new item
								if (startElement.getName().getLocalPart() == (AMQPBrokerParameters.QUEUE)) {
									queue = new TeksConfig.MessageMiddleware.Queue();
								}

								if (event.isStartElement()) {
									if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.QUEUE_NAME)) {
										event = eventReader.nextEvent();
										queue.setName(event.asCharacters().getData().trim());
										continue;
									}
								}
								if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.QUEUE_KEY)) {
									event = eventReader.nextEvent();
									queue.setKey(event.asCharacters().getData().trim());
									continue;
								}
								if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.QUEUE_EXCHANGE)) {
									event = eventReader.nextEvent();
									queue.setExchange(event.asCharacters().getData().trim());
									continue;
								}

								if (event.isStartElement()) {
									startElement = event.asStartElement();

									if (startElement.getName().getLocalPart() == (AMQPBrokerParameters.CONFIGURATION)) {

									}

									if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.DURABLE)) {
										event = eventReader.nextEvent();
										queue.setDurable(Boolean.parseBoolean(event.asCharacters().getData().trim()));
										continue;
									}
									if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.AUTO_DELETE)) {
										event = eventReader.nextEvent();
										queue.setAutoDelete(Boolean.parseBoolean(event.asCharacters().getData().trim()));
										continue;
									}

									if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.EXCLUSIVE)) {
										event = eventReader.nextEvent();
										queue.setExclusive(Boolean.parseBoolean(event.asCharacters().getData().trim()));
										continue;
									}
									if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.TYPE)) {
										event = eventReader.nextEvent();
										queue.setType(event.asCharacters().getData().trim());
										continue;
									}
									if (event.asStartElement().getName().getLocalPart().equals(AMQPBrokerParameters.CONSUMER_CLASS)) {
										event = eventReader.nextEvent();
										queue.setConsumerClass(event.asCharacters().getData().trim());
										continue;
									}

								}
							}

							if (event.isEndElement()) {
								EndElement endElement = event.asEndElement();
								if (endElement.getName().getLocalPart() == (AMQPBrokerParameters.QUEUE)) {
									queues.add(queue);
									msgMiddleware.setQueues(queues);
								}
							}

						}
					}
				}

			}
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		return msgMiddleware;
	}

}