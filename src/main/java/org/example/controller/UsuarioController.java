package org.example.controller;

import org.example.dto.UsuarioDTO;
import org.example.form.UsuarioAutenticacaoForm;
import org.example.service.impl.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping
    public Object autenticar(@RequestBody UsuarioAutenticacaoForm form) {
        return usuarioService.autenticar(form.getLogin(), form.getSenha());
    }
    @GetMapping("/usuarios")
    public List<UsuarioDTO> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    @GetMapping("/byId")
    public List<UsuarioDTO> getById() {
        return usuarioService.getUsuarios();
    }

}

