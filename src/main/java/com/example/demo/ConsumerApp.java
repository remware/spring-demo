package com.example.demo;


public class ConsumerApp implements Consumer{

    private MessageService service;

    public ConsumerApp(MessageService messageService){
        this.service=messageService;
    }

    // setter way of dependency injection
    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}
