package com.example.demo;

public class ApplicationServices {
    private EmailService email = null;

    public ApplicationServices(EmailService emailService){
        this.email=emailService;
    }

    public void processMessages(String msg, String rec) {
        //do some msg validation, manipulation logic etc
        this.email.sendMessage(msg, rec);
    }
}