package test;

public class PhoneTest {
    public static void main(String[] args) {
        //create a phone object
        Phone phone = new Phone();
        //get the value of the phone object
        System.out.println("Phone price is " +phone.price);
        System.out.println("Phone brand is "+phone.brand);
        //use the way of phone object
        phone.call();
        phone.playGame();

    }
}
