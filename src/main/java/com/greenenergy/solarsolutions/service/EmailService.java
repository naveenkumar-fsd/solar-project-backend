package com.greenenergy.solarsolutions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendContactMail(String name, String email, String message) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("almifitness79@gmail.com"); // admin mail
        mail.setSubject("New Contact Message - Solar Website");

        mail.setText(
                "Name: " + name + "\n" +
                "Email: " + email + "\n\n" +
                "Message:\n" + message
        );

        mailSender.send(mail);
    }
}
