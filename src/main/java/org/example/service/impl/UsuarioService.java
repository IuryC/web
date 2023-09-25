package org.example.service.impl;
import org.example.dto.UsuarioDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    public boolean autenticar(String login, String senha) {
        return login.equals("eu") && senha.equals("123456");
    }

    public List<UsuarioDTO> getUsuarios() {
        List<UsuarioDTO> ls = new ArrayList<>();
        for(int i=0; i < 3;i++) {
//			UsuarioDTO usu = new UsuarioDTO();
//			usu.setCodigo(i);
//			usu.setNome("Nome " + i);
//			usu.setFone("Fone "+ i);
//			usu.setLogin("login " + i);
//			ls.add(usu);
            ls.add(UsuarioDTO.builder()
                    .codigo(i).nome("nome " + i)
                    .fone("Fone " + i)
                    .login("Login " +i)
                    .build());
        }
        return ls;
    }
}
