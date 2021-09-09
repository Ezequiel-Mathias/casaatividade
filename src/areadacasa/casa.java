package areadacasa;

import java.util.Scanner;

public class casa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		
		double larg,comprimento,total;
		String resposta = "sim";
		String comodo;
		double areatotal=0;
		
		
		while(resposta.equals("sim")) {
		
		System.out.println("escreva o comodo : ");
		comodo = leitor.next();
		System.out.println("qual a largura: ");
		larg = leitor.nextDouble();
		System.out.println("qual o comprimento: ");
		comprimento = leitor.nextDouble();
		
		total = larg *comprimento;
		System.out.println("resultado é = " + total);
		
		
		System.out.println("quer continuar (sim) ou (não) ?");
		resposta = leitor.next();
		
		total=total+areatotal;
		
	
		}
		System.out.println("finalizado : "+ areatotal);
		leitor.close();
				
			}
		
		
		
		
		}
		
	


