package com.leanderson.jpa.entidade;

import com.leanderson.jpa.entidade.enums.Prioridade;
import com.leanderson.jpa.entidade.enums.StatusTarefa;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private StatusTarefa status;
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;
    @ManyToOne
    @JoinColumn(name = "lista_id")
    private ListaTarefa lista;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public StatusTarefa getStatus() { return status; }
    public void setStatus(StatusTarefa status) { this.status = status; }
    public Prioridade getPrioridade() { return prioridade; }
    public void setPrioridade(Prioridade prioridade) { this.prioridade = prioridade;
    }
    public ListaTarefa getLista() { return lista; }

    public void setLista(ListaTarefa lista) { this.lista = lista; }
}
