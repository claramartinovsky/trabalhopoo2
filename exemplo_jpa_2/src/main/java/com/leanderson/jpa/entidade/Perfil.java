package com.leanderson.jpa.entidade;
import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "perfis")

public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fotoPerfil;
    private String idiomaPreferido;
    private String tema;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFotoPerfil() { return fotoPerfil; }
    public void setFotoPerfil(String fotoPerfil) { this.fotoPerfil = fotoPerfil; }
    public String getIdiomaPreferido() { return idiomaPreferido; }
    public void setIdiomaPreferido(String idiomaPreferido) { this.idiomaPreferido = idiomaPreferido; }
    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

}

