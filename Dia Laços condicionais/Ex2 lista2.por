programa
{     /*2) Elabore um sistema que leia as variáveis ​​C e N,
respectivamente código e número de horas trabalhadas
de um operário. 
E calcule o salário sabendo-se que ele
R $ 10,00 por hora ganha. 
Quando o número de horas exceder 50
cálculo o excesso de pagamento armazenando-o na variável E
, caso contrário zerar tal variável. 
A hora excedente de trabalho vale R $ 20,00. 
Sem processamento final imprimir o salário 
total e o salário excedente.*/
	
	funcao inicio (){     
		inteiro C, N, E, M
		
		escreva("Digite o código de operador: ")
		leia(C)
		escreva("Olá, digite o número total de horas trabalhadas: ")
		leia(N)
		
		se (N > 50){
			E = ((N - 50)*20)
			
			escreva("\nDetectei que ocorreu um excesso de jornada, você receberá uma remuneração extra no valor de: R$", E, "\nTotalizando o valor de: R$", (500 + E))
			}
			
		senao{
			escreva("Não houve excedente de horas, o valor a ser remunerado é de: R$ 500,00")
		}

	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */