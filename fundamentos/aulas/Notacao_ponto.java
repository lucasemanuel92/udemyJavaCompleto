package aulas;

public class Notacao_ponto {

	public static void main(String[] args) {
		
		// Formas de usar a nota��o "X.something()"
		
		// Criar a vari�vel a redefinir 
		String s = "Bom dia!";
		s = s.toUpperCase(); // Altera a string toda.
		
		System.out.println(s);
		
		
		s = s.replace("!", "!!!");
		System.out.println(s);
		
		// Usar direto na defini��o da vari�vel
		String x = "Bom Dia!!".toLowerCase();
		System.out.println(x);

		// Definir no System.out.println()
		String w = "Bom dia";
		System.out.println(w.toUpperCase());
		
		// Usar multiplos m�todos em multiplas linhas
		String y = "Bom dia!".replace("!", ", Lucas!!").toUpperCase()
				.concat(".")
				.replace(".", ". Vamo l�!!!");
		System.out.println(y);
	}

}
