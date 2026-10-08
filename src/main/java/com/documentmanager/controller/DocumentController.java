package com.documentmanager.controller;

import com.documentmanager.model.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DocumentController {

    @GetMapping("/api/documents/sample")
    public Document getSampleDocument() {

        return new Document(
                1L,
                "Driving Licence",
                "DL123456",
                LocalDate.of(2024, 5, 10),
                LocalDate.of(2034, 5, 10),
                30
        );
    }
}