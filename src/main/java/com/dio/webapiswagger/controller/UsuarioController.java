package com.dio.webapiswagger.controller;

import com.dio.webapiswagger.model.Usuario;
import com.dio.webapiswagger.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listUsers(){
        return usuarioService.findAll();
    }
    @PostMapping
    public void saveUser(@RequestBody Usuario user){
        usuarioService.save(user);
    }
    @PutMapping
    public void updateUser(@RequestBody Usuario user){
        usuarioService.save(user);
    }
    @GetMapping("/{username}")
    public Usuario findUser(@PathVariable("username") String username){
        return usuarioService.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        usuarioService.deleteById(id);
    }
}
