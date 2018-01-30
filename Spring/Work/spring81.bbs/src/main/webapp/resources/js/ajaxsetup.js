$(document).ajaxStart( function() {
	// 통신이 시작되기 전에 이 함수를 타게 된다.
	// beforeSend() 메서드와 같음
	$('body').prepend('<img src="/resources/images/loading.gif" />');
});

$(document).ajaxComplete( function(data, textStatus, xhr) {
	// 통신이 실패해도 성공해도 이 함수를 타게 된다.
	// done() 메서드와 같음
	$('body img[src$="loading.gif"]').remove();
	
});

$(document).ajaxError( function(xhr, textStatus, error ) {
	// 통신이 실패하였을 때 이 함수를 타게 된다.
	// fail() 메서드와 같음
	console.log(error);
	alert(error);
});