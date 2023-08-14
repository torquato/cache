package br.com.tor4neto.cache;

import br.com.tor4neto.cache.entity.Produto;
import br.com.tor4neto.cache.service.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class CacheApplicationTests {

	@Autowired
	ProdutoService service;

	@Test
	void contextLoads() {
		List<Produto> produts = service.getProduts();
		log.info("resultado"  +produts.toString());
		produts = service.getProduts();
		log.info("resultado"  +produts.toString());
	}

}
