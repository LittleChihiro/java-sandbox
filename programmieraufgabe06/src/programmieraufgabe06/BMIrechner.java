package programmieraufgabe06;

import java.util.Scanner;

public class BMIrechner {

	public static void main(String[] args) {
		
		double height; 
		double bodyWeight;
		double bmi;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben sie ihre körpergröße (in m) ein: " );
		height = sc.nextDouble();
		
		System.out.println("Bitte geben sie ihre gewicht (in kg) ein: " );
		bodyWeight = sc.nextDouble();
		
		
		//BMI Rechnen
		
		bmi = bodyWeight / (height * height);
		
		System.out.println("Ihre BMI ist: " + bmi);
		
	}

}
