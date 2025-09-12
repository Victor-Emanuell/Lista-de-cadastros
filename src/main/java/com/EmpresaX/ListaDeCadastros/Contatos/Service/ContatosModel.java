package com.EmpresaX.ListaDeCadastros.Contatos.Service;
import com.EmpresaX.ListaDeCadastros.Eventos.EventosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_contatos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContatosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "eventos_id")
    private EventosModel evento;
}
