package com.example.bankusuario.infraestructure.mapper;

import com.example.bankusuario.domain.model.Usuario;
import com.example.bankusuario.infraestructure.driver.adapter.jpa_repository.UsuarioData;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class MaperUsuario {

    public Usuario toUsuario(UsuarioData usuarioData){

        return new Usuario(
                usuarioData.getId(),
                usuarioData.getName(),
        usuarioData.getLastName(),
        usuarioData.getEmail()
        );

    }
    public UsuarioData toData(Usuario usuario){
        return new UsuarioData(
               usuario.getId(),
                usuario.getName(),
                usuario.getLastName(),
                usuario.getEmail()
        );

    }


}
