// Calcular preco do lanche

import java.util.Locale;
import java.util.Scanner;

public class exec_08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		double total;
		
		if (cod == 1) {
			total = 4.0 * qtd; // cachorro quente
		} else if (cod == 2) {
			total = 4.5 * qtd; // x-salada
		} else if (cod == 3) {
			total = 5.0 * qtd; // x-bacon
		} else if (cod == 4) {
			total = 2.0 * qtd; // torrada simples
		} else {
			total = 1.5 * qtd; // refrigerante
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}

}
