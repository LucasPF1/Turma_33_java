/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
package Lista2;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: "+n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior número é: "+n2);
		}
		else {
			System.out.println("O maior número é: "+n3);
		}
	}

}

