package com.example.bankusuario.infraestructure.driver.adapter.jpa_repository;

import com.example.bankusuario.domain.model.Usuario;
import com.example.bankusuario.domain.model.gateways.UsuarioGateway;
import com.example.bankusuario.infraestructure.mapper.MaperUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UsuarioDataGatewayImpl implements UsuarioGateway {


    private final MaperUsuario maperUsuario;
    private final UsuarioDataJpaRepository repository;
    @Override
    public Usuario guardar(Usuario usuario) {
        var data = maperUsuario.toData(usuario);
        return maperUsuario.toUsuario(repository.save(data));
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);

    }

    @Override
    public Usuario buscarPorId(Long id) {
        var usuario = repository.findById(id);
        return maperUsuario.toUsuario(usuario.get());
    }
}
