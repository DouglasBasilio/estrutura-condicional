import java.util.Scanner;

public class exec_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		if (n1 < n2 && n1 < n3) {
			System.out.println("MENOR = " + n1);
		} else if (n2 < n3) {
			System.out.println("MENOR = " + n2);
		} else {
			System.out.println("MENOR = " + n3);
		}

		sc.close();

	}

}

//Exemplos
// Entrada: 7 3 8 | Saída: MENOR = 3
// Entrada: 5 12 5 | Saída: MENOR = 5
// Entrada: 9 9 9 | Saída: MENOR = 9