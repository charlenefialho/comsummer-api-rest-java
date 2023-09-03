package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoDAO {
	// dados mockados
	private static List<ProdutoTO> listaDeProdutos;

	public ProdutoDAO() {
		if (listaDeProdutos == null) {
			listaDeProdutos = new ArrayList<ProdutoTO>();

			ProdutoTO prod = new ProdutoTO();
			prod.setCodigo(1);
			prod.setPreco(20.5);
			prod.setQuantidade(50);
			prod.setTitulo("Chinelo");
			listaDeProdutos.add(prod);

			prod = new ProdutoTO();
			prod.setCodigo(2);
			prod.setPreco(10);
			prod.setQuantidade(2);
			prod.setTitulo("Garrafa de água");
			listaDeProdutos.add(prod);

			prod = new ProdutoTO();
			prod.setCodigo(3);
			prod.setPreco(2000);
			prod.setQuantidade(1);
			prod.setTitulo("Celular xiaomi");
			listaDeProdutos.add(prod);

			prod = new ProdutoTO();
			prod.setCodigo(4);
			prod.setPreco(5);
			prod.setQuantidade(1);
			prod.setTitulo("kitkat");
			listaDeProdutos.add(prod);

			prod = new ProdutoTO();
			prod.setCodigo(5);
			prod.setPreco(20);
			prod.setQuantidade(300);
			prod.setTitulo("Pacote de sulfit");
			listaDeProdutos.add(prod);
		}
	}

	// Select all
	public List<ProdutoTO> select() {
		return listaDeProdutos;
	}

	// Select By ID
	public ProdutoTO select(int id) {
		for (ProdutoTO p : listaDeProdutos) {
			if (p.getCodigo() == id) {
				return p;
			}
		}
		return null;
	}
	
	//INSERT
	public boolean insert(ProdutoTO pto) {
		pto.setCodigo(listaDeProdutos.size() + 1);
		return listaDeProdutos.add(pto);
	}
	
	//Update
	public void update(ProdutoTO pto) {
		ProdutoTO p = select(pto.getCodigo());
		p.setPreco(pto.getPreco());
		p.setQuantidade(pto.getQuantidade());
		p.setTitulo(pto.getTitulo());
	}
	
	//Delete
	public void delete(int id) {
		listaDeProdutos.remove(select(id));
	}
	
}
