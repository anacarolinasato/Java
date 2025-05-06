import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, resultado;
		valor2 = sc.nextInt();
		valor1 = sc.nextInt();

		System.out.println("ENTRADA:");
		System.out.println(valor1);
		System.out.println(valor2);

		resultado = valor1 + valor2;

		System.out.printf("SOMA:\n%d", resultado);

		sc.close();
	}

}
