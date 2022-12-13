package com.javamaster.spring_crud.utils;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.Getter;
import lombok.Setter;

public class EnviarMensajeMSN {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC3b4c5412bf9dafc15734e4f908f633b9";
    public static final String AUTH_TOKEN = "189559ab6c8005e7a7d473b3b0ba5eb9";

    @Getter
    @Setter
    private String numeroMNS;

    @Getter
    @Setter
    private String numeroWhatsApp;

    public EnviarMensajeMSN(String numeroMNS) {
        this.numeroMNS = numeroMNS;
    }


    public void enviarMNS() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(getNumeroMNS()),
                new PhoneNumber("+19705571678"),
                "OSCAR TOMAS").create();

        System.out.println(message.getSid());
    }

    public void enviarWhatsApp(String numeroWhatsApp) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(numeroWhatsApp),
                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        "OSCAR TCZ")
                .create();


        System.out.println(message.getSid());
    }
    public void enviarWhatsApp() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber(getNumeroWhatsApp()),
                        new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        "OSCAR TCZ")
                .create();


        System.out.println(message.getSid());
    }


}
