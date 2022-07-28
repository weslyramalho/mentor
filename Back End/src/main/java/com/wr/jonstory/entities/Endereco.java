package com.wr.jonstory.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private String cidade;
    private Integer numero;
    private String bairro;
    private String estado;
    private String cep;
    @OneToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Endereco() {

    }

    public Endereco(Long id, String logradouro, String cidade, Integer numero, String bairro, String estado, String cep, Cliente cliente) {
        this.id = id;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
