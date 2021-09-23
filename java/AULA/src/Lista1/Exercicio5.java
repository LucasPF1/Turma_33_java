/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/ 
 

package Lista1;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, mediaFinal;
		
		System.out.println("Digite a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextDouble();
		
		mediaFinal = ((n1*2)+(n2*3)+(n3*5))/10;
		
		System.out.println("A média final do aluno é: "+mediaFinal);
		}

}

