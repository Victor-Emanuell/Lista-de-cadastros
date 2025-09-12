package com.EmpresaX.ListaDeCadastros.Eventos;
import com.EmpresaX.ListaDeCadastros.Contatos.ContatosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_eventos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    @OneToMany(mappedBy = "evento")
    private List<ContatosModel> contato;
}
