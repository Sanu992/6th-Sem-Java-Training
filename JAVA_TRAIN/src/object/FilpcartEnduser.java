package object;

 class FilpcartEnduser {
	String name;
	long cno;
	String address;
	String email;
	int amount;
	int object_in_cart;
	
	public static void main(String[] args) {
		FilpcartEnduser user1=new FilpcartEnduser();	
		user1.name="Chirag";
		user1.cno=896657856;
		user1.address="Puttur";
		user1.email="chirag@gmail.com";
		user1.amount=10000;
		user1.object_in_cart=3;
		System.out.println("Name:"+user1.name);
		System.out.println("Contact No:"+user1.cno);
		System.out.println("Address:"+user1.address);
		System.out.println("Email Id:"+user1.email);
		System.out.println("Amount:"+user1.amount);
		System.out.println("Number of obects inside the Cart:"+user1.object_in_cart);
		
		System.out.println("=======================================================");
		
		FilpcartEnduser user2=new FilpcartEnduser ();	
		user2.name="DSK";
		user2.cno=534966578;
		user2.address="Sulliya";
		user2.email="dsk@gmail.com";
		user2.amount=10055;
		user2.object_in_cart=1;
		System.out.println("Name:"+user2.name);
		System.out.println("Contact No:"+user2.cno);
		System.out.println("Address:"+user2.address);
		System.out.println("Email Id:"+user2.email);
		System.out.println("Amount:"+user2.amount);
		System.out.println("Number of obects inside the Cart:"+user2.object_in_cart);
		
		System.out.println("=======================================================");
		
		FilpcartEnduser user3=new FilpcartEnduser ();	
		user3.name="Ashith";
		user3.cno=577797978;
		user3.address="Mysuru";
		user3.email="ashith@gmail.com";
		user3.amount=13456;
		user3.object_in_cart=4;
		System.out.println("Name:"+user3.name);
		System.out.println("Contact No:"+user3.cno);
		System.out.println("Address:"+user3.address);
		System.out.println("Email Id:"+user3.email);
		System.out.println("Amount:"+user3.amount);
		System.out.println("Number of obects inside the Cart:"+user3.object_in_cart);
		
		System.out.println("=======================================================");
		
		FilpcartEnduser user4=new FilpcartEnduser ();	
		user4.name="Poojith";
		user4.cno=236546545;
		user4.address="Jaipur";
		user4.email="poojith@gmail.com";
		user4.amount=20000;
		user4.object_in_cart=1;
		System.out.println("Name:"+user4.name);
		System.out.println("Contact No:"+user4.cno);
		System.out.println("Address:"+user4.address);
		System.out.println("Email Id:"+user4.email);
		System.out.println("Amount:"+user4.amount);
		System.out.println("Number of obects inside the Cart:"+user4.object_in_cart);

	}

}
