class Animal {
    String color;
    int noOfLegs;
}
class Dog extends Animal{
    String breed;
}
class DriverDog{
    public static void main(String[] args) {
       /*  Dog d=new Dog();    //Specialization
        System.out.println(d.breed);
        System.out.println(d.color);
        Animal a=new Animal();
        System.out.println(a.color);
       // System.out.println(a.breed);//complie time error  */

       Animal a=new Animal();//Generalization or Upcasting
       System.out.println(a.color);
       //System.out.println(a.breed);

       Dog d=(Dog)a; //Downcasting
       System.out.println(d.breed);
    }
}