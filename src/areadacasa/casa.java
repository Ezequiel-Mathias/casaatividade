package areadacasa;

import java.util.Scanner;

public class casa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int contador = 0;
		
		double h,e;
		String f;
		String c;
		
		
		
		System.out.println("-----------------------------------------");
		System.out.println(" Calculo de área de uma casa ");
		System.out.println("------------------------------------------");
		
		System.out.println(" Qual o nome do cômodo ? ");
		c = leitor.next();
		
		System.out.println(" Qual a largura ? ");
		h = leitor.nextDouble();
		
		System.out.println(" Qual o comprimento ");
		e = leitor.nextDouble();
		
		System.out.println(" deseja calcular mais ? ");
		f = leitor.next();
		
		
		double result = h + e;
		
		System.out.println(" A área total da "+ c + "é de : " + result);
		
		while (contador <= 0) {
			
			if (f.equals("N") || f.equals("n"))
			
			System.out.println("fim do calculo ! ");
			
			contador = contador + 1;
			
			else if (contador <= 10) {
				System.out.println("fim do calculo ! ");
				
				
				
				
			}
		}
		
	}

}
