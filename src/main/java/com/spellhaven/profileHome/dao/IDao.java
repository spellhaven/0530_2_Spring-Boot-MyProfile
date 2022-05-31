package com.spellhaven.profileHome.dao;

import com.spellhaven.profileHome.dto.MemberDto;

public interface IDao {
	
	
	// 멤버 가입 관련 DAO 메서드들
	public void joinDao(String mid, String mpw, String mname, String memail); // 회원 가입 메서드. 컨트롤러에 join()이라는 함수가 이미 있어서 넌 이렇게 ㅎㅌㅊ 같은 이름을 받는단다.
	public int checkIdDao(String mid); // 회원가입 시 기존 아이디 존재 여부 체크, 로그인 시 아이디 존재 여부 체크
	public int checkPwDao(String mid, String mpw); //로그인 시 아이디 비번 일치 여부 체크
	public MemberDto loginInfoDao(String mid); // 로그인한 회원의 모든 정보를 DB에서 가져옴
	
	// 질문게시판 관련 DAO 메서드들
	
	
	
	
}
