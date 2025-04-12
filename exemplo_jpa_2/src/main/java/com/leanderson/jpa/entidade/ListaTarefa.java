package com.leanderson.jpa.entidade;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "listas_tarefa")
public class ListaTarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(length = 7)
    private String corHex;
    @ManyToOne
    @JoinColumn(name = "criador_id")
    private Usuario criador;
    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL)
    private List<Tarefa> tarefas;
    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL)
    private List<CompartilhamentoLista> compartilhamentos;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCorHex() { return corHex; }
    public void setCorHex(String corHex) { this.corHex = corHex; }
    public Usuario getCriador() { return criador; }
    public void setCriador(Usuario criador) { this.criador = criador; }
    public List<Tarefa> getTarefas() { return tarefas; }
    public void setTarefas(List<Tarefa> tarefas) { this.tarefas = tarefas; }
    public List<CompartilhamentoLista> getCompartilhamentos() { return compartilhamentos; }
    public void setCompartilhamentos(List<CompartilhamentoLista> compartilhamentos) { this.compartilhamentos = compartilhamentos; }
}

