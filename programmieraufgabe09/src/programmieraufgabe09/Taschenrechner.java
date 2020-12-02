package programmieraufgabe09;

import java.util.Scanner;

public class Taschenrechner {

public static void main(String[] args) {
		
		int number1, number2;
		int temp;
		boolean loop;
		int operation;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {

			System.out.println("Zahl1: ");
			number1 = sc.nextInt();
			
			System.out.println("Zahl2: ");
			number2 = sc.nextInt();
			
			System.out.println("Wählen sie eine der nachfolgenden operationen aus: ");
			
			System.out.println("1: Addierert (+)");
			System.out.println("2: Subtrahieret (-)");
			System.out.println("3: Multipilizieret (*)");
			System.out.println("4: Dividiert (/)");
			
			System.out.println("Ihre auswahl: ");
			operation = sc.nextInt();
			
			switch(operation) {
				case 1: System.out.println("Ergebnis: " +(number1 + number2)); break;
				case 2: System.out.println("Ergebnis: " +(number1 - number2)); break;
				case 3: System.out.println("Ergebnis: " +(number1 * number2)); break;
				case 4: System.out.println("Ergebnis: " +(number1 / number2)); break;
				default: System.out.println("Programmabbruch, da falsche zahl eigelesen..."); break;
			
			}
			
			System.out.println("Nochmal? (0/1)");
			temp = sc.nextInt();
				
			if(temp == 0) {
				
				loop = false;
			}
			
			else if(temp == 1) {
				
				loop = true;
				
			}
				
			else {
				
				System.out.println("Falsche programmabbruch...");
				loop = false;
				
				
				
			}	
				
			
		


			}while(loop == true);
		
		
		
		
		
	}
	
}
