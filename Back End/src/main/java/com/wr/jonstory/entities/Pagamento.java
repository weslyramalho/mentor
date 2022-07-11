package com.wr.jonstory.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento implements Serializable {
    @Id
    private Integer id;
    private Integer estado;

    @JoinColumn(name = "pedido_id")
    @OneToOne
    @MapsId
    private Pedido pedido;
    
