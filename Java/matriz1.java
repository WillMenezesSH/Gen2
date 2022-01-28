package Java1;

import java.util.Scanner;

public class matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[3][3];

		Scanner leia = new Scanner(System.in);

		// int cont = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Entre com o valor[" + i + " [" + j + "] é: " );
				matriz[i][j] = leia.nextInt();

			}
				
		}
			System.out.println("\n");
			int cont = 0;
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
					if(matriz[i][j] > 10){
						cont++;
				}
			}
		}

		System.out.println(cont +" valores são maior que 10.");
		
		leia.close();

	}

}
