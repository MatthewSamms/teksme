<?php
require_once("./library/OAuth.php");

$key = '675hvkhmkp5sd5v7yd6cp3uj'; // fill with your public key 
$secret = '6BU4893qXN'; // fill with your secret key
$url = "http://localhost:8080/oauth/login"; // fill with the url for the oauth service

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
