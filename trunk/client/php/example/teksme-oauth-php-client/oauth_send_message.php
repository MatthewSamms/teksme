<?php
require_once("./library/OAuth.php");

$key = '675hvytrfp5sd5v7yd6cp3uj'; // fill with your public key 
$secret = '6BU4893qXN'; // fill with your secret key
$token = "b2734ac4f33e0d3c038f13196016e538";
$token_secret = "dddae6d334ba02be6c3ef5dac761321e";
$url = "http://97.107.129.138:8089/sendmsg"; // fill with the url for the oauth service

$hmac_method = new OAuthSignatureMethod_HMAC_SHA1();
$sig_method = $hmac_method;

try {

	$test_consumer = new OAuthConsumer($key, $secret, NULL);

	$test_token = new OAuthConsumer($token, $token_secret);

	$params = array('from' => "+12376487628", 'to' => "+12028129412", 'channel' => "SMS", 'shout' => "TeksMe: an open-source cloud-based communications service/platform!TeksMe: an open-source cloud-based communications service/platform!TeksMe: an open-source cloud-based communications service/platform!TeksMe: an open-source cloud-based communications service/platform! ", 'routing' => "BULKSMS");

	$acc_req = OAuthRequest::from_consumer_and_token($test_consumer, $test_token, "GET", $url, $params);
	$acc_req->sign_request($sig_method, $test_consumer, $test_token);

	$a=stream_get_contents(fopen($acc_req,'rb'));
	var_dump($a);

} catch (OAuthException $e) {
	print($e->getMessage() . "\n<hr />\n");
	print_r($req);
	die();
}

?>
