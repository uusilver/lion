// JavaScript Document
$(document).ready(function () {

  /* --- Opacity Effect --- */
  $('.products-list li, .about-list li')
    .mouseover(function () {
    $(this).siblings().css({
      opacity: 0.25
    })
  })
    .mouseout(function () {
    $(this).siblings().css({
      opacity: 1
    })
  });

  /* --- Active Switch --- */
  $(".tabbable .nav a, .products-filter a").click(function (e) {
    $(".tabbable .nav a, .products-filter a").removeClass("active");
    $(this).addClass("active");
    e.preventDefault();
  });

  /* --- Flex Slider --- */
  $(window).load(function () {
    $('.flexslider').flexslider({
      animation: "slide",
      slideshowSpeed: 3500,
      animationSpeed: 500,
      prevText: "<i class='icon-angle-left'></i>",
      nextText: "<i class='icon-angle-right'></i>"
    });
  });

  /* --- Fancybox --- */
  $(".view-fancybox").fancybox({
    openEffect: 'elastic',
    closeEffect: 'elastic',
	next: 'left',
	prev: 'right'
  });

  /* --- Masonry --- */
  var $container = $('#isotope');
  $container.imagesLoaded(function () {
    $container.isotope({
      itemSelector: '.item',
    });
  });
  $('#filters a').click(function () {
    var selector = $(this).attr('data-filter');
    $container.isotope({
      filter: selector
    });
    return false;
  });

  /* --- Scrollbar --- */
  var nice = $("html").niceScroll();

  /* --- toTop --- */
  $(window).scroll(function () {
    if ($(this).scrollTop() != 0) {
      $('#toTop').fadeIn();
    } else {
      $('#toTop').fadeOut();
    }
  });
  $('#toTop').click(function () {
    $('body,html').animate({
      scrollTop: 0
    }, 1000);
  });

  /* --- Change Color --- */
  $(".change-css").click(function() {
    $("#changeColor").attr({href : this.rel});
  });

});