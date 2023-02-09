var cili=null;
function resizePanel() {

	width = $(window).width();
	height = $(window).height();

	mask_width = width * $('.faqe').length;
		
	//$('#debug').html(width  + ' ' + height + ' ' + mask_width);
		
	$('#mbajtes, .faqe').css({width: width, height: height});
	$('#mask').css({width: mask_width, height: height});
	$('#mbajtes').scrollTo($('a.selected').attr('href'), 0);
		
}

function init(){


$('a.panel').click(function () {


			$('a.panel > div.menu_buton').removeClass('menu_buton_lart');
			$('a.panel > div.menu_buton').addClass('menu_buton_poshte');
			
			$('div.menu_buton',this).addClass('menu_buton_lart');
			cili=$('div.menu_buton',this);
			
			//cili=$(this);
			current = $(this);
			$('#mbajtes').scrollTo($(this).attr('href'), 800);		
			return false;
		});
		
		
		$(window).resize(function () {
			resizePanel();
		});
		
		
		

//logoja poshte 
		
$('#bishti_logo').animate({
	opacity: 0.5,
	filter: 'alpha(opacity=50)'
}, 100 ); 
	
		
$('#bishti_logo').mouseover(function(){
	$('#bishti_logo').removeClass('logo_normal');
	$('#bishti_logo').addClass('logo_lart');
	$('#bishti_logo').animate({
		opacity: 1,
		filter: 'alpha(opacity=100)'
	}, 300 ); 
});

$('#bishti_logo').mouseout(function(){
	$('#bishti_logo').removeClass('logo_lart');
	$('#bishti_logo').addClass('logo_normal');
	$('#bishti_logo').animate({
		opacity: 0.6,
		filter: 'alpha(opacity=60)'
	}, 300 ); 
});



//made in albania poshte


$('#bishti_mda').animate({
	opacity: 0.5,
	filter: 'alpha(opacity=50)'
}, 100 ); 
	
		
$('#bishti_mda').mouseover(function(){
	$('#bishti_mda').removeClass('mda_normal');
	$('#bishti_mda').addClass('mda_lart');
	$('#bishti_mda').animate({
		opacity: 1,
		filter: 'alpha(opacity=100)'
	}, 300 ); 
});

$('#bishti_mda').mouseout(function(){
	$('#bishti_mda').removeClass('mda_lart');
	$('#bishti_mda').addClass('mda_normal');
	$('#bishti_mda').animate({
		opacity: 0.5,
		filter: 'alpha(opacity=50)'
	}, 300 ); 
});

//butonat e gjuhes

$('#gjuha1').mouseover(function(){
	$(this).animate({
		opacity: 1,
		filter: 'alpha(opacity=100)'
	}, 300 ); 
});

$('#gjuha1').mouseout(function(){
	$(this).animate({
		opacity: 0.5,
		filter: 'alpha(opacity=50)'
	}, 300 ); 
});

$('#gjuha2').mouseover(function(){
	$(this).animate({
		opacity: 1,
		filter: 'alpha(opacity=100)'
	}, 300 ); 
});

$('#gjuha2').mouseout(function(){
	$(this).animate({
		opacity: 0.5,
		filter: 'alpha(opacity=50)'
	}, 300 ); 
});

$('#gjuha3').mouseover(function(){
	$(this).animate({
		opacity: 1,
		filter: 'alpha(opacity=100)'
	}, 300 ); 
});

$('#gjuha3').mouseout(function(){
	$(this).animate({
		opacity: 0.5,
		filter: 'alpha(opacity=50)'
	}, 300 ); 
});
//menuja kryesore


$('.menu_buton').mouseover(function(){
	$(this).removeClass('menu_buton_poshte');
	$(this).addClass('menu_buton_lart');
});

$('.menu_buton').mouseout(function(){
var ky=$(this);



if( cili!= null  && cili.html() != ky.html()){
		$(this).removeClass('menu_buton_lart');
		$(this).addClass('menu_buton_poshte');
}

});

//ku jam ne fillim
cili=$('#index_link');



// galeria e portfoglio
				$('div.navigation').css({'width' : '346px', 'float' : 'left'});
				$('div.content').css('display', 'block');

				// Initially set opacity on thumbs and add
				// additional styling for hover effect on thumbs
				var onMouseOutOpacity = 0.67;
				$('#thumbs ul.thumbs li').opacityrollover({
					mouseOutOpacity:   onMouseOutOpacity,
					mouseOverOpacity:  1.0,
					fadeSpeed:         'fast',
					exemptionSelector: '.selected'
				});
			
				// Initialize Advanced Galleriffic Gallery
				var gallery = $('#thumbs').galleriffic({
					delay:                     2500,
					numThumbs:                 9,
					preloadAhead:              10,
					enableTopPager:            true,
					enableBottomPager:         true,
					maxPagesToShow:            7,
					imageContainerSel:         '#slideshow',
					controlsContainerSel:      '#controls',
					captionContainerSel:       '#caption',
					loadingContainerSel:       '#loading',
					renderSSControls:          true,
					renderNavControls:         true,
					playLinkText:              PLAY,
					pauseLinkText:             PLAUSE,
					prevLinkText:              '&lsaquo; ',
					nextLinkText:              '&rsaquo;',
					nextPageLinkText:          '&rsaquo;',
					prevPageLinkText:          '&lsaquo;',
					enableHistory:             false,
					autoStart:                 false,
					syncTransitions:           true,
					defaultTransitionDuration: 900,
					onSlideChange:             function(prevIndex, nextIndex) {
						// 'this' refers to the gallery, which is an extension of $('#thumbs')
						this.find('ul.thumbs').children()
							.eq(prevIndex).fadeTo('fast', onMouseOutOpacity).end()
							.eq(nextIndex).fadeTo('fast', 1.0);
					},
					onPageTransitionOut:       function(callback) {
						this.fadeTo('fast', 0.0, callback);
					},
					onPageTransitionIn:        function() {
						this.fadeTo('fast', 1.0);
					}
				});


	//akordioni i programimit
	$('#programimi-akordion').easyAccordion({ 
		autoStart: false, 
		slideInterval: 3000
	});

	
	//validimi i formit te kontaktit
		
	$('#kontakt-formi').submit(function() {
	  el_kontakt();
	  return false;
	});
	
	
	
	
	//ne fillim ikonat sociale ne index
	$('.social_linkz').animate({
			opacity: 0.5,
			filter: 'alpha(opacity=50)'
		}, 300 );
		
	//mouse lart
	$('.social_linkz').mouseover(function(){
		
		$(this).animate({
			opacity: 1,
			filter: 'alpha(opacity=100)'
		}, 300 ); 
	});
	//mousi iken nga lart..
	$('.social_linkz').mouseout(function(){
		$(this).animate({
			opacity: 0.5,
			filter: 'alpha(opacity=50)'
		}, 300 ); 
	});
	
	
}

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
	
	if(gabimet==''){
	
	try{
  
		$.ajax({
		   type: "POST",
		   url: "el_kontakt.php",
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
	

};
	
	