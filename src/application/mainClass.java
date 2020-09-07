package application;
import entities.Account;
import entities.customer;
import java.util.Scanner;
import java.util.Locale;



public class mainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.UK);
		
		System.out.print("Input holder's name: ");
		String holder = input.nextLine();
		System.out.println(" ");
		System.out.print("Input balance of account: ");
		Double balance = input.nextDouble();
		System.out.println(" ");
		System.out.print("Input PIN of account: ");
		Integer pin = input.nextInt();
		System.out.println(" ");
		System.out.print("Input customer's full name: ");
		String name = input.nextLine();
		input.next();
		System.out.println(" ");
		System.out.print("Input customer's full address: ");
		String address = input.nextLine();
		input.next();
		System.out.println(" ");
		System.out.print("Input customer's age: ");
		Integer age = input.nextInt();
		
		customer customer1 = new customer(name,address,age);
		Account account1 = new Account(holder,balance,pin,customer1);
		
		
		System.out.println(" ");
		System.out.print(account1);
		System.out.println(" ");
		System.out.print("Withdraw / Deposit /Exit system (w/d/e): ");
		char choice = input.next().charAt(0);
		System.out.println(" ");
		
		if (choice == 'w') {
			System.out.println(" ");
			System.out.print("Input desired amount to withdraw: ");
			Double amount = input.nextDouble();
			amount = account1.withdraw(amount);
			System.out.println(" ");
			System.out.print(account1);
			System.out.println(" ");
			
		}
		else if (choice == 'd') {
			
			System.out.println(" ");
			System.out.print("Input desired amount to deposit: ");
			Double amount = input.nextDouble();
		    amount = account1.deposit(amount);
			System.out.println(" ");
			System.out.print(account1);
			}
		
		

	
	
	while (choice != 'e') {
		System.out.println(" ");
		System.out.print("Withdraw / Deposit /Exit system (w/d/e): ");
		 choice = input.next().charAt(0);
		
		if (choice == 'w') {
			System.out.println(" ");
			System.out.print("Input desired amount to withdraw: ");
			Double amount = input.nextDouble();
			amount = account1.withdraw(amount);
			System.out.println(" ");
			System.out.print(account1);
			
			
		}
		else if (choice == 'd') {
			
			System.out.println(" ");
			System.out.print("Input desired amount to deposit: ");
			Double amount = input.nextDouble();
			amount = account1.deposit(amount);
			System.out.println(" ");
			System.out.print(account1);
		}
		
		
		

	}
		
	}
	

}
	

