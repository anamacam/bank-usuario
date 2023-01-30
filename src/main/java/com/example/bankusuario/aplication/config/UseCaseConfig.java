package com.example.bankusuario.aplication.config;


import com.example.bankusuario.domain.model.gateways.UsuarioGateway;
import com.example.bankusuario.domain.usecase.UsuarioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
    @Bean
    public UsuarioUseCase usuarioUseCase(UsuarioGateway gateway){
        return new UsuarioUseCase(gateway);
    }
}
