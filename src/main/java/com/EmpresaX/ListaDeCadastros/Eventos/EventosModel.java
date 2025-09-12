package com.EmpresaX.ListaDeCadastros.Eventos;
import com.EmpresaX.ListaDeCadastros.Contatos.Service.ContatosModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name = "tb_eventos")
public class EventosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    @OneToMany(mappedBy = "evento")
    private List<ContatosModel> contato;
}
