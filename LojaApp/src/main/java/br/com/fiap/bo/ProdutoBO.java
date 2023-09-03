package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {
	// Regras de negócio -> faz intermédio entre a classe de baixo nível e de lado
	// client

	private ProdutoDAO pd;

	public List<ProdutoTO> listar() {
		pd = new ProdutoDAO();
		// Regras de negócio
		return pd.select();
	}
	
	public ProdutoTO listar(int id) {
		pd = new ProdutoDAO();
		// regras de negócio
		return pd.select(id);
	}
	
	public boolean cadastrar(ProdutoTO pto) {
		pd = new ProdutoDAO();
		// regras de negócio
		return pd.insert(pto);
	}
	
	public void atualiza(ProdutoTO pto) {
		pd = new ProdutoDAO();
		// regras de negócio
		pd.update(pto);
	}
	
	public void remover(int id) {
		pd = new ProdutoDAO();
		// regras de negócio
		pd.delete(id);
	}
}
