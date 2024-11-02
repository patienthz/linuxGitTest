package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("please input original price:");
        Scanner input = new Scanner(System.in);
        int priceInput = input.nextInt();
        System.out.println("please input month:");
        int monthInput = input.nextInt();
        System.out.println("please input air kind: A is first class & B is economy class");
        char classInput = input.next().charAt(0);
        input.close();
        try {
            double price = getPrice(priceInput, monthInput, classInput);
            System.out.println("price is " + price);
        }catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }


    }

    private static double priceMethod(int priceInt, int monthInt, char classInt) {
        double price = 0;
        if (monthInt >= 5 && monthInt <= 10) {
            if (classInt == 'A') {
                price = priceInt * 0.9;
            } else if (classInt == 'B') {
                price = priceInt * 0.85;
            } else {
                throw new IllegalArgumentException("classInt error");
            }
        } else if (monthInt >= 10 && monthInt <= 12 || monthInt >= 1 && monthInt <= 4) {
            if (classInt == 'A') {
                price = priceInt * 0.7;
            } else if (classInt == 'B') {
                price = priceInt * 0.65;
            } else {
                throw new IllegalArgumentException("classInt error");
            }
        } else {
            throw new IllegalArgumentException("monthInt error");
        }

        return price;
    }

    private static double getPrice(int priceInput, int monthInput, char classInput) {
        double price = 0;
        double discount = 0,highclassPrice=0,lowclassPrice=0;

        if (monthInput < 1 || monthInput > 12) {
            throw new IllegalArgumentException("monthInput error");
        }
        if (classInput != 'A' && classInput != 'B') {
            throw new IllegalArgumentException("classInt error");
        }

        if(monthInput >=5 && monthInput <=10) {highclassPrice=0.9;lowclassPrice=0.85;}
        if(monthInput >=10 || monthInput <=4) {highclassPrice=0.7;lowclassPrice=0.65;}

        if(classInput =='A'){discount=highclassPrice;}else {discount=lowclassPrice;}

        price= priceInput*discount;
        return price;
    }
}
