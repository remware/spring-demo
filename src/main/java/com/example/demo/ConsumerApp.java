package com.example.demo;


public class ConsumerApp implements Consumer{

    private MessageService service;

    public ConsumerApp(MessageService messageService){
        this.service=messageService;
    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}
