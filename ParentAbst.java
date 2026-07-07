abstract class ParentAbst {
    public abstract void m1();
    public static void m2(){
        System.out.println("Hello static");
    }
    int a=10;
    public void m3(){
        System.out.println("Hi non static");
    }
    
}
class ChildAbst extends ParentAbst{
    public void abc(){
        System.out.println("hi from abc");
    }
}
class AbstractDriver{
    public static void main(String[] args) {
        //ParentAbst p=new ParentAbst();
        ChildAbst c=new ChildAbst();
        c.m1();
        c.m2();
        c.abc();
        System.out.println(c.a);
    }
}
