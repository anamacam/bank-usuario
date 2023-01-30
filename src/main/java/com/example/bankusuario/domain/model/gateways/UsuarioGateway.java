package com.example.bankusuario.domain.model.gateways;

import com.example.bankusuario.domain.model.Usuario;

public interface UsuarioGateway {
    Usuario guardar(Usuario usuario);
    void eliminar(Long id);

    Usuario buscarPorId(Long id);
}
