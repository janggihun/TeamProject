/**
 * 
 */

//회원가입, 로그인
$(document).ready(function() {
	$('#insertButton').on('click', function() {
		let userId = $('#userId').val();
		let userPw = $('#userPw').val();
		if(userId == '' || userId == null){
			alert("아이디를 적어주세요")
			return false
		}else if(userPw == '' || userPw == null){
			alert("비밀번호를 적어주세요")
			return false	
		}else{	
				
			return true;		
		}
	})
});






