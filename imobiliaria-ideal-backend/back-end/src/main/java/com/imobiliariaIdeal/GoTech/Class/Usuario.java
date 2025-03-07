package com.imobiliariaIdeal.GoTech.Class;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @Column(name = "habilitado")
    private Boolean habilitado;

    public Usuario(Long id, String nome, String email, String senha, String telefone, Date dataNascimento, Tipo tipo, Boolean habilitado) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.tipo = tipo;
        this.habilitado = habilitado;
    }

    public Usuario () {
        this.habilitado = true;
        this.tipo = Tipo.CLIENTE;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", tipo=" + tipo +
                ", habilitado=" + habilitado +
                '}';
    }


}
