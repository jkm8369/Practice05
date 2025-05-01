package com.javaex.ex04;

public class BaseApp {

	//이 클래스의 코드는 수정하지 않습니다.
    public static void main(String args[]) {
        Base base = new Base();

        base.setService("낮");
        base.setService("밤");
        base.setService("오후");
        
        base.day();
        base.night();
        base.afternoon();
        
        
        
    }

}
