package com.example.bankusuario.infraestructure.entry.poins;

import com.example.bankusuario.domain.model.Usuario;
import com.example.bankusuario.domain.usecase.UsuarioUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioUseCase useCase;
    @GetMapping("")
    public ResponseEntity<Usuario> findById (@RequestParam("id")Long id){
        var usuario = useCase.buscarporId(id);
        if (usuario.getId()!= null){
            return new ResponseEntity<>(usuario, HttpStatus.OK);

        }
        return new ResponseEntity<>(usuario, HttpStatus.NOT_FOUND);
    }
}
