package typecasting;
import java.util.Scanner;
public class Note {
public static String string(int num) {
	if(num>0) {
		return "Positive";
	}
	else if(num<0) {
		return "Negative";
		
	}
	else {
		return "Zero";
	}
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Pass a number:");
        String s=string(sc.nextInt());
        System.out.println(s);
	}

}
