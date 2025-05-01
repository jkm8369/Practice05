package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member[] member = new Member[3];
		
		Member jws = new Member("회원정보", "정우성(jws)", 50000);
		Member yjs = new Member("회원정보", "유재석(yjs)", 30000);
		Member lhr = new Member("회원정보", "이효리(lhr)", 40000);
		
		member[0] = jws;
		member[1] = yjs;
		member[2] = lhr;
		
		for(int i=0; i<member.length; i++) {
			member[i].showInfo();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
