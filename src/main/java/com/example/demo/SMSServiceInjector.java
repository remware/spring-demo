package com.example.demo;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new ConsumerApp(new SMSService());
    }
}
