package constructor;

public class College {
	
	int sId;
	String sName;
	String sAddress;
	String sDepartment;
	String sBloodGroup;
	char sSec;
	
	String pName;
	int pId;
	int pSalary;
	String pDepartment;
	
	public College(int sId, String sName, String sAddress, String sDepartment, String sBloodGroup, char sSec) {
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
		this.sDepartment = sDepartment;
		this.sBloodGroup = sBloodGroup;
		this.sSec = sSec;
	}
	
	public College(String pName, int pId, int pSalary, String pDepartment) {
		this.pName = pName;
		this.pId = pId;
		this.pSalary = pSalary;
		this.pDepartment = pDepartment;
	}
	
	void printStudentData() {
		System.out.println("-------------------------------------");
		System.out.println("Details of Student:"+sName);
		System.out.println("-------------------------------------");
		System.out.println("Id:"+sId);
		System.out.println("Name:"+sName);
		System.out.println("Address:"+sAddress);
		System.out.println("Department:"+sDepartment);
		System.out.println("Blood Group:"+sBloodGroup);
		System.out.println("Section:"+sSec);
	}

	void printProfData() {
		System.out.println("-------------------------------------");
		System.out.println("Details of Professor:"+pName);
		System.out.println("-------------------------------------");
		System.out.println("Name:"+pName);
		System.out.println("Id:"+pId);
		System.out.println("Salary:"+pSalary);
		System.out.println("Department:"+pDepartment);
	}
	public static void main(String[] args) {
		College chirag=new College(101,"Chirag","Puttur","AIML","B+",'A');
		chirag.printStudentData();
		College ashith=new College(102,"Ashith","Mangalore","AIML","O+",'B');
		ashith.printStudentData();
		
		College abhishekh=new College("Abhishekh",1011,650000,"AIML");
		abhishekh.printProfData();
		College shruthi=new College("Shruthi",1012,40000,"AIML");
		shruthi.printProfData();
			
	}

}