package decision_statement;
import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Food Menu");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.print("Enter choice: ");
        
        switch(sc.nextInt()) {
            case 1 : {
                System.out.println("\nVeg Options:");
                System.out.println("1. North Indian");
                System.out.println("2. South Indian");
                System.out.println("3. Japanese");
                System.out.print("Enter choice: ");
                
                switch(sc.nextInt()) {
                    case 1 :{
                    	System.out.println("Veg Biryani - Pay 250rs");
                    	break;
                    }
                    case 2 :{ 
                    	System.out.println("Masala Dosa - Pay 180rs");
                    	break;
                    }
                    case 3 : {
                    	System.out.println("Vegetable Sushi - Pay 350rs");
                    	break;
                    }
                    default : System.out.println("Invalid choice!");
                }
                break;
            }
            case 2 : {
                System.out.println("\nNon-veg Options1:");
                System.out.println("1. North Indian");
                System.out.println("2. South Indian");
                System.out.println("3. Japanese");
                System.out.print("Enter choice: ");
                
                switch(sc.nextInt()) {
                    case 1 :{
                    	System.out.println("Chicken Biryani - Pay 350rs");
                    	break;
                    }
                    case 2 :{
                    	System.out.println("Chicken Chettinad - Pay 320rs");
                    	break;
                    }
                    case 3 :{
                    	System.out.println("Fish Sushi - Pay 450rs");
                    	break;
                    }
                    default : System.out.println("Invalid choice!");
                }
                break;
            }
            default : System.out.println("Invalid choice!");
           
        }
        sc.close();
    }
}