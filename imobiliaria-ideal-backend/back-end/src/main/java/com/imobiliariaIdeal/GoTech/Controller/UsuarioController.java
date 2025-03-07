package com.imobiliariaIdeal.GoTech.Controller;

import com.imobiliariaIdeal.GoTech.Record.RecordUsuario;
import com.imobiliariaIdeal.GoTech.Record.RecordUsuarioLogin;
import com.imobiliariaIdeal.GoTech.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.imobiliariaIdeal.GoTech.Class.Usuario;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping(path="/usuario")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping(path="/registrar")
    public ResponseEntity<String> registrarUsuario (@RequestBody RecordUsuario recordUsuario){
        try{
            Usuario u = new Usuario();
            u.setNome(recordUsuario.nome());
            u.setEmail(recordUsuario.email());
            u.setTelefone(recordUsuario.telefone());
            u.setSenha(recordUsuario.senha());
            u.setDataNascimento(recordUsuario.dataNascimento());
            usuarioRepository.save(u);
            System.out.println("Usuário salvo. " + u.toString());
            return ResponseEntity.ok("Usuário salvo. " + u.toString());
        } catch(Exception e) {
            System.err.println("Houve uma falha ao registrar usuário. " + e);
            return ResponseEntity.ok("Houve um erro ao registrar o usuário" + e.getMessage());
        }
    }


//    @PostMapping(path="/login")
//    public ResponseEntity loginUsuario(
//            @PathVariable(value="email")String email,
//            @PathVariable(value="senha") String senha)
//            @RequestBody RecordUsuarioLogin recordUsuarioLogin){
//            Optional<Usuario> uExistente = usuarioRepository.findById(email);
//        try{
//
//        } catch (Exception e){
//
//        }
//    }

    @PutMapping(path="/editar/{id}")
    public void alterarUsuario(@PathVariable(value = "id")Long id,
                               @RequestBody RecordUsuario recordUsuario){
        Optional<Usuario> uE = usuarioRepository.findById(id);

        try{
            Usuario u = uE.get();
            u.setNome(recordUsuario.nome());
            u.setEmail(recordUsuario.email());
            u.setSenha(recordUsuario.senha());
            u.setTelefone(recordUsuario.telefone());
            usuarioRepository.save(u);
            System.out.println("Usuario salvo com sucesso");
        } catch (Exception e) {
            System.err.println("Houve um erro ao tentar alterar o usuário "+e);
        }
    }
}
