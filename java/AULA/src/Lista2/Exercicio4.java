/*Faça um programa em que permita a entrada de um número qualquer e exiba se este 
 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

package Lista2;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String nome;
		double numero, raizQuadrada, elevadoQuadrado;
		
		System.out.print("Digite um numero: ");
		numero = leia.nextDouble();
		
		raizQuadrada = Math.sqrt(numero);
		elevadoQuadrado = (numero * numero);
		
		if(numero==0){
			System.out.println("Numero neutro");
		}
			else if (numero%2!=0) {
			System.out.println("Número é impar e esse numero elevado ao quadrado é: " + elevadoQuadrado);
		}
		else if (numero%2==0) {
			System.out.println("Numero é par e sua raiz quadrada é: " + raizQuadrada);
		
		}
	}

}

