<font size='3'><b>Building Social Texting Apps made easy with TèksMe API</b></font>

This document describes how to use TèksMe API to submit information through multiple channels including text messaging, Twitter, email etc.

<font size='4'><b>Contents</b></font>



# Introduction #

People's communication preferences and habits have changed. People are seeking better ways to communicate and build bridges with friends and neighbors of other faiths. This API enables your apps to expand beyond the confines of single service providers, whether that are the phone company or a social network service.

# Send Message Parameters #

Here are the the **required parameters** in the HTTP GET or POST request:

| **Field** | **Short description** |
|:----------|:----------------------|
| **from**  | The source/sender address (a.k.a “Sender ID”) that the message will appear to come from. For mobile phones, the numbers are in [E.164 format](http://en.wikipedia.org/wiki/E.164). |
| **to**    | The destination address to whom this message is to be sent. If a handset, the number should be in [E.164 format](http://en.wikipedia.org/wiki/E.164). If you want to send the same message to more than one recipient, please separate with comma. |
| **channel** | This allows for engaging your users via text-based communication channels such as SMS, GTalk, Twitter, Yahoo, and nearly every IM network. For IM clients, you need to supply the appropriate credentials. |
| **shout** | The text content of the message. Note that the maximum individual short message sizes of 160 7-bit characters, 140 8-bit characters, or 70 16-bit characters (including spaces). |

Here are the the **optional parameters** in the HTTP GET or POST request:

| **Field** | **Short description** |
|:----------|:----------------------|
| **id**    | For tracking purpose, thrid-party applications can define a message ID. Up to 34 alphanumeric characters with no spaces. |
| **date**  | The date and time of the request, in [RFC 2822 format](http://www.ietf.org/rfc/rfc2822.txt). |
| **stopOnError** | Stop execution upon first error. |
| **schedule** | Specify the date and time, in [RFC 2822 format](http://www.ietf.org/rfc/rfc2822.txt), when a message gets delivered. |
| **timeout** | The validity period, in minutes. The message will not be delivered if it is still queued on our gateway after this time period. |
| **delay** | Delays, in minutes, the delivery of a message. |
| **callback** | A relative or absolute URL. It enables your application to receive message delivery statuses via an HTTP, SOAP or XML callback which is posted to a URL of yours using the GET or POST method. This is done every time a message status is updated. |
| **concatenated** | It will span long messages across `<N>` messages where applicable. A maximum of 3 is recommended. One SMS will be sent for every 160 characters or 140 bytes. |
| **routing** | A list with one or more gateways to consider while sending this message. Available: ` BULKSMS `, `CLICKATEL`, ` MOVISTAR ` |

# Endpoint URL #

```
http://api.teks.me/p/{profileId}/sendmsg
```


# HTTP GET #

You can send text messages and pictures or sounds to one or more recipients, by sending an HTTP GET request to its URI. The URI for a request has the following format:

```
GET /sendmsg?parameters
```

## Example ##

```
http://api.teks.me/p/{profileId}/sendmsg?oauth_token=YourToken
         &channel=SMS
         &shout=Hello%20from%20TeksMe%21
         &to=Recipient(s)Phone 
         &from=YourPhone
         &oauth_consumer_key=YourConsumerKey
         &oauth_signature_method=HMAC-SHA1
         &oauth_timestamp=1297578530
         &oauth_nonce=1297578530577906000
         &oauth_version=1.0
         &oauth_signature=YourSignature

```

## Java Sample Code ##

Now that you are familiar with the protocol discussed in this document, it is time to take a look at the sample code available at our SVN repository within the ` teksme-oauth-java-client ` project. Here is the example: [SignedSendMessageRequest.java](http://code.google.com/p/teksme/source/browse/trunk/client/java/example/teksme-oauth-java-client/src/org/teksme/server/tests/oauth/SignedSendMessageRequest.java)

## PHP Sample Code ##

If you want to see an example on how to send messages using PHP, please have a look at the [teksme-oauth-php-client project](http://code.google.com/p/teksme/source/browse/trunk/client/php/example/teksme-oauth-php-client/oauth_send_message.php) in the source code repository.

# HTTP POST #

## TèksML `<`outboundMessage`>` ##

The `<`outboundMessage`>` verb sends a message to multiple channels with a single transmission, which saves valuable time. To shout a new message, send a POST request, and supply the XML representation of the new message in a parameter called ` data `.

## Example ##

The XML representation of a new message using the TèksML lingo.

```

<?xml version="1.0" encoding="UTF-8"?>
<teks:Teks xmlns:teks="http://teksme.org/meta/1.0.0/teks">
	<outboundMessage>
		<from>+12023567865</from>
		<to>+12028754532</to>
		<channels>
			<channel>SMS</channel>
		</channels>
		<shout this="Hello from TeksMe Cloud!" />
	</outboundMessage>
</teks:Teks>

```

Note that you don't supply the standard `<id>` element; the server creates this in response to your POST request.

```
POST /sendmsg?oauth_token=YourToken
         &data=YourXML
         &oauth_consumer_key=YourConsumerKey
         &oauth_signature_method=HMAC-SHA1
         &oauth_timestamp=1297578530
         &oauth_nonce=1297578530577906000
         &oauth_version=1.0
         &oauth_signature=YourSignature
```

# Additional resources #

You may find the following third-party documents useful:

  * HTTP 1.1 [method definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html); specification for GET, POST, PUT, and DELETE
  * HTTP 1.1 [status code definitions](http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html)
  * [A Technical Introduction to XML](http://www.xml.com/pub/a/98/10/guide0.html)
  * [XML Namespaces by Example](http://www.xml.com/pub/a/1999/01/namespaces.html)