import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int number;
		double horasTrabalhadas, valorPorHora, salario;
		
		System.out.printf("Numero do funcionario: \n");
		number = sc.nextInt();
	
		System.out.printf("Horas trabalhadas: \n");
		horasTrabalhadas = sc.nextDouble();
		
		System.out.printf("Valor recebido por hora: \n");
		valorPorHora = sc.nextDouble();
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Numero do funcionario = %d\n",number);
		
		salario = valorPorHora * horasTrabalhadas;
		System.out.printf("Salario = U$%.2f",salario);
		
		
	}

}
