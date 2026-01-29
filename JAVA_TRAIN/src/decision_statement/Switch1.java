package decision_statement;
import java.util.Scanner;
public class Switch1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.red rose");
		System.out.println("2.doll");
		System.out.println("3.silk choclate");
		System.out.println("Enter Choice:");
		int choice =sc.nextInt();
		
		
		switch(choice) {
		case 1:{
			System.out.println("Are you Chirag's GF");
			System.out.println("1.Yes");
			System.out.println("2.No");
			System.out.println("Enter the option");
			int opt=sc.nextInt();
			
			switch(opt) {
			case 1:{
				System.out.println("Enter password");
				int password=sc.nextInt();
				
				if(password==5202) {
					System.out.println("Payment done");
				}
				else {
					System.out.println("Wrong Password");
				}
			}
			System.out.println("red rose price is 30rs");
			System.out.println("Enter the amount");
			int amount=sc.nextInt();
			if(amount>=30) {
				System.out.println("Payment done");
			}
			else {
				System.out.println("Enter the correct amount");
			}
			break;
		}
		}
		case 2:{
			System.out.println("Are you Chirag's GF");
			System.out.println("1.Yes");
			System.out.println("2.No");
			System.out.println("Enter the option");
			int opt=sc.nextInt();
			
			switch(opt) {
			case 1:{
				System.out.println("Enter password");
				int password=sc.nextInt();
				
				if(password==5202) {
					System.out.println("Payment done");
				}
				else {
					System.out.println("Wrong Password");
				}
			}
			
			System.out.println("doll price is 200rs");
			System.out.println("Enter the amount");
			int amount=sc.nextInt();
			if(amount>=200) {
				System.out.println("Payment done");
			}
			else {
				System.out.println("Enter the correct amount");
			}
			break;
		}
		}
		case 3:{
			System.out.println("Are you Chirag's GF");
			System.out.println("1.Yes");
			System.out.println("2.No");
			System.out.println("Enter the option");
			int opt=sc.nextInt();
			
			switch(opt) {
			case 1:{
				System.out.println("Enter password");
				int password=sc.nextInt();
				
				if(password==5202) {
					System.out.println("Payment done");
				}
				else {
					System.out.println("Wrong Password");
				}
			}
			System.out.println("silk chocalte is 500rs");
			System.out.println("Enter the amount");
			int amount=sc.nextInt();
			if(amount>=500) {
				System.out.println("Payment done");
			}
			else {
				System.out.println("Enter the correct amount");
			}
			
			break;
		}
		}
		
		default:{
			System.out.println("Wrong choice");			
		}
		}

	}
}

	




