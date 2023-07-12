package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName = sc.next();
		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		
		Email em1 = new Email(firstName, lastName);
		
		System.out.println("Enter Your Personal Email Address: ");
		String altEmail = sc.next();
		em1.setAlternateEmail(altEmail);
		System.out.println(em1.showInfo());
		sc.close();
		
	}

}
