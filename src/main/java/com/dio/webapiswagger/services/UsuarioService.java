package com.dio.webapiswagger.services;

import com.dio.webapiswagger.model.Usuario;
import com.dio.webapiswagger.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public void save(Usuario user) {
        usuarioRepository.save(user);
    }

    public void update(Usuario user) {
        usuarioRepository.save(user);
    }

    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);

    }

    public void deleteById(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
