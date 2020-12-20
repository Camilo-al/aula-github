package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();//Instanciando calculator
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circunference (radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circunference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI Value: %.2f%n",calc.PI);
		System.out.println("C�lculo de circuferencia e volume");
		
		sc.close();

	}
	
	

}
