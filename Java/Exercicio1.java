package Java1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int totalDia, dia, mes,ano;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Há quantos dias você nasceu?");
		totalDia = leia.nextInt();
		
		ano = totalDia / 365;
		mes = (totalDia % 365) / 30;
		dia = (totalDia % 365) % 30;
		
		System.out.println("Fazem "+ano+ " anos, "+mes+" meses e " +dia+ " dias de vida!");
		
		
		
		
		
		
	}

}
