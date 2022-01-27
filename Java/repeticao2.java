package Java1;

import java.util.Scanner;

public class repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int num, contImp=0, contPar=0;
		
		
		for(int i=0; i<10; i++) {
			System.out.println("Informe um número: ");
			num = leia.nextInt();
		
			if(num%2 !=0) {
				contImp++;
				
				
			} else { 
				contPar++;
				
				
				
			}
		
		
		
		}
		System.out.println(contImp+" Números são Impares e "+contPar+" números são pares");
	}

	}


