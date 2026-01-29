package decision_statement;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.Check balance");
		System.out.println("4.Exit");
		System.out.println("Enter Choice:");
		int choice =sc.nextInt();
		
		switch(choice) {
		case 1:{
			System.out.println("Withdraw amount");
			break;
		}
		case 2:{
			System.out.println("Deposit amount");
			break;
		}
		case 2+1:{
			System.out.println("Check the balance");
			break;
		}
		case 2+2:{
			System.out.println("Exit");
			break;
		}
		default:{
			System.out.println("Wrong choice");			
		}
		}

	}

}
