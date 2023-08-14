package br.com.tor4neto.cache.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
public class Produto implements Serializable {
    private Long id;
    private String nome;
    private BigDecimal preco;

}
