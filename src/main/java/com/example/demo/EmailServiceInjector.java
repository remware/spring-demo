package com.example.demo;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new ConsumerApp(new EmailService());
    }
}
