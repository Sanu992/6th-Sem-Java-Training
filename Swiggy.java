class Swiggy {
    Swiggy(){
        System.out.println("No args");
    }
    Swiggy(int price){
        System.out.println(price);
    }
    Swiggy(String message,int price){
        System.out.println(message);
    }

    public static void orderFood(){
        System.out.println("Order food");
    }
    public static void orderFood(String message){
        System.out.println("biryani");
    }
     public static void orderFood(String message,int bevarges){
        System.out.println("biryani"+ bevarges+"Coke");
    }
    public static void main(String[] args) {
        orderFood();
        orderFood("Double spicy");
        orderFood("Double spicy",2);
        Swiggy s1=new Swiggy();
        Swiggy s2=new Swiggy();
        Swiggy s3=new Swiggy("Good Delivery",3);
    }
}
