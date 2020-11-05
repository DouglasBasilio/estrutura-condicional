import java.util.Locale;
import java.util.Scanner;

public class exec_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, delta, r1, r2;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		delta = B * B - 4.0 * A * C;
		
		if (A == 0 || delta < 0) System.out.println("Impossível calcular");
		else {
			r1 = (-B + Math.sqrt(delta)) / (2.0 * A);
			r2 = (-B - Math.sqrt(delta)) / (2.0 * A);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();

	}

}

//Exemplos
// Entrada: 10.0 20.1 5.1 | Saída: R1 = -0.29788 R2 = -1.71212
// Entrada: 0.0 20.0 5.0 | Saída: Impossível calcular
// Entrada: 10.3 203.0 5.0 | Saída: R1 = -0.02466 R2 = -19.68408
// Entrada: 10.0 3.0 5.0 | Saída: Impossível calcular