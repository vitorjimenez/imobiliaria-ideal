package com.imobiliariaIdeal.GoTech.Class;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "arquivo")
public class Arquivo {

    @Id
    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name ="uuid", strategy = "uuid2")
    @Column(name = "id")
    private Long id;
    @Column(name = "nomeArquivo")
    private String nome;
    @Column(name = "tipoArquivo")
    private String tipoConteudo;
    @Column(name = "tamanhoArquivo")
    private Long tamanho;

    @Lob
    private final byte[] data;
}
