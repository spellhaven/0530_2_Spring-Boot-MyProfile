/**
 * 
 */
 
 function joinCheck() {
	
	if(document.reg_frm.mid.value.length == 0) {
		alert("아이디는 필수 입력 사항입니다.");
		reg_frm.mid.focus();
		return;
	}
	
	if(document.reg_frm.mid.value.length < 4) {
		alert("아이디는 최소 4글자 이상 입력해 주세요 ㅋ");
		reg_frm.mid.focus();
		return;
	}
	
	if(document.reg_frm.mpw.value.length == 0) {
		alert("비밀번호는 필수 입력 사항입니다.");
		reg_frm.mpw.focus();
		return;
	}
	
	if(document.reg_frm.mpw_check.value.length == 0) {
		alert("비밀번호 체크는 필수 입력 사항입니다.");
		reg_frm.mpw_check.focus();
		return;
	}
	
	if(document.reg_frm.mpw.value != document.reg_frm.mpw_check.value) {
		alert("비밀번호와 비밀번호 확인이 일치하지 않는디, 크킄");
		reg_frm.mpw_check.focus();
		return;
	}
	
		if(document.reg_frm.mname.value.length == 0) {
		alert("느그는 이름이 없니");
		reg_frm.mname.focus();
		return;
	}
	
		if(document.reg_frm.email.value.length == 0) {
		alert("이메일은 필수 입력 사항이야 븅아 ㅋ");
		reg_frm.email.focus();
		return;
	}
	
	document.reg_frm.submit();
	
}