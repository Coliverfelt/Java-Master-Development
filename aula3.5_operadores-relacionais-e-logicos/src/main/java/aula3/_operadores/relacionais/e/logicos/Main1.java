package aula3._operadores.relacionais.e.logicos;

import br.com.softblue.commons.io.Console;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Número 1: " );
		int n1 = Console.readInt();
		
		System.out.println("Número 2: ");
		int n2 = Console.readInt();
		
		boolean igual = n1 == n2;
		System.out.println("Iguais? " + igual);
		
		boolean diferente = n1 != n2;
		System.out.println("Diferentes? " + diferente);
		
		boolean primeiroMaiorQueSegundo = n1 > n2;
		System.out.println("Primeiro maior que segundo? " + primeiroMaiorQueSegundo);
		
		boolean primeiroMaiorIgualQueSegundo = n1 >= n2;
		System.out.println("Primeiro maior ou igual ao segundo? " + primeiroMaiorIgualQueSegundo);
		
		boolean primeiroMenorQueSegundo = n1 < n2;
		System.out.println("Primeiro menor que segundo? " + primeiroMenorQueSegundo);
		
		boolean primeiroMenorIgualQueSegundo = n1 <= n2;
		System.out.println("Primeiro menor ou igual que segundo? " + primeiroMenorIgualQueSegundo);
	}

}