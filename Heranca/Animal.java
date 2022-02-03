package HerancPolim;

public class Animal {
	private String nome, som, correr;
	private int idade;
	
	public Animal (String nome, String som, int idade)
	{
		this.nome = nome;
		this.som = som;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCorrer() {
		return correr;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
			

}
