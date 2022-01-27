package Java1;

import java.util.Scanner;

public class repeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		for(int num =1000; num < 2000; num++) {
				if(num%11 == 5) {
					System.out.println(num+"\n");
				}
		}

	}

}
