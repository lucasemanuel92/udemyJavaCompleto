/*
 * AUTOR: Lucas Emanuel Oliveira de Carvalho
 * PROJETO: Estudo r�pido sobre o import
 */

package aulas;
import java.util.Date; // Tomar cuidado para importar a biblioteca correta.

public class Imports {

	public static void main(String[] args) {
		java.lang.String a = "Bom dia";
		java.lang.System.out.println(a);
		
		// Tipos mais b�sicos n�o precisam de imports
		String s = "Bom dia";
		System.out.println(s);
		
		// � necess�rio importar uma biblioteca antes de usar tipos mais complexos. 
		Date d = new Date();
		System.out.println(d);

	}

}
