package com.wr.jonstory.entities;

import com.wr.jonstory.entities.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento{
    private Integer parcelas;

    public PagamentoComCartao() {

    }

        public PagamentoComCartao(Long id, EstadoPagamento estado, Pedido pedido, Integer parcelas) {
        super(id, estado, pedido);
        this.parcelas = parcelas;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }
}
