import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Ex:1
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor!");
		int x = sc.nextInt();
		System.out.println("Digite outro valor!");
		int y = sc.nextInt();
		int resultado = x+y;
				
		System.out.println("Resultado = " + resultado);
		System.out.println("------------------------------");
		
		//______________________________________________________________________
		//Ex:2
		System.out.println("Programa para ler o valor do raio de um círculo");
		System.out.println("Digite um Valor!");
					
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);
		
		//______________________________________________________________________
	    //Ex:3
		System.out.println("------------------------------");
		System.out.println("Programa para ler quatro valores inteiros e mostrar diferençado produto A*B e C*D");
		System.out.println("Digite um valor!");		
		double a = sc.nextDouble();
		System.out.println("Digite outro valor!");
		double b = sc.nextDouble();
		System.out.println("Digite outro valor!");
		double c = sc.nextDouble();
		System.out.println("Digite outro valor!");
		double d = sc.nextDouble();
		
		double  diferenca = a*b - c*d;
		
		System.out.printf("Diferença = %.2f%n", diferenca);
		sc.close();

	}
}


