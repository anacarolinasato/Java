import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double area;

		double raio = sc.nextDouble();
		System.out.println(raio);

		area = Math.pow(raio, 2.0);

		System.out.println(area);

	}

}
