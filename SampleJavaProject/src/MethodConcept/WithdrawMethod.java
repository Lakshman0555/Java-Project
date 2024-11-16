package MethodConcept;

import java.util.Scanner;

public class WithdrawMethod {
	int account_balance = 30000;
	
	public void withDraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw:");   //29000
		int withdraw_amount = sc.nextInt();
		if(withdraw_amount<=30000) {
		account_balance = account_balance - withdraw_amount;
		System.out.println("The remaining balance is:" +account_balance);
		}
		else {
			System.out.println("please enter amount less than existing balance to withdraw");
		}
		
	}
	public void depositAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		int deposit_amount = sc.nextInt();
		if(deposit_amount<=20000) {
			account_balance = account_balance+ deposit_amount;
			System.out.println("Total balance is:" +account_balance);
		}
		else {
			System.out.println("The depositing amount limit is execeede ,please approach nearest bank location");
		}
		
	}
	public static void main(String[] args) {
		WithdrawMethod obj = new WithdrawMethod();
		//obj.withDraw();
		obj.depositAmount();
		

	}

}
