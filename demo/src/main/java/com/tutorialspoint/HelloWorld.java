package com.tutorialspoint;

/**
 * Created by xb on 2016/3/20.
 */
public class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.println("Your Message:"+message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }

    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
