package sessao12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1 {

	public static void main(String[] args) {
		// Exercicio 1
		
		Scanner leia = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();
		int num;

		System.out.println("*** Digite 10 valores inteiros não repetidos! ***");
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º número: ");
			num = leia.nextInt();
			setNumeros.add(num);
		}
		// System.out.println("Listar dados do set: \n" + setNumeros);

		System.out.println("Listar dados do set:");
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}

	}

}
