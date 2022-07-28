package com.wr.jonstory;

import com.wr.jonstory.entities.Categoria;
import com.wr.jonstory.entities.Produto;
import com.wr.jonstory.repositories.CategoriaRepository;
import com.wr.jonstory.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class JonstorApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;
	public static void main(String[] args) {
		SpringApplication.run(JonstorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria c1 = new Categoria(null, "Calcçados");
		Categoria c2 = new Categoria(null, "Roupas");
		Categoria c3 = new Categoria(null, "Acessorios");


		Produto p1 = new Produto(null,"Bota", 200.00);
		Produto p2 = new Produto(null,"Sandalia", 100.00);
		Produto p3 = new Produto(null,"Sapato", 180.00);

		c1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		p1.getCategorias().add(c1);
		p2.getCategorias().add(c2);
		p3.getCategorias().add(c3);

		categoriaRepository.saveAll(Arrays.asList(c3, c1, c2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));






	}
}
