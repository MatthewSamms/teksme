# Introduction #

TèksMe platform exposes API's that enable application developers to interact with the XML data containers. It makes powerful functionality available to developers by exposing various features.The platform uses JBoss HornetQ as it's underlying Message Oriented Middleware (MoM) .

The HTTP Server API enables applications to communicate over HTTP without requiring any special infrastructure and it can be used for low or high-volume messaging. As HTTP is a means for relaying information, the HTTP API can be used with practically any web-service application. This is particularly useful for high-volume message sending.


# Methods #

CreatePoll

Endpoint URL: /createpoll

Testcase: [CreateMultipleChoicePollTest.java](http://code.google.com/p/teksme/source/browse/trunk/org.teksme.model.test/test/org/teksme/client/test/model/CreateMultipleChoicePollTest.java)

XML Request

```
<?xml version="1.0" encoding="ASCII"?>
<teks:Teks xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:teks="http://teksme.org/meta/1.0.0/teks" appId="128552450490126">
  <userProfile id="56f3d45cb6f14af22fee33245bf53b8e"/>
  <poll author="Fabiano Cruz" lastModified="2010-07-09T00:40:13.446-0400" id="406fb8e6-eb60-4803-875c-685c8d803203">
    <question xsi:type="teks:MultipleChoice" required="true" 
question="Which media helped establish mass marketing because they could target segments of the audience rather than geographic areas of distribution">
      <answer text="magazines and radio">
        <keyword key="1120" autoKeyword="false"/>
      </answer>
      <answer text="radio and newspapers">
        <keyword key="1121" autoKeyword="false"/>
      </answer>
      <answer text="newspapers and radio">
        <keyword key="1122" autoKeyword="false"/>
      </answer>
      <answer text="newspapers and television">
        <keyword key="1123" autoKeyword="false"/>
      </answer>
    </question>
  </poll>
</teks:Teks>

```


SendMessage

Endpoint URL: /sendmsg

Testcase: [CreateOutboundMsgTest.java](http://code.google.com/p/teksme/source/browse/trunk/org.teksme.model.test/test/org/teksme/client/test/model/CreateOutboundMsgTest.java)

XML Request

```
<?xml version="1.0" encoding="ASCII"?>
<teks:Teks xmlns:teks="http://teksme.org/meta/1.0.0/teks" appId="128552450490126">
  <userProfile id="56f3d45cb6f14af22fee33245bf53b8e"/>
  <outboundMessage timestamp="2010-07-09T00:45:14.816-0400" from="+1202172638716">
    <communicationChannel>SMS</communicationChannel>
    <communicationChannel>Twitter</communicationChannel>
    <communicationChannel>Email</communicationChannel>
    <textMessage text="Hello from TeksMe!"/>
    <recipient>+12028125643</recipient>
  </outboundMessage>
</teks:Teks>

```


CreateAccount

Endpoint URL: /createaccount

Testcase: [CreateAccountTest.java](http://code.google.com/p/teksme/source/browse/trunk/org.teksme.model.test/test/org/teksme/client/test/model/CreateAccountTest.java)

XML Request

```

<?xml version="1.0" encoding="ASCII"?>
<teks:Teks xmlns:teks="http://teksme.org/meta/1.0.0/teks">
  <account userName="patadams" firstName="Pat" lastName="Adams" email="pat@painting.com" country="USA" yearOfBirth="1928" gender="male"/>
</teks:Teks>

```