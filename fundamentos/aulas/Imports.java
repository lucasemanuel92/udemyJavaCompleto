/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJETO: Estudo rápido sobre o import
 */

package aulas;
import java.util.Date; // Tomar cuidado para importar a biblioteca correta.

public class Imports {

	public static void main(String[] args) {
		java.lang.String a = "Bom dia";
		java.lang.System.out.println(a);
		
		// Tipos mais básicos não precisam de imports
		String s = "Bom dia";
		System.out.println(s);
		
		// É necessário importar uma biblioteca antes de usar tipos mais complexos. 
		Date d = new Date();
		System.out.println(d);

	}

}
