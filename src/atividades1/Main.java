package atividades1;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	//ex1
	/*public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		System.out.println("SOMA: " a + b);
	}*/
	
	/*public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double result;
		double pi = 3.14159;
		double raio;
		double area;
		
		System.out.printf("Digite o valor do raio: ");
		raio = scan.nextDouble();
		area = Math.pow(raio, 2.0);
		result = area * pi;
		System.out.printf("A = %.4f", result);
		
	}*/
	
	//ex2
	/*public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int diferenca;
		
		System.out.println("Digite o Valor de 'a':");
		a = scan.nextInt();
		System.out.println("Digite o Valor de 'b':");
		b = scan.nextInt();
		System.out.println("Digite o Valor de 'c':");
		c = scan.nextInt();
		System.out.println("Digite o Valor de 'd':");
		d = scan.nextInt();
		
		diferenca = ((a*b)-(c*d));
		
		System.out.println("Dfierenca: " + diferenca);
	}*/
	
	//ex3
	/*public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan =  new Scanner(System.in);
		
		int cod1 , num1;
		double vu1;
		int cod2 , num2;
		double vu2;
		double vt;

		System.out.println("Digite os valores necessários: ");
		cod1 = scan.nextInt();
		num1 = scan.nextInt();
		vu1 = scan.nextDouble();
		cod2 = scan.nextInt();
		num2 = scan.nextInt();
		vu2 = scan.nextDouble();
		
		vt = ((vu1 * num1) + (vu2 * num2));
		
		System.out.printf("Valor total a ser pago: %.2f", vt);		
	}
	
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		double horat, horav;
		
		System.out.println("Digite os valores necessários");
		int cod = scan.nextInt();
		horat = scan.nextDouble();
		horav = scan.nextDouble();
		
		horat = horat * horav;
		
		System.out.println("NUMBER = " + cod);
		System.out.printf("SALARY = U$ %.2f", horat);
	}*/
	
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.println("Digite os valores correspondentes: ");
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		
		double area = (A * C) / 2;
		System.out.printf("TRIANGULO: %.3f\n", area);
		
		double aux = Math.pow(C , 2.0);
		double pi = 3.14159;
		System.out.printf("CIRCULO: %.3f\n", pi * aux);
		
		aux = (((A + B) / 2) * C);
		System.out.printf("TRAPEZIO: %.3f\n", aux);
		
		System.out.printf("QUADRADO: %.3f\n",  aux = Math.pow(B, 2.0));
		
		System.out.printf("RETANGULO: %.3f\n",  A * B);
		
	}
}



