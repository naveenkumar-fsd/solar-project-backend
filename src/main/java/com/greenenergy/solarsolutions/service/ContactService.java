package com.greenenergy.solarsolutions.service;

import com.greenenergy.solarsolutions.dto.ContactRequestDTO;
import com.greenenergy.solarsolutions.model.ContactMessage;
import com.greenenergy.solarsolutions.repository.ContactRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository contactRepository;
    private final JavaMailSender mailSender;

    public ContactService(ContactRepository contactRepository,
                          JavaMailSender mailSender) {
        this.contactRepository = contactRepository;
        this.mailSender = mailSender;
    }

    public void saveContact(ContactRequestDTO request) {

        // 1️⃣ Save to DB
        ContactMessage message = new ContactMessage();
        message.setName(request.getName());
        message.setEmail(request.getEmail());
        message.setMessage(request.getMessage());
        contactRepository.save(message);

        // 2️⃣ Send email (with safety)
        try {
            sendEmailNotification(request);
        } catch (Exception e) {
            System.err.println("❌ EMAIL FAILED");
            e.printStackTrace(); // 🔥 THIS WILL SHOW REAL ERROR
            throw new RuntimeException("Email sending failed");
        }
    }

    private void sendEmailNotification(ContactRequestDTO request) {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom("almifitness79@gmail.com"); // MUST match username
        mail.setTo("almifitness79@gmail.com");
        mail.setSubject("📩 New Contact Request");

        mail.setText(
                "Name: " + request.getName() + "\n" +
                "Email: " + request.getEmail() + "\n\n" +
                "Message:\n" + request.getMessage()
        );

        mailSender.send(mail);
        System.out.println("✅ Email sent successfully");
    }
}

