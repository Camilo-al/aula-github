import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main (String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o cod do funcion�rio");
		int cod = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas");
		double numeroHoraTrab = sc.nextDouble();
		System.out.println("Digite o valor da hora");
		double valorHora = sc.nextDouble();
		double salario = numeroHoraTrab * valorHora;
		System.out.println("O cod � :" + cod);
		System.out.printf("E o sal�rio � U$ = %.2f%n",salario);
		
		sc.close();
		}
}
