
programa{	
	/*
	3. Faça um sistema que leia o tempo de duração de
	um evento em uma fábrica expressa em segundos e 
	mostre-o expresso em horas, minutos e segundos.*/

	funcao inicio()
	{
		inteiro entradaSegundos
		inteiro quantidadeHoras,quantidadeMinutos,quantidadeSegundos	

		escreva("Qual quantidade de segundos?/n")
		leia (entradaSegundos)
		
		quantidadeHoras = entradaSegundos / 3600
		entradaSegundos -= quantidadeHoras * (60 * 60)

		se (entradaSegundos <= 60)
		{
			quantidadeMinutos = 0
			quantidadeSegundos = entradaSegundos
		}
		senao
		{
			quantidadeMinutos = entradaSegundos / 60
			entradaSegundos -= quantidadeMinutos * 60
			quantidadeSegundos = entradaSegundos
		}
		
		escreva ("BROTHER, JÁ CALCULEII!\n\n")
		escreva ("Horas: " + quantidadeHoras)		
		escreva ("\n Minutos: " + quantidadeMinutos)
		escreva ("\n Segundos: " + quantidadeSegundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */