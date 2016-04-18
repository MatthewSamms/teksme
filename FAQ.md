<font size='4'><b>FAQ</b></font>



# Authentication #

## I am trying to authenticate but I am getting a ` timestamp_refused ` when requesting a token. ##

Error: oauth\_problem=timestamp\_refused&oauth\_acceptable\_timestamps=1297740444-1297741044

This means that your system clock is not in sync with our API servers by 5 minutes or more. The timestamp we give you indicates the range of times we would be expecting from you in your oauth\_timestamp field. We also return the time to you in the body of the error message.

We recommend using a stable NTP server to keep your clock in sync with us.

You can play around a little bit here: http://www.epochconverter.com/





