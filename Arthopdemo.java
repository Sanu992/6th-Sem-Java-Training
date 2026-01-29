public class Arthopdemo{
 public static void main(String[] args){

 String name="Pooja";
 int id=101;
 float per=89.99f;
 long no=123456789;
 char sec='A';
 String bloodgroup="B+";
 long ahadhar= 98564738;

System.out.println("Name:"+name);
System.out.println("Id:"+id);
System.out.println("Percentage:"+per);
System.out.println("Section:"+sec);
System.out.println("Blood group:"+bloodgroup);
System.out.println("Adhar:"+ahadhar);
System.out.println(!true==(10==10));
System.out.println(!true || 10==10);
System.out.println(!true && 10==20);


int a=5,b=3;
boolean result=(a>10 && b>5) || (a==5 && b<4);
System.out.println(result); 

int x=20;
System.out.println(x<10 || x>15);

int age=20;
boolean hasnoGurdian=false;
if(age<18 && hasnoGurdian) {
 System.out.println("Not Allowed");
}
else{
 System.out.println("Allowed");
}

int u=11,v=15;
System.out.println(u&v);

}
}