package Java1;

import java.util.Scanner;

public class repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int num, contImp=0, contPar=0;
		
		
		for(int i=0; i<10; i++) {
			System.out.println("Informe um n�mero: ");
			num = leia.nextInt();
		
			if(num%2 !=0) {
				contImp++;
				
				
			} else { 
				contPar++;
				
				
				
			}
		
		
		
		}
		System.out.println(contImp+" N�meros s�o Impares e "+contPar+" n�meros s�o pares");
	}

	}


