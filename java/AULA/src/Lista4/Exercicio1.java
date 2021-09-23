/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

package Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valores[] = new int[5];
		int x, maiorNumero = 0;

		for (x = 0; x < 5; x++) {
			System.out.print("Digite um valor: ");
			valores[x] = leia.nextInt();
		}
		System.out.println("\n");
		for (x = 0; x < 5; x++) {
			System.out.println("[" + valores[x] + "]");

			if (valores[x] > maiorNumero) {
				maiorNumero = valores[x];
			}

		}

		System.out.println("\n");
		System.out.println("O maior valor desse vetor é: " + maiorNumero);
	}

}

