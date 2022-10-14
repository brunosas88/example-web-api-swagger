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

    @GetMapping("/list")
    public List<Usuario> listUsers(){
        return usuarioService.findAll();
    }
    @PostMapping("/save")
    public void saveUser(@RequestBody Usuario user){
        usuarioService.save(user);
    }
    @PutMapping("/update")
    public void updateUser(@RequestBody Usuario user){
        usuarioService.save(user);
    }
    @GetMapping("/find/{username}")
    public Usuario findUser(@PathVariable("username") String username){
        return usuarioService.findByUsername(username);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        usuarioService.deleteById(id);
    }
}
