/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJETO: Criar uma infer�ncia de um tipo n�o definido
 */

package aulas;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		// O tipo n�o pode ser alterado, se for STRING, sempre ser� STRING.
		
		double d;
		d = 123.32;
		System.out.println(d);
	}

}
