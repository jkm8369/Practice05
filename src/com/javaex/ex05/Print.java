package com.javaex.ex05;

public class Print {
    
	//필드
	private int intNum;
	private boolean a;
	private double doubleNum;
	private String name;
	
	//생성자
	public Print() {
	}
	

	//메소드 gs
	public int getIntNum() {
		return intNum;
	}

	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}

	public boolean isA() {
		return a;
	}

	public void setA(boolean a) {
		this.a = true;
	}
	
	public double getDoubleNum() {
		return doubleNum;
	}

	public void setDoubleNum(double doubleNum) {
		this.doubleNum = doubleNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	//메소드  3개 를 작성하세요

	public void printer(int intNum){
        System.out.println(intNum);
    }
	
	public void printer(boolean a) {
		System.out.println(a);
	}

	public void printer(double doubleNum) {
		System.out.println(doubleNum);
	}
    
    public void printer(String name) {
    	System.out.println(name);
    }
}
