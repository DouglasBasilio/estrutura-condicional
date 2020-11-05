import java.util.Locale;
import java.util.Scanner;

public class exec_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1+ nota2;
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		
		if (notaFinal < 60.0) System.out.println("REPROVADO");
		
		sc.close();
		
	}

}

// EXEMPLOS
//Entrada: 45.5 e 31.3 | Saída: NOTA FINAL = 76.8
//Entrada: 34.0 e 23.5 | Saída: NOTA FINAL = 57.5 REPROVADO