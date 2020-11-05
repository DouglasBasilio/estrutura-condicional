// Ler hora ini e fim de um jogo. Calcular a dura��o do jogo
// sabendo que o mesmo pode come�ar em um dia e terminar em outro, 
// tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas

import java.util.Scanner;

public class exec_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaIni = sc.nextInt();
		int horaFim = sc.nextInt();

		int duracao;

		if (horaIni < horaFim) {
			duracao = horaFim - horaIni;
		} else {
			duracao = 24 - horaIni + horaFim;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}

}
