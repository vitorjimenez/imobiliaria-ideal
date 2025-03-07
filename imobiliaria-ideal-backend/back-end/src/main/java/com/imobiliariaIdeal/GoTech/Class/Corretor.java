package com.imobiliariaIdeal.GoTech.Class;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Corretor extends Usuario {

    @Column(name = "creci")
    private String creci;

    public Corretor () {
        super();
        setTipo(Tipo.CORRETOR);
    }

    public Corretor(Long id, String nome, String email, String senha, String telefone, Date dataNascimento, Tipo tipo, Boolean habilitado) {
        super(id, nome, email, senha, telefone, dataNascimento, tipo, habilitado);
        this.creci = creci;
    }

    @Override
    public String toString() {
        return "Corretor{" +
                "creci='" + creci + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corretor corretor = (Corretor) o;
        return Objects.equals(getCreci(), corretor.getCreci());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCreci());
    }
}
