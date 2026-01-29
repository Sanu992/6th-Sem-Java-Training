package decision_statement;
import java.util.Scanner;
public class SC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Here next means only a single word is printed
		//nextLine means it prints a whole sentence or line
		System.out.println("Enter the String data");
		String stringData1=sc.next();
		System.out.println(stringData1);
		char charData=sc.next().charAt(0);
		System.out.println(charData);
		
		String stringData=sc.nextLine();
		
		boolean booleanData=sc.nextBoolean();
		
		byte byteData=sc.nextByte();	}

}
