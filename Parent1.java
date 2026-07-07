class Parent1 {
    public static void abc(){
        System.out.println("Hi parent");
    } 
    static int a=10;
}
class Child1{
     public static void abc(){
        System.out.println("Hi child");
    } 
    static int a=20;
    public static void main(String[] args) {
        System.out.println(a);
        abc();
        System.out.println(Parent1.a);
        Parent1.abc();
    }
}