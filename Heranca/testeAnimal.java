package HerancPolim;

public class testeAnimal {

	public static void main(String[] args) {
		
		Cavalo vuaden = new Cavalo("Vuaden", 4, "Irrinr�", "Sim");
		Preguica chavs = new Preguica("Chavs", 7, "Cricri", "Sim");
		Cachorro thor = new Cachorro ("Thor", 6,"ROOF ROOF", "Sim");
		
		System.out.println("Informa��es do cavalo: ");
		System.out.println(vuaden.getNome());
		System.out.println(vuaden.getIdade());
		System.out.println(vuaden.getSom());
		System.out.println(vuaden.getCavalgar());
		System.out.println("Informa��es da Pregui�a:");
		System.out.println(chavs.getNome());
		System.out.println(chavs.getIdade());
		System.out.println(chavs.getSom());
		System.out.println(chavs.getSubirArvore());
		System.out.println("Informa��es do Cachorro: ");
		System.out.println(thor.getNome());
		System.out.println(thor.getIdade());
		System.out.println(thor.getSom());
		System.out.println(thor.getCorrer());
	}

}
