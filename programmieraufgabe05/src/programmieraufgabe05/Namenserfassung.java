package programmieraufgabe05;
import java.util.Scanner;

public class Namenserfassung {

	public static void main(String[] args) {
		
		String firstName, lastName;
		
		int age;
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Bitte geben sie Ihren Vornamen ein: ");
		firstName = sc.next();
		
		System.out.println("Bitte geben sie Ihren Nachnamen ein: ");
		lastName = sc.next();
		
		System.out.println("Bitte geben sie Ihren Alter ein: ");
		age = sc.nextInt();
		
		
		System.out.println("Der vollstandige Name ist: " + firstName + " " + lastName);
		System.out.println("Alter: " + age);
		

	}

}
