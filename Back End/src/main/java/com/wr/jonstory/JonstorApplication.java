package com.wr.jonstory;

import com.wr.jonstory.entities.*;
import com.wr.jonstory.entities.enums.EstadoPagamento;
import com.wr.jonstory.entities.enums.TipoCliente;
import com.wr.jonstory.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class JonstorApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private PagamentoRepository pagamentoRepository;

	@Autowired
	private PedidoRepository pedidoRepository;
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

		Endereco e1 = new Endereco(null, "Rua curupira", "Remanso", 258, "Morro da viuva", "BA", "584454554");
		Endereco e2 = new Endereco(null, "Rua acapu", "Remanso", 254, "Morro dapedra","BA", "658956");
		Endereco e3 = new Endereco(null, "Rua acapu", "Remanso", 254, "Morro dapedra","BA", "658956");
		Endereco e4 = new Endereco(null, "Rua acapu", "Remanso", 254, "Morro dapedra","BA", "658956");

		Cliente cl1 = new Cliente(null, "Marta", "marta@marat.com", "55555545", TipoCliente.PESSOAFISICA, "2222222",e1);
		Cliente cl2 = new Cliente(null, "Ana", "ana@marat.com", "5444445", TipoCliente.PESSOAFISICA, "33333333",e2);
		Cliente cl3 = new Cliente(null, "Joao", "miguel@marat.com", "666645", TipoCliente.PESSOAFISICA, "44444444",e3);
		Cliente cl4 = new Cliente(null, "Miguel", "joao@marat.com", "8888885", TipoCliente.PESSOAFISICA, "55555555",e4);



		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3, e4));
		clienteRepository.saveAll(Arrays.asList(cl1, cl2, cl3, cl4));

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		Pedido pd1 = new Pedido(null,sdf.parse("31/08/2022 14:21"), cl1);
		Pedido pd2 = new Pedido(null,sdf.parse("01/08/2022 10:21"), cl2);
		Pedido pd3 = new Pedido(null,sdf.parse("01/02/2022 11:21"), cl3);
		Pedido pd4 = new Pedido(null,sdf.parse("21/09/2022 12:21"), cl4);

		//Pagamento pag1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, pd1, 6);
		//pd1.setPagamento(pag1);
		//Pagamento pag2 = new PagamentoPix(null, EstadoPagamento.QUITADO, pd2, "A655SDSD");
		//pd2.setPagamento(pag2);
		//Pagamento pag3 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, pd1, sdf.parse("01/08/2022 23:00"), null);
		//pd3.setPagamento(pag3);
		//Pagamento pag4 = new PagamentoPix(null, EstadoPagamento.QUITADO, pd4, "A655SDssdasSD");
		//pd4.setPagamento(pag4);

		cl1.getPedidos().addAll(Arrays.asList(pd1));

		pedidoRepository.saveAll(Arrays.asList(pd1, pd2, pd3, pd4));
		//pagamentoRepository.saveAll(Arrays.asList(pag1, pag2, pag3, pag4));





	}
}
