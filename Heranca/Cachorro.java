package HerancPolim;

public class Cachorro extends Animal {
		private String correr;
			
		public Cachorro (String nome, int idade, String som, String correr) 
		{
			super(nome,som,idade);
			this.correr = correr;
			
		}

		public String getCorrer() {
			return correr;
		}

		public void setCorrer(String correr) {
			this.correr = correr;
		}

		
	}


