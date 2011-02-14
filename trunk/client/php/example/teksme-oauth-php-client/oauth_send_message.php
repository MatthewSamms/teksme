<?php
require_once("./library/OAuth.php");

$key = '675hvkhmkp5sd5v7yd6cp3uj'; // fill with your public key 
$secret = '6BU4893qXN'; // fill with your secret key
$token = "e35e0fa592444c453e992b3a2c289729";
$token_secret = "3adcdf0a9f1c0785f87ad834b18853da";
$url = "http://api.teks.me/sendmsg"; // fill with the url for the oauth service

$hmac_method = new OAuthSignatureMethod_HMAC_SHA1();
$sig_method = $hmac_method;

try {

	$test_consumer = new OAuthConsumer($key, $secret, NULL);

	$test_token = new OAuthConsumer($token, $token_secret);

	$params = array('from' => "+12376487628", 'to' => "+12021112312", 'channel' => "SMS", 'shout' => "Hello from TeksMe!", 'gateway' => "BULKSMS");

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
