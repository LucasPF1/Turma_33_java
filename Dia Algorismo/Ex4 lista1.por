
programa{
	     /*4. Escreva um sistema que leia três números inteiros
		e positivos (A, B, C) e calcule a seguinte 
		expressão:
		*/
	inclua biblioteca Matematica
	funcao inicio()
	{
		real A,B,C,D,E,J
		

		escreva ("Número A: \n")
		leia (A)
		escreva ("Número B: \n")
		leia (B)
		escreva ("Número C: \n")
		leia (C)
		
		E = Matematica.potencia((A + B),2.0)		
		J = Matematica.potencia((B + C),2.0)
		D = (E + J) / 2

		escreva ("R = "+E)
		escreva ("\nD = "+D)
		escreva ("\nS = "+J)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 135; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */