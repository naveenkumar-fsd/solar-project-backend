package com.greenenergy.solarsolutions.controller;

import com.greenenergy.solarsolutions.dto.ContactRequestDTO;
import com.greenenergy.solarsolutions.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:8080")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<String> submitContact(@RequestBody ContactRequestDTO request) {
        contactService.saveContact(request);
        return new ResponseEntity<>("Contact details submitted successfully", HttpStatus.CREATED);
    }
}
