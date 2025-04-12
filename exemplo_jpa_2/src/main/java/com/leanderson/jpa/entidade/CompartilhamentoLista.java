package com.leanderson.jpa.entidade;

import com.leanderson.jpa.entidade.enums.NivelAcesso;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "compartilhamentos")
public class CompartilhamentoLista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "lista_id")
    private ListaTarefa lista;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @Enumerated(EnumType.STRING)
    private NivelAcesso nivelAcesso; // VISUALIZADOR, COLABORADOR, ADMINISTRADOR
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public ListaTarefa getLista() { return lista; }
    public void setLista(ListaTarefa lista) { this.lista = lista; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public NivelAcesso getNivelAcesso() { return nivelAcesso; }
    public void setNivelAcesso(NivelAcesso nivelAcesso) { this.nivelAcesso = nivelAcesso; }

}

