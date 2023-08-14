package br.com.tor4neto.cache.service;

import br.com.tor4neto.cache.entity.Produto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class ProdutoService
{

    @Cacheable("produto")
    public List<Produto> getProduts(){
        log.info("Buscando produtos");
        Produto p = Produto.builder().id(1L).nome("Teste").preco(new BigDecimal(10.5)).build();
        List<Produto> lista = new ArrayList<>();
        lista.add(p);
        return lista;
    }
}
