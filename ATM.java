class ATMDriver{
    public static void main(String[] args) {
        ATM a=new ATM();
        a.setPin(12344);
        System.out.println(a.getPin());
    }
}


class ATM {
    private int pin;
    public int getPin(){
        return  pin;
    }
    public void setPin(int pin){
        this.pin=pin;
    }
}
