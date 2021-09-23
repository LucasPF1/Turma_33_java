
programa{	
			/*8. O custo ao consumidor de um carro novo é a soma do 
			custo de fábrica com a percentagem do distribuidor 
			e dos impostos (aplicados ao custo de fábrica).
			Supondo que a percentagem do distribuidor seja de 28% 
			e os impostos de 45%, escrever um sistema que leia o 
			custo de fábrica de um carro e escreva o custo ao
			consumidor.*/

	funcao inicio()
	{
		real custoDeFabrica,custoAoConsumidor,porcenImpostos,porcenDistribuidor
	
		
		escreva("Qual o custo de fabrica? ")
		leia (custoDeFabrica)
		porcenDistribuidor = custoDeFabrica * 0.28
		porcenImpostos = custoDeFabrica * 0.45
		custoAoConsumidor = custoDeFabrica + porcenDistribuidor + porcenImpostos
		escreva("O custo ao consumidor é: " + custoAoConsumidor)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */