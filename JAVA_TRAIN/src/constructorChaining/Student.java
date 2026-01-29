package constructorChaining;
import java.util.Scanner;
public class Student {
	int id;
	String name;
	int age;
	String department;
	String address;
	char sec;
	String bloodGroup;
	String gender;
	String dateOfBirth;
	
	Student(){
		System.out.println("There is no argument constructor");
	}
	
	Student(String name){
		this();
		this.name=name;	
	}
	
	Student(int id,String name){
		this(name);
		this.id=id;
	}
	
	Student(int id,String name,int age){
		this(id,name);
		this.age=age;
	}
	

	Student(int id,String name,int age,String department){
		this(id,name,age);
		this.department=department;
	}
	
	Student(int id,String name,int age,String department,String address){
		this(id,name,age,department);
		this.address=address;
	}
	
	Student(int id,String name,int age,String department,String address,char sec){
		this(id,name,age,department,address);
		this.sec=sec;
	}
	
	Student(int id,String name,int age,String department,String address,char sec,String bloodGroup){
		this(id,name,age,department,address,sec);
		this.bloodGroup=bloodGroup;
	}
	
	Student(int id,String name,int age,String department,String address,char sec,String bloodGroup,String gender){
		this(id,name,age,department,address,sec,bloodGroup);
		this.gender=gender;
	}
	
	public Student(int id, String name, int age, String department, String address, char sec, String bloodGroup,
			String gender, String dateOfBirth) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.address = address;
		this.sec = sec;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	void printStudentData() {
		
		
		System.out.println("Details of Student:"+name);
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		}
	
	public static void main(String[] args)
	{   
		String username="Sanu";
		String password="5202";
		Scanner sc=new Scanner(System.in);
		Student chirag=new Student(101,"Chirag",19);
		System.out.println("Enter user name or password");
		String user=sc.nextLine();
		if(user==username && user==password) {
			chirag.printStudentData();
		}
        
	}

}
