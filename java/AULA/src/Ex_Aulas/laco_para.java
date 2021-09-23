package Ex_Aulas;

import java.util.Scanner;

public class laco_para {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double somaImpar = 0.00;
		double n;
		
		
		for(n=0; n<=500; n++) {
			if((n%2)==1 && (n%3) ==0) {
			somaImpar = somaImpar+n;	
			
				System.out.println(n);
			
			}
			
		}
		
		System.out.println(somaImpar);
				
		
	  }

}
