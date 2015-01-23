var currPageNo;
var maxPageNo;

$(function() {
	loadStyleList(1);

	$('#style-detail').on('click', function() {
		console.log('클릭');
		$.mobile.changePage('#styledetail', {
			dataUrl : "styledetail?styleno=2",
			data : {
				'styleno' : '2'
			},
			allowSamePageTransition : true,
			transition : 'none',
			showLoadMsg : false,
			reloadPage : true
		});
	})

	$(window).scroll(
			function() {
				if ($(window).scrollTop() >= $(document).height()
						- $(window).height() - 300) {
					loadStyleList(currPageNo);
				}
			})
	/* 스타일 페이지 로드 */

	/*
	 * $(window).scroll( function() { if ($(window).scrollTop() >=
	 * $(document).height() - $(window).height()-500) {
	 * loadStyleList(currPageNo); } console.log('--------------');
	 * console.log($(window).scrollTop()); console.log($(window).height());
	 * console.log($(document).height()); });
	 */

	$('#addbtn').on('click', function() {
		loadStyleList(currPageNo);
	})

	/* 스와이프 코드 */

	$("#page1").on("swipeleft", function(e) {
		$.mobile.changePage("#page2", {
			transition : "slide"
		});
	});

	$("#page2").on("swiperight", function(e) {
		$.mobile.changePage("#page1", {
			transition : "slide",
			reverse : true
		});
	});

})

function loadStyleList(pageNo) {
	if (pageNo <= 0)
		pageNo = 1;

	$.getJSON('../json/style/list.do?pageNo=' + pageNo, function(data) {
		console.log(data);
		var styleList = data.styleList;
		$('#styletemplate').load(
				'../templates/styletemplate.html',
				function() {
					if (data.status === 'success') {
						for (var i = 0; i < styleList.length; i++) {
							var source = $('#styletemplate').html();
							var template = Handlebars.compile(source);
							var html = template(styleList[i]);
							if ($('#content-section-1').outerHeight() <= $(
									'#content-section-2').outerHeight()) {
								$('#content-section-1').fadeIn().append(html);
							} else {
								$('#content-section-2').fadeIn().append(html);
							}
							$('#styletemplate').trigger('create');
						}
					}

				});
	});

	currPageNo = ++pageNo;
	console.log('다음페이지 : ' + currPageNo);

}

$(document).on("pagebeforeshow", ".page", function() {
	console.log('페이지 인잇');
})

$(document).on(		"pageinit",		"#styledetail",
		function() {
			console.log(location.href);

			$(function() {
				var mySwiper = new Swiper('.swiper-container', {
					mode : 'horizontal',
					loop : true,
					grabCursor : true
				})

				var url = location.href;
				var styleNo = url.split("=");

				$.getJSON('../json/style/styledetail.do?styleNo='+ styleNo[styleNo.length - 1], function(data) {
					$('#styletemplate').load('../templates/styledetailtemplate.html',
							function() {
								var source = $('#styletemplate').html();
								var template = Handlebars.compile(source);
								var html = template(data);
								$('#styledetail').append(html).trigger('create');

					});
				})
			})
		})
		
		
