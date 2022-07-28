package com.wr.jonstory.entities;

import com.wr.jonstory.entities.enums.TipoCliente;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cnpjoucpf;
    private Integer tipo;
    private String telefone;
    @OneToOne
    private Endereco enderco;

    public Cliente() {

    }

    public Cliente(Long id, String nome, String email, String cnpjoucpf, TipoCliente tipo, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cnpjoucpf = cnpjoucpf;
        this.tipo = tipo.getCod();
        this.telefone = telefone;
        this.enderco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpjoucpf() {
        return cnpjoucpf;
    }

    public void setCnpjoucpf(String cnpjoucpf) {
        this.cnpjoucpf = cnpjoucpf;
    }

    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEnderco() {
        return enderco;
    }

    public void setEnderco(Endereco enderco) {
        this.enderco = enderco;
    }
}
