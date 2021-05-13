$(function(){
    function rescaleCaptcha(){
    var width = $('.g-recaptcha').parent().width();
    var scale;
    if (width < 440) {
        scale = width / 440;
    } else{
        scale = 1.5;
    }

    $('.g-recaptcha').css('transform', 'scale(' + scale + ')');
    $('.g-recaptcha').css('-webkit-transform', 'scale(' + scale + ')');
    $('.g-recaptcha').css('transform-origin', '0 0');
    $('.g-recaptcha').css('-webkit-transform-origin', '0 0');
}

    rescaleCaptcha();
    $( window ).resize(function() { rescaleCaptcha(); });

});