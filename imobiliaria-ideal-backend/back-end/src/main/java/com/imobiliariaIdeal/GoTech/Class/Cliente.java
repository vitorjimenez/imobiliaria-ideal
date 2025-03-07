package com.imobiliariaIdeal.GoTech.Class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Cliente extends Usuario{

    public Cliente(Long id, String nome, String email, String senha, String telefone, Date dataNascimento, Tipo tipo, boolean habilitado) {
        super(id, nome, email, senha, telefone, dataNascimento, tipo, habilitado);
        setTipo(Tipo.CLIENTE);
    }

    public Cliente() {
    }



}
