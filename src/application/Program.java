package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.WithdrawValueExceptions;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {		
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Inital Balance: ");
			double balance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Withdraw Limit: ");
			double withdrawLimit = sc.nextDouble();
			sc.nextLine();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount to withdraw: ");
			double withdraw = sc.nextDouble();
			sc.nextLine();			
		
			account.withdraw(withdraw);		
			System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch (WithdrawValueExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
				
		sc.close();
	}

}
