# API Error Codes #

The following table lists TèksMe error codes.

| **Error Code** | **Internal Error Short Code** | **Description** | **HTTP Status Code** |
|:---------------|:------------------------------|:----------------|:---------------------|
| 4221           | COULD\_NOT\_PARSE\_REQUEST    | Could not parse request string. | 422                  |
| 4222           | INVALID\_ASSOCIATED\_XML\_SCHEMA | Specified file was not a valid XML schema. | 422                  |
|  4091          | MISSING\_REQUIRED\_XML\_ELEMENT | The required XML element {0} was not specified on the request. Please make sure all required elements are included. | 409                  |
| 4092           | XML\_SYNTACTICALLY\_INCORRECT |  The specified XML is not syntactically valid. | 409                  |
| 4093           | INVALID\_XML\_ELEMENT         |  The XML element {0} specified in the request body is not supported. | 409                  |
| 4094           | INVALID\_ROOT\_ELEMENT        | Invalid root element. The markup in the document following the root element must be well-formed. | 409                  |
| 4095           | ATTR\_MUST\_BE\_FOLLOWED\_BY\_EQUALS\_SIG | Attribute name {0} associated with an element type {1} must be followed by the ' = ' character. | 409                  |
| 4096           | MISSING\_ATTR\_QUOTES         | Open quote is expected for attribute {0}. | 409                  |
| 4097           | ATTR\_VALUE\_CANNOT\_CONTAIN\_OPEN\_TAG\_SYMBOL | The value of attribute {0} associated with an element type {1} must not contain the '<' character. | 409                  |
| 4098           | INVALID\_XML\_ELEMENT\_TAG\_DECLARATION | The XML element {0} must be followed by either attribute specifications, '>' or '/>'. | 409                  |
| 4099           | REQUIRED\_XML\_ELEMENT\_OUT\_OF\_RANGE | The XML element {0} with {1} value(s) must have at least {2} value(s). | 409                  |
| 40910          | XML\_CLOSING\_TAG\_IS\_MISSING |  XML document structures must start and end within the same entity. Make sure there is a closing tag. | 409                  |
| 40911          | MISSING\_XML\_ELEMENT\_MATCHING\_END\_TAG | The element type {0} must be terminated by the matching end-tag {1}. | 409                  |
| 40912          | INVALID\_XML\_BEGINNING\_ELEMENT | Content is not allowed in prolog. Invalid XML content in the beginning element. | 409                  |
| 4001           | EMPTY\_REQUEST\_BODY          | Request body is empty. | 400                  |
| 4002           | CONTENT\_LENGTH\_NOT\_SPECIFIED | Number of bytes was not specified in the Content-Length HTTP header. | 400                  |
| 4003           | MALFORMED\_XML\_FILE          | XML was not well-formed. Premature end of file. | 400                  |
| 4004           | WRONG\_BOF\_XML\_DECLARATION  | XML declaration must be right at the beginning of the file. | 400                  |
| 4005           | REQUIRED\_HTTP\_HEADER\_NOT\_FOUND | A required HTTP header was not specified. | 400                  |
| 4006           | MALFORMED\_HTTP\_HEADER       | Headers are incorrectly formatted. | 400                  |
| 4151           | INVALID\_CONTENT\_TYPE        | Unsupported Content-Type: {0} Supported ones are: `[`application/xml, text/xml`]` | 415                  |
| 5001           | INTERNAL\_SERVICE\_ERROR      | Request could not be executed due to an internal service error. | 500                  |

<p>
<font size='2'> <b>HTTP Status code: 422 Unprocessable Entity</b>: means the server understands the content type of the request entity (hence a 415(Unsupported Media Type) status code is inappropriate), and the syntax of the request entity is correct (thus a 400 (Bad Request) status code is inappropriate) but was unable to process the contained instructions.<br>
</font>
</p>

<p>
<font size='2'> <b>HTTP Status code: 409 Conflict </b>: The client has provided a value whose semantics are not appropriate for the property.<br>
</font>
</p>

<p>
<font size='2'> <b>HTTP Status code: 400 Bad Request</b>: If the server receives XML that is not well-formed, then the server MUST reject the entire request with a 400 (Bad Request). Also, since processing XML submitted by an untrusted source may cause risks connected to privacy, security, and service quality, the server will reject questionable requests (even though they consist of well-formed XML).<br>
</font>
</p>

