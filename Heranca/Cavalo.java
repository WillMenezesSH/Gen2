package HerancPolim;

public class Cavalo extends Animal {
	private String cavalgar;
	
	public Cavalo(String nome, int idade, String som, String cavalgar)
	{
		super(nome,som,idade);
		this.cavalgar = cavalgar;
	}

	public String getCavalgar() {
		return cavalgar;
	}

	public void setCavalgar(String cavalgar) {
		this.cavalgar = cavalgar;
	}

}
