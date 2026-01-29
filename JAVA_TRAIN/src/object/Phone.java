package object;
import java.util.Scanner;

public class Phone {
	
	String name;
	int frontcam;
	int backcam;
	int displaysize;
	String version;
	String colour;
	
	Phone(String name,int frontcam,int backcam,int displaysize,String version,String colour){
		this.name=name;
		this.frontcam=frontcam;
		this.backcam= backcam;
		this.displaysize=displaysize;
		this.version=version;
		this.colour=colour;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		Phone redmi=new Phone("Redmi",12,34,110,"v01","blue");
		
		System.out.println(redmi.name);
		System.out.println(redmi.frontcam);
		System.out.println(redmi.backcam);
		System.out.println(redmi.displaysize);
		System.out.println(redmi.version);
		System.out.println(redmi.colour);
		
		System.out.println("=======================================================");
		
		Phone oppo=new Phone("Oppo",11,24,101,"v04","red");
		System.out.println(oppo.name);
		System.out.println(oppo.frontcam);
		System.out.println(oppo.backcam);
		System.out.println(oppo.displaysize);
		System.out.println(oppo.version);
		System.out.println(oppo.colour);
		
		
		
		
	}

}
