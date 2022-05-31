package com.spellhaven.profileHome.dao;

public interface IDao {
	
	
	// 멤버 가입 관련 DAO 메서드들
	public void joinDao(String mid, String mpw, String mname, String memail); // 회원 가입 메서드. 컨트롤러에 join()이라는 함수가 이미 있어서 넌 이렇게 ㅎㅌㅊ 같은 이름을 받는단다.
	public int checkIdDao(String mid); // 회원가입 시 이미 가입된 아이디인지 아닌지 알려 주는 메서드. 0(않가입됬) 또는 1(이미 가입됬;;)을 반환한다.
	
	// 질문게시판 관련 DAO 메서드들
	
	
	
	
}
