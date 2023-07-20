package com.example.ex15;

public class MemberServiceExample {

	public static void main(String[] args) {

		MemberService mb = new MemberService();
		
		boolean result = mb.login("hong","12345");
		
		if(result) {  // result가 true면 
			System.out.println("로그인되었습니다.");
			mb.logout("hong");
		}else
			System.out.println("id 또는 password가 올바르지 않습니다. ");
	}

}
