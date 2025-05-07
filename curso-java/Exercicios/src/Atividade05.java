import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, numeroPeca1, codigoPeca2, numeroPeca2;
		double valorUnitarioPeca1, valorUnitarioPeca2;

		codigo1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();

		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();

		double resultado = numeroPeca1 * valorUnitarioPeca1 + numeroPeca2 * valorUnitarioPeca2;

		System.out.printf("Valor a pagar R$ %.2f", resultado);

		sc.close();
	}

}
