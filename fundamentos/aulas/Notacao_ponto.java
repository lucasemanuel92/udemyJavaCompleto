package aulas;

public class Notacao_ponto {

	public static void main(String[] args) {
		
		// Formas de usar a notação "X.something()"
		
		// Criar a variável a redefinir 
		String s = "Bom dia!";
		s = s.toUpperCase(); // Altera a string toda.
		
		System.out.println(s);
		
		
		s = s.replace("!", "!!!");
		System.out.println(s);
		
		// Usar direto na definição da variável
		String x = "Bom Dia!!".toLowerCase();
		System.out.println(x);

		// Definir no System.out.println()
		String w = "Bom dia";
		System.out.println(w.toUpperCase());
		
		// Usar multiplos métodos em multiplas linhas
		String y = "Bom dia!".replace("!", ", Lucas!!").toUpperCase()
				.concat(".")
				.replace(".", ". Vamo lá!!!");
		System.out.println(y);
	}

}
