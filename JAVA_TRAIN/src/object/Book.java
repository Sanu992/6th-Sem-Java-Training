package object;

public class Book {
	String name;
	int id;
	String author;
	int pages;
	String publisher;
	String colour;
	
	
	public static void main(String[] args) {
		Book book1=new Book();	
		book1.name="Time Machine";
		book1.id=1;
		book1.author="H G Wells";
		book1.pages=300;
		book1.publisher="Penguin";
		book1.colour="Red";
		System.out.println("Name:"+book1.name);
		System.out.println("Id:"+book1.id);
		System.out.println("Author:"+book1.author);
		System.out.println("Pages:"+book1.pages);
		System.out.println("Publisher:"+book1.publisher);
		System.out.println("Colour:"+book1.colour);
		
		System.out.println("=========================");
		
		Book book2=new Book();	
		book2.name="Dracula";
		book2.id=2;
		book2.author="Bram Stoker";
		book2.pages=400;
		book2.publisher="Penguin";
		book2.colour="Blue";
		System.out.println("Name:"+book2.name);
		System.out.println("Id:"+book2.id);
		System.out.println("Author:"+book2.author);
		System.out.println("Pages:"+book2.pages);
		System.out.println("Publisher:"+book2.publisher);
		System.out.println("Colour:"+book2.colour);
		
		System.out.println("=========================");
		
		Book book3=new Book();	
		book3.name="Animal Farm";
		book3.id=3;
		book3.author="George Orwell";
		book3.pages=600;
		book3.publisher="Penguin";
		book3.colour="Black";
		System.out.println("Name:"+book3.name);
		System.out.println("Id:"+book3.id);
		System.out.println("Author:"+book3.author);
		System.out.println("Pages:"+book3.pages);
		System.out.println("Publisher:"+book3.publisher);
		System.out.println("Colour:"+book3.colour);
		
		
		
		
		
	}
}
