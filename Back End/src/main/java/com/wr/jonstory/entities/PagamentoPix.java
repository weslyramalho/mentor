package com.wr.jonstory.entities;

import com.wr.jonstory.entities.enums.EstadoPagamento;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PagamentoPix extends Pagamento{
    private String chave;

    public PagamentoPix() {
    }

    public PagamentoPix(Long id, EstadoPagamento estado, Pedido pedido, String chave) {
        super(id, estado, pedido);
        this.chave = chave;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
}
