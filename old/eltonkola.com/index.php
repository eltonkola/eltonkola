<?php

//kontrolloj versionin

$ver=$_COOKIE["ver"];

if($ver=='' || $ver==null){
	$iphone = strpos($_SERVER['HTTP_USER_AGENT'],'iPhone');
	$android = strpos($_SERVER['HTTP_USER_AGENT'],'Android');
	$palmpre = strpos($_SERVER['HTTP_USER_AGENT'],'webOS');
	$ipod = strpos($_SERVER['HTTP_USER_AGENT'],'iPod');
	$skadnca=time()+60*60*24*365;
	if(!$iphone && !$android && !$palmpre && !$ipod) {
		//desktop
		$ver='normal';
		setcookie("ver", $ver, $skadnca);
		header( "Location: index.php" );
		exit;
	}else{
		//smartfon
		$ver='mobile';
		setcookie("ver", $ver, $skadnca);
		header( "Location: m/index.php" );
		exit;
	}
}

//link nderro versionin..

if(isset($_GET["v"])){

		$skadnca=time()+60*60*24*365;
		setcookie("ver", $_GET["v"], $skadnca);
		
		if($_GET["v"]=='normal'){
			header( "Location: index.php" );
			exit;
		}else{
			header( "Location: m/index.php" );
			exit;
		}
}





//1.kontrollo kuki per gjuhen, nese nuk eksiston ajo kryesorja ehste italiashtja (vendi ku jetoj)
$gjuha=$_COOKIE["gjuha"];
if($gjuha=='' || $gjuha==null){
	$gjuha='it';
	$skadnca=time()+60*60*24*365;
	setcookie("gjuha", $gjuha, $skadnca);
	header( "Location: index.php" );
	exit;
}
//2.nese kam kerkese te re gjuhe nderroj gjuhen, ruaj kuki,e redirekt te faqja serish

	if(isset($_GET["l"])){
		$gjuha=$_GET["l"];
		$skadnca=time()+60*60*24*365;
		setcookie("gjuha", $gjuha, $skadnca);
		header( "Location: index.php" );
		exit;
	}
//ketu di me siguri gjuhen, ndaj dhe bej includ ete failit te perkthimit te duhur
if($gjuha=='it'){
	require('it.php');
}else if ($gjuha=='us'){
	require('en.php');
}else{
	require('al.php');
}
//print 'gjuha:'.$gjuha;
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="it-IT"><HEAD><META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<META name="google-site-verification" content="vk">
<TITLE>Elton Kola - designin and coding my dreams</TITLE>
<META name="generator" content="elEdit 0.1">
<META name="description" content="elton kola, webdesigner, graphic design, programmer, web programmer, coder, mobile">
<META name="keywords" content="webdesigner, developer, designer">

<LINK rel="stylesheet" href="./css/galleriffic.css" type="text/css" media="screen">


<LINK rel="stylesheet" href="./css/stili.css" type="text/css" media="screen">



<LINK rel="shortcut icon" href="favicon.ico" type="image/x-icon">
<LINK rel="index" title="Elton Kola" href="http://www.eltonkola.com/">
<LINK rel="canonical" href="./index.php">

</HEAD>
<BODY >


