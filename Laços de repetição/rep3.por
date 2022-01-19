programa
{
	
	funcao inicio()
	{
		real num = 0.0, multiplicador = 3.0

		escreva (" Digite um número: ")
		leia (num)
		escreva("Digite o multiplicador: " )
		leia (multiplicador)
		
		se(num > 0 e multiplicador != 0 )
			enquanto(num <= 100) { 
			num = num * multiplicador
			escreva(num + "\n")

			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */