package com.wr.jonstory.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wr.jonstory.entities.enums.EstadoPagamento;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class PagamentoComBoleto extends Pagamento{
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm")
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;

    public PagamentoComBoleto() {

    }

    public PagamentoComBoleto(Date dataVencimento, Date dataPagamento) {
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoComBoleto(Long id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