<div id="mbajtes">


	<div id="mask">

	
		<div id="faqja1" class="faqe">
			<a name="faqja1"></a>
			<div class="kutia">
				<div class="majast_70 shkrim">
				<h1> <?php echo $INDEX_TITULLI; ?></h1>
				<p>
				 <?php echo $INDEX_TXT; ?>
				<br>
				<br>
				<?php if(isset($INDEX_LINK_OLD)){ ?>
				<a href="<?php echo $INDEX_LINK_URL; ?>" target="_blank"><?php echo $INDEX_LINK_OLD; ?></a>
				<?php } ?>
				<br>
				<br>
				<?php echo $INDEX_SOCIAL; ?>
				
				
				<a href="http://www.facebook.com/eltonkola" class="social_linkz" target="_blank"><img src="images/social/facebook.png"/></a>
				<a href="http://it.linkedin.com/in/eltonkola" class="social_linkz"  target="_blank"><img src="images/social/linkedin.png"/></a>
				<a href="http://www.twitter.com/eltonkola" class="social_linkz"  target="_blank"><img src="images/social/twitter.png"/></a>
				<a href="http://www.youtube.com/eltonkola" class="social_linkz"  target="_blank"><img src="images/social/youtube.png"/></a>
				<a href="http://www.flickr.com/people/31289531@N00/" class="social_linkz"  target="_blank"><img src="images/social/flickr.png"/></a>
				<a href="http://www.eltonkola.com/blog" class="social_linkz"  target="_blank"><img src="images/social/feed.png"/></a>
				<a href="mailto:eltonkola@gmail.com"  class="social_linkz" ><img src="images/social/email.png"/></a>
				
				
				</p>
				</div>
				<div class="djathtas_30">
					<div class="trupi_lart"><img src="<?php echo $INDEX_FOTO; ?>"  alt="<?php echo $INDEX_TITULLI; ?>"/></div>
					<div class="trupi_poshte">
						<a class="shkariko_but" href="<?php echo $INDEX_CV_URL; ?>" target="_blank"><?php echo $INDEX_DOWNLOAD_CV; ?></a>
					<br /><br />
					</div>
				</div>
			</div>
		</div>
		
		<div id="faqja2" class="faqe">
			<a name="faqja2"></a>
			<div class="kutia">
				<div class="majast_100 shkrim">
				<h1><?php echo $WEBDESIGN_TITULLI; ?></h1>
				<p>
				<img src="<?php echo $WEBDESIGN_FOTO; ?>" alt="<?php echo $WEBDESIGN_TITULLI; ?>" />
				<?php echo $WEBDESIGN_TXT; ?>
				</p>
				</div>
			</div>
		</div>
		
		<div id="faqja3" class="faqe">
			<a name="faqja3"></a>
			<div class="kutia">
				<div id="programimi-akordion">
					<dl>
					<?php for ($i=0;$i<count($PROGRAMMING_TITULLI);$i++){ ?>
						<dt><?php echo $PROGRAMMING_TITULLI_ANASH[$i]; ?></dt>
						<dd>
							<h2><?php echo $PROGRAMMING_TITULLI[$i]; ?></h2>
							<p>
							<img src="<?php echo $PROGRAMMING_FOTO[$i]; ?>" alt="<?php echo $PROGRAMMING_TITULLI_ANASH[$i]; ?>" />
							<?php echo $PROGRAMMING_TXT[$i]; ?>
							</p>
						</dd>
					<?php } ?>
					</dl>
				</div>
			</div>
		</div>

		<div id="faqja4" class="faqe">
			<a name="faqja4"></a>
			<div class="kutia">
				<div class="pading-faqe">
					<div id="gallery" class="content">
						<div id="controls" class="controls"></div>
						<div class="slideshow-container">
							<div id="loading" class="loader"></div>
							<div id="slideshow" class="slideshow"></div>
						</div>
						<div id="caption" class="caption-container"></div>
					</div>
					<div id="thumbs" class="navigation">
						<ul class="thumbs noscript">
						<?php for ($i=0;$i<count($PORTFOLIO_TITULLI);$i++){ ?>
							<li>
								<a class="thumb" name="drop" href="<?php echo $PORTFOLIO_FOTO[$i]; ?>" title="<?php echo $PORTFOLIO_TITULLI[$i]; ?>">
									<img src="<?php echo $PORTFOLIO_IKONA[$i]; ?>" alt="<?php echo $PORTFOLIO_TITULLI[$i]; ?>" />
								</a>
								<div class="caption">
									<div class="image-title"><?php echo $PORTFOLIO_TITULLI[$i]; ?></div>
									<div class="image-desc"><?php echo $PORTFOLIO_TXT[$i]; ?></div>
								</div>
							</li>
						<?php } ?>
						</ul>
					</div>
				</div>
			</div>
		</div>
		
		
		
		<div id="faqja5" class="faqe">
			<a name="faqja1"></a>
			<div class="kutia">
			<div class="majast_100 shkrim">
				<h1><?php echo $KONTAKT_TITULLI; ?></h1>
				<p>
				<img src="<?php echo $KONTAKT_FOTO; ?>" alt="<?php echo $KONTAKT_TITULLI; ?>" />
				<?php echo $KONTAKT_TXT; ?>
				</p>
				<div class="formi-kontakt">		
				
				<!--
				<form action="#"  id="kontakt-formi"> 				
				<fieldset id="kontakt-detaje">	
					<label for="emri"><?php echo $KONTAKT_EMRI; ?></label>
					<input type="text" name="emri"  id="emri"  value="" /> 
					<label for="emaili"><?php echo $KONTAKT_EMAILI; ?></label> 
					<input type="email" name="emaili" id="emaili" value=""  /> 
					<label for="subjekti"><?php echo $KONTAKT_SUBJEKTI; ?></label> 
					<input type="text" name="subjekti" id="subjekti" value=""  /> 
				</fieldset>
				<fieldset id="kontakt-mesazhi">
					<label for="mesazhi"><?php echo $KONTAKT_MESAZHIJUAJ; ?></label> 
					<textarea name="mesazhi" id="mesazhi"  rows="0" cols="0"></textarea> 
					<a class="shkariko_but" href="javascript:el_kontakt();" ><?php echo $KONTAKT_DERGO; ?></a>
				</fieldset>
				</form>	
				-->
				
				<form action="http://www.bluehost.com/bluemail" enctype="multipart/form-data" method="POST">
					<input type="text" name="name" id="name" placeholder="Name" />
					<input type="text" name="email" id="email" placeholder="Email" required />
					<textarea name="message" id="message" placeholder="Message" required></textarea>


					<input type='hidden' name='cgiemail-mailopt' value='sync' />
					<input type="hidden" name="sendtoemail" value="eltonkola@gmail.com" />
					<input type="hidden" name="subject" value="eltonkola.com - Contact Form" />
					<input type="hidden" name="redirect" value="http://www.eltonkola.com/" />
					<input type="submit" value="Send Message" class="button form-button-submit" />
				</form>

				
				<div id="kontakt-gabim"></div>
				</div>
			</div>
		
			
			</div>
		</div>
	</div>
