<!doctype html>
<?php

//kontrolloj versionin

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
	require('../it.php');
}else if ($gjuha=='us'){
	require('../en.php');
}else{
	require('../al.php');
}
//print 'gjuha:'.$gjuha;
?>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>eltonkola.com/m</title>
        <style type="text/css" media="screen">@import "jqtouch/jqtouch.min.css";</style>
        <style type="text/css" media="screen">@import "themes/jqt/theme.min.css";</style>
        <script src="jqtouch/jquery.1.3.2.min.js" type="text/javascript" charset="utf-8"></script>
        <script src="jqtouch/jqtouch.min.js" type="application/x-javascript" charset="utf-8"></script>

<script type="text/javascript" charset="utf-8">

var KONTAKT_FALEMINDERIT= '<?php echo $KONTAKT_FALEMINDERIT; ?>';
var KONTAKT_GABIM= '<?php echo $KONTAKT_GABIM; ?>';
var KONTAKT_GABIM_EMRI= '<?php echo $KONTAKT_GABIM_EMRI; ?>';
var KONTAKT_GABIM_EMAILI= '<?php echo $KONTAKT_GABIM_EMAILI; ?>';
var KONTAKT_GABIM_TXT= '<?php echo $KONTAKT_GABIM_TXT; ?>';


            var jQT = new $.jQTouch({
                icon: 'jqtouch.png',
                addGlossToIcon: false,
                startupScreen: 'jqt_startup.png',
                statusBar: 'black',
                preloadImages: [
                    'themes/jqt/img/back_button.png',
                    'themes/jqt/img/back_button_clicked.png',
                    'themes/jqt/img/button_clicked.png',
                    'themes/jqt/img/grayButton.png',
                    'themes/jqt/img/whiteButton.png',
                    'themes/jqt/img/loading.gif'
                    ]
            });
            // Some sample Javascript functions:
            $(function(){
				/*
                $('a[target="_blank"]').click(function() {
                    if (confirm('This link opens in a new window.')) {
                        return true;
                    } else {
                        $(this).removeClass('active');
                        return false;
                    }
                });
				*/
                // Orientation callback event
                $('body').bind('turn', function(e, data){
                    $('#orient').html('Orientation: ' + data.orientation);
                });
            });
			
			
			
			
			
			
//funksion utilitar qe kontrollon nese emaili ehste i vlefshem

function echeck(str) {

		var at="@"
		var dot="."
		var lat=str.indexOf(at)
		var lstr=str.length
		var ldot=str.indexOf(dot)
		if (str.indexOf(at)==-1){
		    return false
		}
		if (str.indexOf(at)==-1 || str.indexOf(at)==0 || str.indexOf(at)==lstr){
		    return false
		}
		if (str.indexOf(dot)==-1 || str.indexOf(dot)==0 || str.indexOf(dot)==lstr){
		     return false
		}
		 if (str.indexOf(at,(lat+1))!=-1){
		     return false
		 }
		 if (str.substring(lat-1,lat)==dot || str.substring(lat+1,lat+2)==dot){
		     return false
		 }
		 if (str.indexOf(dot,(lat+2))==-1){
		     return false
		 }
		 if (str.indexOf(" ")!=-1){
		     return false
		 }
 		 return true					
	}


//kontrolloj formin e bej nje submit me ajax
function el_kontakt(){

//alert('fx kontrolli');

	var emri = $("#emri").val();
	var emaili = $("#emaili").val();
	var mesazhi = $("#mesazhi").val();
	var subjekti = $("#subjekti").val();
	
	var gabimet='';
	if (emri == "") {
		gabimet= gabimet +'* '+ KONTAKT_GABIM_EMRI + '<br>';
		$("input#emri").select().focus();
    }
	if (emaili == "" || echeck(emaili)==false) {
		gabimet= gabimet +'* '+ KONTAKT_GABIM_EMAILI + '<br>';
		$("input#emaili").select().focus();
    }
	if (mesazhi == "") {
		gabimet= gabimet +'* '+ KONTAKT_GABIM_TXT + '<br>';
		$("input#mesazhi").select().focus();
    }
	
	$("#kontakt-gabim").html(gabimet);
	//alert('gabimet:' + gabimet);
	if(gabimet==''){
	
	try{
  
		$.ajax({
		   type: "POST",
		   url: "../el_kontakt.php",
		   data: "emri=" + emri + "&emaili=" + emaili + "&subjekti=" + subjekti  + "&mesazhi=" + mesazhi,
		   success: function(msg){
			//pastro formin
			//link te faqja e pare
			//alert thankz
			 alert(KONTAKT_FALEMINDERIT);
		   }
		 });
		 
		}catch(err){
			alert(KONTAKT_GABIM);
		}
 
	}
	

}


