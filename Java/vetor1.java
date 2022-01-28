package Java1;

public class vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A = new int[6];
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		int soma = A[0] + A[1] + A[5];
		System.out.println("O resultado da soma é: " + soma);
		
		
		A[3] = 100;
		System.out.println(A[3]);
		
		for(int i=0; i<A.length;i++) {
			System.out.println("O valor"+ (i+1) + " é: " + A[i]);
			}
	
		}
	
	}