</div>	


<div id="lart">
	<div id="koka"> 
	<div id="logo"></div>
		<div id="menu">
			<div class="menu_majtas"></div>
				<a href="#faqja1" class="panel">
				<div id="index_link" class="menu_buton menu_buton_lart">
					<h1><?php echo $MENU_HOME_TIT; ?></h1><h2><?php echo $MENU_HOME_TXT; ?></h2>
				</div>	
				</a>	
			<div class="menu_mes"></div>
				<a href="#faqja2" class="panel">
				<div class="menu_buton">	
					<h1><?php echo $MENU_WEBDESIGN_TIT; ?></h1><h2><?php echo $MENU_WEBDESIGN_TIT; ?></h2>
				</div>	
				</a> 		
			<div class="menu_mes"></div>
				<a href="#faqja3" class="panel">
				<div class="menu_buton">	
					<h1><?php echo $MENU_PROGRAMMING_TIT; ?></h1><h2> <?php echo $MENU_PROGRAMMING_TXT; ?></h2>
				</div>	
				</a> 
			<div class="menu_mes"></div>
				<a href="#faqja4" class="panel">
				<div class="menu_buton">	
					<h1><?php echo $MENU_PORTFOLIO_TIT; ?></h1><h2><?php echo $MENU_PORTFOLIO_TXT; ?></h2>
				</div>	
				</a> 
			<div class="menu_mes"></div>
				<a href="#faqja5" class="panel">
				<div class="menu_buton">	
					<h1><?php echo $MENU_KONTAKT_TIT; ?></h1><h2><?php echo $MENU_KONTAKT_TXT; ?></h2>
				</div>		
				</a>
			<div class="menu_djathtas"></div>
			<div id="gjuha">
				<a href="index.php?l=al"><div id="gjuha1"><img src="images/al.png"/></div></a>
				<a href="index.php?l=us"><div id="gjuha2"><img src="images/us.png"/></div></a>
				<a href="index.php?l=it"><div id="gjuha3"><img src="images/it.png"/></div></a>
			</div>
		</div>
	</div>	
</div>	


<div id="poshte">
	<div id="bishti">
		<div id="bishti_logo" class="logo_normal"></div>
		<div id="bishti_txt">
			<?php echo $BISHTI_RRESHTI1; ?> - <a href="index.php?v=mobile">Mobile</a>
			<br>
			<div class="bishti_txt_gri">
			<?php echo $BISHTI_RRESHTI2; ?>
			</div>
		</div>
		<div id="bishti_mda" class="mda_normal"></div>
	</div>
</div>



<SCRIPT type="text/javascript" src="./js/jquery-1.3.2.min.js"></SCRIPT>
<SCRIPT type="text/javascript" src="./js/jquery.scrollTo.js"></SCRIPT>
<SCRIPT type="text/javascript" src="./js/jquery.opacityrollover.js"></SCRIPT>
<SCRIPT type="text/javascript" src="./js/jquery.galleriffic.js"></SCRIPT>
<SCRIPT type="text/javascript" src="./js/jquery.easyAccordion.js"></SCRIPT>

<SCRIPT type="text/javascript" src="./js/skript.js"></SCRIPT>
	
<SCRIPT type="text/javascript">

var KONTAKT_FALEMINDERIT= '<?php echo $KONTAKT_FALEMINDERIT; ?>';
var KONTAKT_GABIM= '<?php echo $KONTAKT_GABIM; ?>';
var KONTAKT_GABIM_EMRI= '<?php echo $KONTAKT_GABIM_EMRI; ?>';
var KONTAKT_GABIM_EMAILI= '<?php echo $KONTAKT_GABIM_EMAILI; ?>';
var KONTAKT_GABIM_TXT= '<?php echo $KONTAKT_GABIM_TXT; ?>';

var PLAY= '<?php echo $PLAY; ?>';
var PLAUSE= '<?php echo $PLAUSE; ?>';

	$(document).ready(function() {
		init();
	});
	
//analitiks	

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-2922212-2']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</SCRIPT>

</BODY>
</HTML>
