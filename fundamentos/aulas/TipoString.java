/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJETO: Entendendo mais sobre a String
 */

package aulas;

public class TipoString {

	public static void main(String[] args) {
		// É possível localizar o caractere dentro da string
		System.out.println("Olá, pessoal".charAt(0));
		
		String s = "Boa tarde";
		// s = s.toUpperCase(); // Substitui o valor, a STRING é imutável.
		System.out.println(s + "!!");
		System.out.println(s.startsWith("Boa")); // Boolean analisando o início da string (T/F)
		System.out.println(s.toLowerCase()
				.startsWith("boa"));
		System.out.println(s.length()); // Retorna um numero
		System.out.println(s.equals("Boa tarde")); // Compara strigs, boolena (T/F)
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		// Usando inferências nas Strings
		var nome = "Pedro";
		var sobrenome = "Silva";
		var idade = 33;
		var salario = 12456.32F;
		
		// Concatenar usando o "+"
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + "\nSalário: " + salario);
		
		// Concatenando usando "%s" STRING, "%d" INTEIROS e "%f" FLOAT
		System.out.printf("O senhor %s %s tem %d e recebe um salário de %.2f reais", nome, sobrenome, idade, salario);
		// FORMATAÇÃO %.NUMERO"F" limita as casas decimais
		
		// Formatar uma string em uma frase, me permitindo trabalhar com a frase como se fosse uma única STRING
		String frase = String.format("\nO senhor %s %s tem %d e recebe um salário de %.2f reais", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		// Criar string a partir de concatenação
		String novaString = "Nome: " + nome + "\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + "\nSalário: " + salario;
		System.out.println(novaString);
	}
}
