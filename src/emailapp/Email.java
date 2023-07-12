package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "coguinox.com";
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		// Combine elements to generate employee email address
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department;
		if (this.department != "") {
			this.email += ".";
		}
		this.email+= this.companySuffix;
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounts\n0 for None\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int deptCode = in.nextInt();
		//in.close();
		if (deptCode == 1) { return "sales"; } 
		else if (deptCode == 2) { return "dev"; } 
		else if (deptCode == 3) { return "acct"; }
		else {return ""; }
	}
	
	
	// Generate a random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXVZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i = 0; i<length; i++) {
			password[i] = passwordSet.charAt((int)(Math.random()*passwordSet.length())); 
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String newPswd) {
		this.password = newPswd;
	}
	
	public int getMailboxCapacity(){
		return this.mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return this.alternateEmail;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String showInfo() {
		return "Display Name: " + this.firstName + " " + this.lastName +
				"\nCompany Email: " + this.email + 
				"\nMailbox Capacity: " + this.mailboxCapacity + "mb";
	}
}
