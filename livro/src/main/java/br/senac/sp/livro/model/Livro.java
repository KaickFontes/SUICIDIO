package br.senac.sp.livro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Livro {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Titulo;
    private String descricao;
}
