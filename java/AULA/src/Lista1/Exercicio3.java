/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

package Lista1;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int horas, minutos, segundos, segEvento;
		
			System.out.println("Qual a dura��o do evento em segundo: ");
			segEvento = leia.nextInt();
			
			horas=segEvento/3600;
			minutos=(segEvento%3600)/60;
			segundos=(segEvento%3600)%60;
			
			System.out.println("O evento da f�brica teve dura��o de :"+horas+" horas, "+minutos+" minutos e "+segundos+" segundos");
			
	}	
}

