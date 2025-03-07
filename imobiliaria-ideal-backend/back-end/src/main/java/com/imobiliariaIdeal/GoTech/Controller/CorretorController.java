package com.imobiliariaIdeal.GoTech.Controller;

import com.imobiliariaIdeal.GoTech.Class.Corretor;
import com.imobiliariaIdeal.GoTech.Class.Usuario;
import com.imobiliariaIdeal.GoTech.Record.RecordUsuario;
import com.imobiliariaIdeal.GoTech.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path ="/corretor")
public class CorretorController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping(path = "/cadastro")
    public void criarCadastro(@RequestBody RecordUsuario recordUsuario){
        try {
            Corretor u = new Corretor();
            u.setNome(recordUsuario.nome());
            u.setEmail(recordUsuario.email());
            u.setTelefone(recordUsuario.telefone());
            u.setSenha(recordUsuario.senha());
            u.setDataNascimento(recordUsuario.dataNascimento());
            u.setCreci(recordUsuario.creci());
            usuarioRepository.save(u);
            System.out.println("Usuário salvo. " + u.toString());
        } catch (Exception e){
            System.err.println(e);
        }
    }
}
