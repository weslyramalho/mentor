package com.wr.jonstory.entities;

import com.wr.jonstory.entities.enums.TipoCliente;

public class Cliente {
    private Integer id;
    private String nome;
    private String email;
    private String cpfoucnpj;
    private TipoCliente tipo;
    public Cliente() {
    }

    public Cliente(Integer id, String nome, String email, String cpfoucnpj, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfoucnpj = cpfoucnpj;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getCpfoucnpj() {
        return cpfoucnpj;
    }

    public void setCpfoucnpj(String cpfoucnpj) {
        this.cpfoucnpj = cpfoucnpj;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
