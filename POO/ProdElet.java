package ProdEletro;

public class ProdElet {
	private String nomeProd;
	private String modeloProd;
	private String anoProd;
	private String memoriaProd;

	public ProdElet(String nome, String modelo, String ano, String memoria) {
		nomeProd = nome;
		modeloProd = modelo;
		anoProd = ano;
		memoriaProd = memoria;
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public String getModeloProd() {
		return modeloProd;
	}

	public void setModeloProd(String modeloProd) {
		this.modeloProd = modeloProd;
	}

	public String getAnoProd() {
		return anoProd;
	}

	public void setAnoProd(String anoProd) {
		this.anoProd = anoProd;
	}

	public String getMemoriaProd() {
		return memoriaProd;
	}

	public void setMemoriaProd(String memoriaProd) {
		this.memoriaProd = memoriaProd;
	}

	@Override
	public String toString() {
		return "Produto: " + nomeProd + " |Modelo: " + modeloProd + " |Ano: " + anoProd + " |Memoria: " + memoriaProd
				+ " ";
	}

}
