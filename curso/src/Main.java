import java.util.Locale;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {	
		Locale.setDefault(Locale.US);
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		// Math.sqrt = raiz quadrada
		// da variavel
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(z);
		
		System.out.printf("Raiz quadrada de: %.2f igual a: %.3f%n\n", x, A);
		System.out.printf("Raiz quadrada de: %.2f igual a: %.3f%n\n", y, B);
		System.out.printf("Raiz quadrada de: %.2f igual a: %.3f%n\n", z, C);
		
		// Math.pow = numeros elevados
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.printf("%.1f Elevado a %.1f é equivalente a: %.1f%n\n", x, y,A);
		System.out.println(x + " Elevado a " + 2.0 + "É equivalente a: " + B + "\n");
		System.out.println(5.2 + " Elevado a " + 2.0 + " É equivalente a: " + C + "\n");
		
		// Math.abs = conversão absoluta de numeros negativos par positivo
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		// formula de bhaskara
		
		//delta = math.pow(b, 2.0) - 4*a*c;
		
		//x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		//x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
	}

/*	public static void main(String[] args) {
*		Locale.setDefault(Locale.US);
*		Scanner scan = new Scanner(System.in);
*		String nome;
*		String cidade;
*		char sexo;
*		int tel;
*		byte idade;
*		double altura;
*		
*		nome = scan.next();
*		cidade = scan.next();
*		tel = scan.nextInt();
//		pega somente primeira letra da string
*		sexo = scan.next().charAt(0);
*		idade = scan.nextByte();
*		altura = scan.nextFloat();
*		
		//println utiliza a localidade idependente
*		System.out.println("Nome: " + nome);
*		System.out.println("Cidade: " + cidade);
*		System.out.println("Telefone: " + tel);
*		System.out.println("Idade: " + idade);
*		System.out.println("Sexo: " + sexo);
		
//		printf tem outro tipo de formatação e strings, e utiliza uma virgula concatenar
*		System.out.printf("Altura: %.2f%n", altura);
*		
*		
*		scan.close();
*	}
*	


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		s1 = scan.nextLine();
		utilizando um scan vazio para ler quebra de linha (buffer)
		scan.nextLine();
		s2 = scan.nextLine();
		s3 = scan.nextLine();
		
		System.out.println("Digitações: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
*/
}







