package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProdutoTO {

	private int codigo;
	private String titulo;
	private double preco;
	private int quantidade;

	public ProdutoTO() {

	}

	public ProdutoTO(int codigo, String titulo, double preco, int quantidade) {
		super();
		setCodigo(codigo);
		setTitulo(titulo);
		setPreco(preco);
		setQuantidade(quantidade);

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
