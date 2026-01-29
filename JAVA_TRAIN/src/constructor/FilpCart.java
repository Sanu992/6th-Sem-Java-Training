package constructor;


class FilpCart {
	String eName;
	long eCno;
	String eAddress;
	String eEmail;
	int eAmount;
	int e_object_in_cart;
	
	
	String sName;
	long sCno;
	float sSalary;
	String sEmail;
	
public FilpCart(String eName, long eCno, String eAddress, String eEmail, int eAmount, int e_object_in_cart) {
		this.eName = eName;
		this.eCno = eCno;
		this.eAddress = eAddress;
		this.eEmail = eEmail;
		this.eAmount = eAmount;
		this.e_object_in_cart = e_object_in_cart;
	}
public FilpCart(String sName, long sCno, float sSalary, String sEmail) {
	
	this.sName = sName;
	this.sCno = sCno;
	this.sSalary = sSalary;
	this.sEmail = sEmail;
}

void printEnderUserData() {
	System.out.println("-------------------------------------");
	System.out.println("Details of End User:"+eName);
	System.out.println("-------------------------------------");
	System.out.println("Name:"+eName);
	System.out.println("Contact no:"+eCno);
	System.out.println("Address:"+eAddress);
	System.out.println("Email:"+eEmail);
	System.out.println("Amount:"+eAmount);
	System.out.println("Number of Object in Cart:"+e_object_in_cart);
}

void printServiceProviderData() {
	System.out.println("-------------------------------------");
	System.out.println("Details of Service Provider:"+sName);
	System.out.println("-------------------------------------");
	System.out.println("Name:"+sName);
	System.out.println("Contact no:"+sCno);
	System.out.println("Salary:"+sSalary);
	System.out.println("Email:"+sEmail);
}

	public static void main(String[] args) {
		FilpCart enduser1=new FilpCart("Saavan",78967567,"Puttur","babi@gamil.com",6770,4);	
		enduser1.printEnderUserData();
		
		FilpCart provider1=new FilpCart("DSK",78967567,90000.89f,"dsk@gmail.com");	
		provider1.printServiceProviderData();
	}

}
