<font size='3'><b>Making Signed Requests using one access token with OAuth</b></font>

We use [OAuth](http://oauth.net/) that allows secure API authorization from TèksMe.

Please keep in mind that OAuth is complicated, especially for beginners. So we've created this guide to help you out. We've tried to simplify it, but if you get stuck, there are a lot of other good resources are on the reference section.

<font size='4'><b>Contents</b></font>



# Introduction #

The oAuth protocol comes in two flavors, 3-legged and 2-legged protocols. This document describes the 2-legged scheme used by TèksMe.

The 3-legged one is about delegating user access rights to an application and is the one that gets the most attention on the web. For example, this mechanism is used by sites and applications within the Twitter Ecosystem to get access to your data held on Twitter.

The 2-legged version is used to authenticate an application against a service provider (TèksMe in our case) with no specific user involved (server-to-server). So many integrations just need to make use of a single user account. By using a single access token, you don't need to implement the entire OAuth token acquisition dance.

<a href='Hidden comment: 
The design of the TèksMe Authentication scheme was inspired by the [http://developer.netflix.com/ Netflix API].
'></a>

## Before moving any further ##

Please note that TèksMe is not yet fully available. At this stage, we have published some docs and are checking in code to the repository. For now, you need an invitation to use TèksMe. And if you were invited, we will provide you with your **consumer key** and **shared secret**, which you will need before anything else on this page will make sense. Please sign up for the [waitlist](Waitlist.md).


# Authentication Scheme #

## Overview ##

Here we make sure that only registered developers are using TèksMe data. On a conceptual level 2-legged OAuth simply consists of the first and last steps of 3-legged OAuth:
**( 1 )** Client has signed up to the server and got his client credentials (also known as “consumer key and shared  secret”); and **( 2 )** Client uses his client credentials `[`and token credentials`]` to access the protected resources on the server.

You shouldn't ever share the combination of your OAuth consumer key, secret, access token, and access token secret.

## "Signing" your requests ##

Throughout your OAuth experience, you'll be "signing" various requests. Each request has four major components:

  * **The Base String**: your HTTP verb - almost always GET or POST - plus the base URL, plus all of your request and OAuth parameters. The OAuth base string will look like certain parts are double encoded (mainly, the parameters to the request). This is normal, and you should not see characters other than ` ALPHA / DIGIT / "-" / "." / "_" / "~" ` [RFC 3986 section 2.3 Unreserved Characters](http://tools.ietf.org/html/rfc3986), and obviously the ` %XX ` characters in the encoded fields, separated by unencoded ` & `.

  * **The Public Key**: the [consumer](consumer.md) key provided by TèksMe upon registration. This key will be shown in plain text within the signed URL.

  * **The Secret**:  the [consumer](consumer.md) secret is another piece of information provided by us.

  * **The Signature**: a mix of your request, public key, and secret, produced by the signing algorithm. TèksMe requires that all OAuth requests be signed using the HMAC/SHA1 (Hashing for Message Authentication with SHA1) algorithm. See [RFC5849 The OAuth 1.0 Protocol section 3.4.1. Signature Base String](http://tools.ietf.org/html/rfc5849#section-3.4.1).

## Constructing the Base String ##

The signature base string includes the following components of the HTTP request:

  * **The HTTP Request Method Must**: HTTP request method (e.g., "GET", "POST", etc.). Always be sent in uppercase, and must be [percent-encoded](http://en.wikipedia.org/wiki/URL-encoding).

  * **The URL Must**: the scheme, authority, and path as declared by the [RFC2616 HTTP "Host" request header field](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). Include the port number if it is other than 80 for HTTP or 443 for HTTPS.  The path and query components of the request resource URI. Be [percent-encoded](http://en.wikipedia.org/wiki/URL-encoding).

  * **The HTTP Request Parameter String Must**: include all requests you want to pass with the request. This means everything in the body for POSTs and everything after the question-mark for GETs. The protocol parameters excluding the "oauth\_signature". Parameters included in the request entity-body if they comply with the strict restrictions defined in [RFC5849 The OAuth 1.0 Protocol Section 3.4.1.3](http://tools.ietf.org/html/rfc5849#section-3.4.1).

### OAuth Parameters ###

At a minimum, your base string must contain the following OAuth parameters:

| **Parameter** | **Description** |
|:--------------|:----------------|
| ` oauth_consumer_key ` | Your oauth\_consumer\_key is the same as your TèksMe API Key. |
| ` oauth_nonce ` | or "number used once" is a random string, uniquely generated by the client to allow the server to verify that a request has never been made before and helps prevent replay attacks when requests are made over a non-secure channel. For more information: [3.3.  RFC5849 The OAuth 1.0 Protocol Section 3.3 Nonce and Timestamp](http://tools.ietf.org/html/rfc5849#section-3.3). |
| ` oauth_signature_method ` | The cryptographic method you're going to use to sign your call. Always send HMAC-SHA1, in upper-case letters.|
| ` oauth_timestamp ` | the number of seconds elapsed since midnight, 1 January 1970. For more information: [3.3.  RFC5849 The OAuth 1.0 Protocol Section 3.3 Nonce and Timestamp](http://tools.ietf.org/html/rfc5849#section-3.3). |
| ` oauth_version ` | OPTIONAL.  If present, MUST be set to "1.0".  Provides the version of the authentication process as defined in this specification. |

## Get Your Request Token ##


```

GET&http%3A%2F%2Fapi.teks.me%2Foauth%2Frequest_token&
oauth_consumer_key%3DYourConsumerKey
%26oauth_nonce%31297546374372807000
%26oauth_signature_method%3DHMAC-SHA1
%26oauth_timestamp%3D1297546374
%26oauth_version%3D1.0

```

... and sign it with your HMAC-SHA1 library. Percent-encode your signature and make the request, like so:

```

http://api.teks.me/oauth/request_token
?oauth_consumer_key=YourConsumerKey
&oauth_signature_method=HMAC-SHA1
&oauth_timestamp=1234567890
&oauth_nonce=1297546374372807000
&oauth_version=1.0
&oauth_signature=YourSignature

```

If successful, the response you get will include:

```

oauth_token=YourToken
&oauth_token_secret=YourTokenSecret
&application_name=Your+Application+Name

```

## Using an OAuth library ##

If that sounds like a lot of work, you're right! But we are pretty sure that you are using a library for this, right? If not, please take a look at the [OAuth Code Page](http://oauth.net/code). That would probably make things a lot simpler.

### Java OAuth Lib ###

The following code snippet uses a Java OAuth library available here: http://code.google.com/p/oauth/

```

String reqUrl = "http://api.teks.me/oauth/login";
OAuthServiceProvider provider = new OAuthServiceProvider(reqUrl, null, null);
OAuthConsumer consumer = new OAuthConsumer(“callbackUrl”, “consumerKey”, “consumerSecret”, provider);
OAuthAccessor accessor = new OAuthAccessor(consumer);

OAuthClient client = new OAuthClient(new HttpClient4());
client.getRequestToken(accessor);

props.setProperty("requestToken", accessor.requestToken);
props.setProperty("tokenSecret", accessor.tokenSecret);

```

### PHP OAuth Lib ###

The following code snippet uses a PHP OAuth library available here: http://code.google.com/p/oauth/

```

<?php
require_once("./library/OAuth.php");

$key = ' '; // fill with your public key 
$secret = ' '; // fill with your secret key
$url = "http://api.teks.me/oauth/login"; // fill with the url for the oauth service

$test_consumer = new OAuthConsumer($key, $secret, NULL);

$hmac_method = new OAuthSignatureMethod_HMAC_SHA1();

$sig_method = $hmac_method;

try {
	
	$req_req = OAuthRequest::from_consumer_and_token($test_consumer, NULL, "GET", $url, NULL);
	$req_req->sign_request($sig_method, $test_consumer, NULL);
	$a=stream_get_contents(fopen($req_req,'rb'));
	var_dump($a);

} catch (OAuthException $e) {
	print($e->getMessage() . "\n<hr />\n");
	print_r($req);
	die();
}

?>

```


# Additional resources #

You may find the following third-party documents useful:

  * [The OAuth 1.0 Protocol](http://tools.ietf.org/html/rfc5849)
  * [Reference Implementations](http://code.google.com/p/oauth/)
  * [Beginner’s Guide to OAuth - Part I: Overview](http://www.hueniverse.com/hueniverse/2007/10/beginners-guide.html)
  * [Beginner’s Guide to OAuth - Part II : Protocol Workflow](http://www.hueniverse.com/hueniverse/2007/10/beginners-gui-1.html)
  * [Beginner’s Guide to OAuth - Part III : Security Architecture](http://www.hueniverse.com/hueniverse/2008/10/beginners-guide.html)
  * [Beginner’s Guide to OAuth - Part IV: Signing Requests](http://www.hueniverse.com/hueniverse/2008/10/beginners-gui-1.html)
  * [How to Build an OAuth Consumer](http://blog.andydenmark.com/2009/03/how-to-build-oauth-consumer.html)