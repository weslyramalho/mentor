package com.wr.jonstory.entities;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento{
    private Integer quantidadeDeParcelas;

    public PagamentoComCartao() {

    }

    public PagamentoComCartao(Integer id, Integer estado, Pedido pedido, Integer quantidadeDeParcelas) {
        super(id, estado, pedido);
        this.quantidadeDeParcelas = quantidadeDeParcelas;
    }

    public Integer getQuantidadeDeParcelas() {
        return quantidadeDeParcelas;
    }

    public void setQuantidadeDeParcelas(Integer quantidadeDeParcelas) {
        this.quantidadeDeParcelas = quantidadeDeParcelas;
    }
}
