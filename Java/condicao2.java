package Java1;

import java.util.Scanner;

public class Condi��o2 {
	
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	double num1,num2,num3,pos1 = 0,pos2= 0,pos3 = 0;
	
	System.out.println("Informe o n�mero1: ");
	num1 = leia.nextDouble();
	System.out.println("Informe o n�mero2: ");
	num2 = leia.nextDouble();
	System.out.println("Informe o n�mero3: ");
	num3 = leia.nextDouble();
	
	if(num1 < num2 && num1 < num3) {
	pos1 = num1;
		if (num2 < num3) {
			pos2 = num2;
			pos3 = num3;
		}else {
			pos2 = num3;
			pos3 = num2;
			}

		}
	
	if(num2 < num1 && num2 < num3) {
		pos1 = num2;
			if (num1 < num3) {
				pos2 = num1;
				pos3 = num3;
			}else {
				pos1 = num3;
				pos3 = num1; 
				} // 2 = 1 / 1 = 2

			}
	
	if(num1 < num2 && num1 < num3) {
		pos1 = num1;
			if (num2 < num1) {
				pos2 = num2;
				pos3 = num1;
			}else {
				pos2 = num1;
				pos3 = num2; // 3 = 1 / 1 = 3
				}

			}
	
	System.out.println("A ordem crescente �" +pos1+" " +pos2+" " +pos3);
	
	
	
	
	}
}
