/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) 
 * e calcule a seguinte express�o:*/  

package Lista1;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int A, B, C, R, S, D;
		
		System.out.println("Escreva o inteiro de A: ");
		A = leia.nextInt();
		System.out.println("Escreva o inteiro de B: ");
		B = leia.nextInt();
		System.out.println("Escreva o inteiro de C: ");
		C = leia.nextInt();
		
		R = (int) (Math.pow(A + B, 2));
		S = (int) (Math.pow(B + C, 2));
		D = (int) (R + S)/2;
		
		System.out.println("O resultado de D �: "+D);
		
		
}
}

