// exercicio 1
programa{   
	/*1- Faça um programa que mostre uma contagem na tela de 233 a 456
      só que contando de 3 em 3 quando estiver entre 
      300 e 400 e de 5 em 5 quando não estiver.*/

    funcao inicio()
    {

         inteiro nFilhos, tFilhos=0
         real salario, totalSalario=0.00, mSalario, maiorSalario=0.00, percSalario, mFilhos, salariomenor=0.00

        para (inteiro x=1; x<=20;x++){
            escreva("Digite o salario do participante ",x,": \n")
            leia(salario)
            escreva("Digite o numero de filhos participante ",x,": \n")
            leia(nFilhos)
            tFilhos=tFilhos+nFilhos

            se (salario>maiorSalario){
                maiorSalario=salario
            }
               totalSalario=totalSalario+salario
               se (salario <=100){
                   salariomenor=salariomenor+1 
               }

        }
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */