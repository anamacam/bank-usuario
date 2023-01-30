package com.example.bankusuario.domain.usecase;

import com.example.bankusuario.domain.model.Usuario;
import com.example.bankusuario.domain.model.gateways.UsuarioGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UsuarioUseCase {
    private final UsuarioGateway usuarioGateway;

    public Usuario guardarUsuario(Usuario usuario) throws Exception {
        if (usuario.getId() == null){
            throw new Exception();
        }
        return usuarioGateway.guardar(usuario);

    }

    public void eliminarPorId(Long id){
        try {
            usuarioGateway.eliminar(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public Usuario buscarporId(Long id){
        try {
            return usuarioGateway.buscarPorId(id);

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            return new Usuario();
        }

    }
}
