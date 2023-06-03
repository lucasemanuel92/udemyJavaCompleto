/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJETO: Criar uma calculadora de FAHRENHEIT para Celsius
 */
package desafios;

import java.util.Scanner;

public class Variaveis_constantes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float temp;
		float celsius;
		
		System.out.print("Qual a temperatura em FAHRENHEIT: ");
		temp = input.nextInt();
		
		celsius = (temp - 32) * 5 / 9;
		
		System.out.printf("A temperatura em celsius é: %.2f ", celsius);
				
		
		input.close(); 
	}

}