function normal(){
window.location = "http://www.eltonkola.com/index.php?v=normal";
}

        </script>
        <style type="text/css" media="screen">
            body.fullscreen #home .info {
                display: none;
            }
            #kontakt-gabim{	
				color:red;
			}
        </style>
    </head>
    <body>
		
		<!-- faqja index -->
        <div id="home" class="current">
            <div class="toolbar">
                <h1>Elton Kola</h1>
            </div>
            <ul class="rounded">
                <li class="arrow"><a href="#kush"><?php echo $MENU_HOME_TXT; ?></a> <small class="counter">1</small></li>
                <li class="arrow"><a href="#webdesign"><?php echo $MENU_WEBDESIGN_TIT; ?></a> <small class="counter">1</small></li>
                <li class="arrow"><a href="#programim"><?php echo $MENU_PROGRAMMING_TIT; ?></a> <small class="counter">3</small></li>
                <li class="arrow"><a href="#PORTFOLIO"><?php echo $MENU_PORTFOLIO_TIT; ?></a> <small class="counter"><?php echo count($PORTFOLIO_TITULLI); ?></small></li>
                <li class="arrow"><a href="#kontakt"><?php echo $MENU_KONTAKT_TIT; ?></a> <small class="counter">1</small></li>

            </ul>
            <h2><?php echo $INDEX_SOCIAL; ?></h2>
            <ul class="rounded">
             
			    <li class="forward"><a href="http://www.facebook.com/eltonkola" target="_blank"><img src="../images/social/facebook.png"/> Facebook</a></li>
				<li class="forward"><a href="http://it.linkedin.com/in/eltonkola"  target="_blank"><img src="../images/social/linkedin.png"/> Linkedin</a></li>
				<li class="forward"><a href="http://www.twitter.com/eltonkola"  target="_blank"><img src="../images/social/twitter.png"/> Twitter</a></li>
				<li class="forward"><a href="http://www.youtube.com/eltonkola"  target="_blank"><img src="../images/social/youtube.png"/> Youtube</a></li>
				<li class="forward"><a href="http://www.flickr.com/people/31289531@N00/"  target="_blank"><img src="../images/social/flickr.png"/> Flickr</a></li>
				<li class="forward"><a href="http://www.eltonkola.com/blog"  target="_blank"><img src="../images/social/feed.png"/> Blog</a></li>
				<li class="forward"><a href="mailto:eltonkola@gmail.com"   ><img src="../images/social/email.png"/> Email</a></li>
				
			
			</ul>
			<h2>Lang:</h2>
            <ul class="rounded">
                <li class="forward"><a href="index.php?l=us" ><img src="../images/us.png"/> English </a></li>
                <li class="forward"><a href="index.php?l=it" ><img src="../images/it.png"/> Italiano </a></li>
                <li class="forward"><a href="index.php?l=al" ><img src="../images/al.png"/> Shqip </a></li>
            </ul>
			<h2>Ver:</h2>
            <ul class="rounded">
                <li class="forward" ><a onclick="normal();" href="#" > Normal </a></li> 
            </ul>
            <div class="info">
                <p>eltonkola.com mobile</p>
            </div>
        </div>
		
		<!-- faqja kush jam-->
		
		<div id="kush">
            <div class="toolbar">
                <h1><?php echo $MENU_HOME_TXT; ?></h1>
                <a class="back" href="#">Home</a>
            </div>

           <div class="info">
                <p><?php echo $INDEX_TXT; ?></p>
            </div>
        </div>
		
		<!-- faqja webdesign-->
		
		<div id="webdesign">
            <div class="toolbar">
                <h1><?php echo $WEBDESIGN_TITULLI; ?></h1>
                <a class="back" href="#">Home</a>
            </div>

           <div class="info">
                <p><?php echo $WEBDESIGN_TXT; ?></p>
            </div>
        </div>
		
		<!-- faqja programim -->
		
		 <div id="programim">
            <div class="toolbar">
                <h1><?php echo $MENU_PROGRAMMING_TIT; ?></h1>
                <a href="#" class="back">Home</a>
            </div>
            <ul class="rounded">
                <li class="arrow"><a href="#skillet"><?php echo $PROGRAMMING_TITULLI[0]; ?></a> <small class="counter">1</small></li>
                <li class="arrow"><a href="#social"><?php echo $PROGRAMMING_TITULLI[1]; ?></a> <small class="counter">1</small></li>
                <li class="arrow"><a href="#android"><?php echo $PROGRAMMING_TITULLI[2]; ?></a> <small class="counter">1</small></li>
            </ul>
        </div>
		
		<!-- faqja skillet-->
		
		<div id="skillet">
            <div class="toolbar">
                <h1><?php echo $PROGRAMMING_TITULLI[0]; ?></h1>
                <a class="back" href="#"> << </a>
            </div>

           <div class="info">
                <p><?php echo $PROGRAMMING_TXT[0]; ?></p>
            </div>
        </div>
		
		<!-- faqja skillet-->
		
		<div id="social">
            <div class="toolbar">
                <h1><?php echo $PROGRAMMING_TITULLI[1]; ?></h1>
                <a class="back" href="#"> << </a>
            </div>

           <div class="info">
                <p><?php echo $PROGRAMMING_TXT[1]; ?></p>
            </div>
        </div>
		
		
		<!-- faqja android-->
		
		<div id="android">
            <div class="toolbar">
                <h1><?php echo $PROGRAMMING_TITULLI[2]; ?></h1>
                <a class="back" href="#"> << </a>
            </div>

           <div class="info">
                <p><?php echo $PROGRAMMING_TXT[2]; ?></p>
            </div>
        </div>
		
		<!-- faqja PORTFOLIO-->
		
		<div id="PORTFOLIO">
            <div class="toolbar">
                <h1><?php echo $MENU_PORTFOLIO_TIT; ?></h1>
                <a class="back" href="#"> << </a>
            </div>

			<ul class="rounded">
     
				<?php for ($i=0;$i<count($PORTFOLIO_TITULLI);$i++){ ?>
				
				<li><a href="#" ><?php echo $PORTFOLIO_TITULLI[$i]; ?></a></li>
					<div class="info">
						<p><?php echo $PORTFOLIO_TXT[$i]; ?><br>
						<a href="../<?php echo $PORTFOLIO_FOTO[$i]; ?>" target="_blank" title="<?php echo $PORTFOLIO_TITULLI[$i]; ?>">
									<img src="../<?php echo $PORTFOLIO_IKONA[$i]; ?>" alt="<?php echo $PORTFOLIO_TITULLI[$i]; ?>" />
						</a>
						</p>
					</div>
				<?php } ?>
						
            </ul>
			
        </div>
		
		<!-- faqja kontakt -->
		
		<div id="kontakt">
            <div class="toolbar">
                <h1><?php echo $KONTAKT_TITULLI; ?></h1>
                <a href="#" class="back">Home</a>
            </div>
			 <div class="info">
                <p><?php echo $KONTAKT_TXT; ?></p>
            </div>
			<div id="kontakt-gabim" class="info"></div>
            <form class="form">
                <ul class="edit rounded">
                    <li><input type="text" name="emri" placeholder="<?php echo $KONTAKT_EMRI; ?>" id="emri" /></li>
                    <li><input type="text" name="emaili" placeholder="<?php echo $KONTAKT_EMAILI; ?>" id="emaili" /></li>
                    <li><input type="text" name="subjekti" placeholder="<?php echo $KONTAKT_SUBJEKTI; ?>" id="subjekti"  /></li>
                    <li><textarea id="mesazhi" placeholder="<?php echo $KONTAKT_MESAZHIJUAJ; ?>" ></textarea></li>
                    <a style="margin:0 10px;color:rgba(0,0,0,.9)" href="#" onclick="el_kontakt();" class="submit whiteButton"><?php echo $KONTAKT_DERGO; ?></a>
                </ul>
            </form>
        </div>
		
		
		
		
<script type="text/javascript">
//analitiks
  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-2922212-2']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>


    </body>
</html>