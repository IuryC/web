package org.example.service.impl;

import org.example.service.IOlaMundoService;
import org.springframework.stereotype.Service;

@Service
public class OlaMundoService implements IOlaMundoService {

    @Override
    public String olaMundo() {

        return "Ola Miseravi!";
    }

}
