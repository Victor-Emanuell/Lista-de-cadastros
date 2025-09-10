package com.EmpresaX.ListaDeCadastros;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_contatos")
public class ContatosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;


}
