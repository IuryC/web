package org.example.controller;

import org.example.service.IOlaMundoService;
import org.example.service.impl.OlaMundoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {
    @Autowired
    private IOlaMundoService olaMundoService;
    @GetMapping
    public Object olaMundo() {
        return olaMundoService.olaMundo();
    }
}
