package com.example.ex15;

public class MemberService {

	boolean login(String id, String ps) {
		if(id.equals("hong")&&ps.equals("12345"))
			return true;
		
		return false;
	}
	
	void logout(String id) {
		System.out.println("logout");
	}
}
