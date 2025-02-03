package br.com.alurafood.pagamentos2.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pedido {
    private List<ItemdoPedido> itens;
}
