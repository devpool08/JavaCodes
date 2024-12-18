package I_InnerClass;
//////////////////////    This file is example of Anonymous InnerClass    ////////////////////////


interface Payment{
    void pay(double amount);

}


class ShoppingCart{
    private double totalPrice;
    public ShoppingCart( double totalPrice){
        this.totalPrice = totalPrice;
    }
    public  void  processPayment(Payment payment){
        payment.pay(totalPrice);
    }
}


class CreditCard implements  Payment{
    private String NUM;
    public CreditCard(String NUM){
        this.NUM = NUM;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Payment successful By Card "+NUM);
        System.out.println("Total amount paid: $" + amount);
    }
}



public class IC4 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(150);

        cart.processPayment(new CreditCard("XXXX XXXX XXXX 9737"));

        //Anonymous Inner Class
        cart.processPayment(new Payment() {
            int amount =989;
            @Override
            public void pay(double amount) {
                System.out.println("Anonymous Inner Class");
                System.out.println("Payment successful by Anonymous Inner Class");
                System.out.println("Total amount paid: $" + amount);
            }
        });

    }

}
