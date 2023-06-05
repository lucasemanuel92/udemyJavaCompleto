/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJETO: Criar um "sistema" que armazene os dados de um funcionários
 */

package aulas;

public class Tipos_primitivos {
	public static void main(String[] args) {
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 258;
		int id = 347543;
		long pontosAcumulados = 231_458_364L; // É necessário declarar que é um long usando L no fim;
		
		// Tipos numéricos reais
		float salario = 11357.44F; // É necessário declarar que é um float usando o F no fim. 
		double vendasAcumuladas = 298547.35;
		
		// Tipo booleano
		boolean estaDeFerias = false; // Ou true
		
		// Tipo char
		char status = 'A'; // ativo
		
		// Dias trabalhando
		System.out.println(anosDeEmpresa * 365);
		// Numero de viagans
		System.out.println(numeroDeVoos /2);
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + "Salário: " + salario);
		System.out.println("Férias" + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
		
		
	}

}
