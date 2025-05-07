import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
	
		
		double A, B, C, areaDoCirculo; 
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double TRIANGULO = (A * C)/2;
		double areaDoCirculoFinal = 3.14159 * (Math.pow(C, 2.0));
		double trapezio = (A + B)/ 2 * C;
		double areaQuadrado = B * B;
		double RetanguloAB = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", areaDoCirculoFinal);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n",RetanguloAB);
		
		sc.close();
	}

}
