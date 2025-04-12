package com.leanderson.jpa.entidade;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String nomeCompleto;
    @Column(nullable = false, unique = true, length = 50)
    private String email;
    @Column(nullable = false, length = 20)
    private String nomeUsuario;
    @Column(nullable = false, length = 100)
    private String senha;
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Perfil perfil;
    @OneToMany(mappedBy = "criador", cascade = CascadeType.ALL)
    private List<ListaTarefa> listasCriadas;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto =
            nomeCompleto; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getNomeUsuario() { return nomeUsuario; }
    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public Perfil getPerfil() { return perfil; }
    public void setPerfil(Perfil perfil) { this.perfil = perfil; }
    public List<ListaTarefa> getListasCriadas() { return listasCriadas; }
    public void setListasCriadas(List<ListaTarefa> listasCriadas) { this.listasCriadas = listasCriadas; }
}


