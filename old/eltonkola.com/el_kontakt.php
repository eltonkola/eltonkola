<?php
//dergoj nje email
//if ($_SERVER["HTTP_REFERER"] == "http://www.eltonkola.com/index.php" || $_SERVER["HTTP_REFERER"] == "http://www.eltonkola.com/" || $_SERVER["HTTP_REFERER"] == "http://www.eltonkola.com/m/index.php" || $_SERVER["HTTP_REFERER"] == "http://www.eltonkola.com/m/") {

/*
	$emailTo = 'eltonkola@gmail.com';
	$body = "Emri: $emri \n\nEmail: $emaili \n\nSubjekti: $subjekti \n\nMesazhi:\n $mesazhi \n";
	$headers = 'From: My Site <'.$emailTo.'>' . "\r\n" . 'Reply-To: ' . $email;
	mail($emailTo, $subject, $body, $headers);
	$emailSent = true;
*/

$emri = $_POST['emri'];
$emaili = $_POST['emaili'];
$mesazhi = $_POST['mesazhi'];
$subjekti = $_POST['subjekti'];


// costruiamo alcune intestazioni generali
$header = "From: Elton Kola <kontakt@eltonkola.com>\n";
$header .= "CC: Elton Kola <eltonkola@gmail.com>\n";
$header .= "X-Mailer: eKola\n";

// generiamo la stringa che funge da separatore
$boundary = "==String_Boundary_x" .md5(time()). "x";

// costruiamo le intestazioni che specificano
// un messaggio costituito da più parti alternative
$header .= "MIME-Version: 1.0\n";
$header .= "Content-Type: multipart/alternative;\n";
$header .= " boundary=\"".$boundary."\";\n\n";

// questa parte del messaggio viene visualizzata
// solo se il programma non sa interpretare
// i MIME poiché è posta prima della stringa boundary
$messaggio = "Nese lexon kete tekst atehere programi yt nuk suporton MIME-t\n\n";

// inizia la prima parte del messaggio in testo puro
$messaggio .= "--".$boundary."\n";
$messaggio .= "Content-Type: text/plain; charset=\"iso-8859-1\"\n";
$messaggio .= "Content-Transfer-Encoding: 7bit\n\n";
$messaggio .= "Emri: ". $emri ." \n\nEmail: ".$emaili ."\n\nSubjekti: ".$subjekti." \n\nMesazhi:\n ".$mesazhi." \n";

// inizia la seconda parte del messaggio in formato html
$messaggio .= "--".$boundary."\n";
$messaggio .= "Content-Type: text/html; charset=\"iso-8859-1\"\n";
$messaggio .= "Content-Transfer-Encoding: 7bit\n\n";


$messaggio .= '<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8"><title>kontakt nga eltonkola.com</title>';
$messaggio .= '<style type="text/css" media="screen">body{background-color:#f5f6f4;margin:0;padding:0;}a img{border: none;}a{border: none;}.header{background-color:#353535;}.header h1{font-family: Georgia;font-size:32px;font-weight: normal;color:#bfbfbf;display: inline;text-align: left;}.date h3{font-family: Georgia;font-size:14px;color:#bfbfbf;font-weight: normal;text-align: right;display: inline;font-style: italic;}.body{background-color:#ffffff;}td.sidebar{padding:22px 0 0 0;}.sidebar h2{font-family: Georgia;font-size:18px;font-weight:bold;color:#808080;margin:0 0 6px 4px;padding:0;text-align: left;}.sidebar h2.issue{color:#000000;margin:0 0 10px 10px;}.sidebar ul{font-family: Georgia;font-size:12px;color:#2679b9;margin:0 0 0 24px;padding:0;text-align: left;}.sidebar ul a{font-family: Georgia;font-size:12px;color:#2679b9;font-style: italic;}.sidebar ul li{margin:0 0 10px 0;}.sidebar p{font-family: "Lucida Grande";font-size:11px;color:#5f5f5f;padding:0;margin:0 0 10px 0;text-align: left;}td.sidebg{background-color:#f1f1f1;padding:10px 16px 10px 16px;}td.mainbar{padding:22px 0 0 14px;text-align: left;}.mainbar p{font-family: "Lucida Grande";font-size:12px;color:#333333;margin:0 0 10px 0;text-align: left;}.mainbar p.first{margin-top:10px;}.mainbar h2{font-family: "Lucida Grande";font-size:16px;color:#000000;text-transform: uppercase;margin:10px 0 16px 0;}.mainbar h2 a{font-family: "Lucida Grande";font-size:16px;color:#000000;text-transform: uppercase;text-decoration: none;font-style: normal;}.mainbar a{font-family: Georgia;font-size:13px;color:#2679b9;font-style: italic;}.mainbar a.center{font-size:12px;text-align:center;display:block;color:#999999;padding:8px 0 12px 0;text-decoration: none;}.mainbar img.inline{border:1px solid #dedede;padding:4px;}td.footer{padding:0 0 10px 0;border-top:2px solid #ededed;}.footer p{color:#a1a1a1;font-size:11px;margin:0;padding:0;}.footer p.first{margin:14px 0 0 0;}.footer a{font-family: "Lucida Grande";font-size:11px;color:#2679b9;}</style>';
$messaggio .= '</head><body><a name="top" id="top"></a><table width="100%" cellspacing="0" cellpadding="0" bgcolor="#f5f6f4"><tr><td align="center"><table width="600" cellspacing="0" cellpadding="0"><tr><td height="77" align="left" class="header"><table width="600" border="0" cellspacing="0" cellpadding="0"><tr><td><img src="http://www.eltonkola.com/images/mail/header.gif" width="600" height="77" alt="eltonkola.com"></td></tr></table></td></tr></table></td></tr><tr><td align="center"><table width="600" cellspacing="10" cellpadding="0" class="body"><tr><td align="center" valign="top" class="mainbar" align="left">';
$messaggio .= '<p>Nga: ' .$emri . ' [<a href="mailto:' . $emaili  . '">' . $emaili  . '</a>], date: ' . date ("d-m-Y H:i:s", mktime(12,13,7,1,1,2007)) . ' , ip: ' . $_SERVER['REMOTE_ADDR'] . ' , referer: ' . $_SERVER["HTTP_REFERER"]  . ' <br /></p>';
$messaggio .= '<repeater><img src="http://www.eltonkola.com/images/mail/hr-large.gif" width="560" height="27" alt="Hr">';
$messaggio .= '<h2>Subjekti: ' . $subjekti .' </h2>Mesazhi: ' . $mesazhi .'  ';
$messaggio .= '<br><br><a href="#top" class="center">Shko lart^</a></repeater></td></tr><tr><td align="center"><table width="560" border="0" cellspacing="0" cellpadding="0"><tr><td class="footer" align="left"><p class="first">Mail i derguar automatikisht nga <span style="color: #000000;">eltonkola.com</span>.</p><p><a href="http://www.eltonkola.com" target="_blank">http://www.eltonkola.com</a></p></td></tr></table></td></tr></table></td></tr></table></body></html>';


// chiusura del messaggio con la stringa boundary
//$messaggio .= "--".$boundary."--\n";

$subject = "kontakt i ri nga siti juaj eltonkola.com";

if( @mail("eltonkola@gmail.com", $subject, $messaggio, $header) ) echo "e-mail u dergua me sukses!";
else echo "gabim ne dergimin e mailit!";

	
//}
?>