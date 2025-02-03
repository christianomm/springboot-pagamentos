package br.com.alurafood.pagamentos2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemdoPedido {
    private long id;
    private Integer quantidade;
    private String descricao;
}
