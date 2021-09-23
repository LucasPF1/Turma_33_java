programa
{	
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.*/
	
	funcao inicio()
	{
		inteiro entradaDias
		inteiro quantidadeMeses,quantidadeDias,quantidadeAnos,idade

		escreva ("Qual a sua idade em dias BROTHER? \n")
		leia (entradaDias)
		
		quantidadeAnos = entradaDias / 365
		entradaDias -= quantidadeAnos * 365

		se (entradaDias <= 31)
		{
			quantidadeMeses = 0
			quantidadeDias = entradaDias
		}
		senao
		{
			quantidadeMeses = entradaDias / 30
			entradaDias -= quantidadeMeses * 30
			quantidadeMeses = entradaDias
		}
		
		escreva ("BROTHER, JÁ CALCULEII!\n\n")
		escreva ("Idade em anos: " + quantidadeDias)
		escreva ("\nIdade em meses: " + quantidadeDias)
		escreva ("\nIdade em dias: " + quantidadeDias)			 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */