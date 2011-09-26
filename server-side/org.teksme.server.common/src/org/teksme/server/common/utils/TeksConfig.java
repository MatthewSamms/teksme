package org.teksme.server.common.utils;

import java.util.List;

public class TeksConfig {

	public static class MessageMiddleware {

		private String name;
		private String host;
		private Integer port;
		private String username;
		private String passwd;
		private String virtualHost;

		private List<Queue> queues;

		public static class Queue {
			private String name;
			private String key;
			private String exchange;
			private String configuration;
			private boolean durable;
			private boolean autoDelete;
			private boolean exclusive;
			private String type;
			private String consumerClass;
			
			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}

			/**
			 * @param name
			 *            the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}

			/**
			 * @return the key
			 */
			public String getKey() {
				return key;
			}

			/**
			 * @param key
			 *            the key to set
			 */
			public void setKey(String key) {
				this.key = key;
			}

			/**
			 * @return the exchange
			 */
			public String getExchange() {
				return exchange;
			}

			/**
			 * @param exchange
			 *            the exchange to set
			 */
			public void setExchange(String exchange) {
				this.exchange = exchange;
			}

			/**
			 * @return the configuration
			 */
			public String getConfiguration() {
				return configuration;
			}

			/**
			 * @param configuration
			 *            the configuration to set
			 */
			public void setConfiguration(String configuration) {
				this.configuration = configuration;
			}

			/**
			 * @return the durable
			 */
			public boolean isDurable() {
				return durable;
			}

			/**
			 * @param durable
			 *            the durable to set
			 */
			public void setDurable(boolean durable) {
				this.durable = durable;
			}

			/**
			 * @return the autoDelete
			 */
			public boolean isAutoDelete() {
				return autoDelete;
			}

			/**
			 * @param autoDelete
			 *            the autoDelete to set
			 */
			public void setAutoDelete(boolean autoDelete) {
				this.autoDelete = autoDelete;
			}

			/**
			 * @return the exclusive
			 */
			public boolean isExclusive() {
				return exclusive;
			}

			/**
			 * @param exclusive
			 *            the exclusive to set
			 */
			public void setExclusive(boolean exclusive) {
				this.exclusive = exclusive;
			}

			/**
			 * @return the type
			 */
			public String getType() {
				return type;
			}

			/**
			 * @param type
			 *            the type to set
			 */
			public void setType(String type) {
				this.type = type;
			}

			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Queue [name=" + name + ", key=" + key + ", exchange=" + exchange + ", configuration=" + configuration
						+ ", durable=" + durable + ", autoDelete=" + autoDelete + ", exclusive=" + exclusive + ", type=" + type + "]";
			}

			public String getConsumerClass() {
				return consumerClass;
			}

			public void setConsumerClass(String consumerClass) {
				this.consumerClass = consumerClass;
			}

		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the host
		 */
		public String getHost() {
			return host;
		}

		/**
		 * @param host
		 *            the host to set
		 */
		public void setHost(String host) {
			this.host = host;
		}

		/**
		 * @return the port
		 */
		public Integer getPort() {
			return port;
		}

		/**
		 * @param port
		 *            the port to set
		 */
		public void setPort(Integer port) {
			this.port = port;
		}

		/**
		 * @return the username
		 */
		public String getUsername() {
			return username;
		}

		/**
		 * @param username
		 *            the username to set
		 */
		public void setUsername(String username) {
			this.username = username;
		}

		/**
		 * @return the passwd
		 */
		public String getPasswd() {
			return passwd;
		}

		/**
		 * @param passwd
		 *            the passwd to set
		 */
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}

		/**
		 * @return the virtualHost
		 */
		public String getVirtualHost() {
			return virtualHost;
		}

		/**
		 * @param virtualHost
		 *            the virtualHost to set
		 */
		public void setVirtualHost(String virtualHost) {
			this.virtualHost = virtualHost;
		}

		/**
		 * @return the queues
		 */
		public List<Queue> getQueues() {
			return queues;
		}

		/**
		 * @param queues
		 *            the queues to set
		 */
		public void setQueues(List<Queue> queues) {
			this.queues = queues;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "MessageMiddleware [name=" + name + ", host=" + host + ", port=" + port + ", username=" + username + ", passwd="
					+ passwd + ", virtualHost=" + virtualHost + ", queues=" + queues + "]";
		}

	}
}
