package com.company;

import com.company.decorator.*;

public class Main {

    public static void main(String[] args) {
        // basic
        Payment payment = new BasicPayment();
        System.out.println("cost => "+ payment.getMainCast());
        System.out.println(("payment => "+payment.getPaymentDescription() ));
        System.out.println();
        // discount
        Payment paymentDiscount = new Discount(new BasicPayment() );
        System.out.println("cost => "+ paymentDiscount.getMainCast());
        System.out.println(("payment => "+paymentDiscount.getPaymentDescription() ));

        System.out.println();
        // cashBack
        Payment paymentCashback = new Cashback(new BasicPayment() );
        System.out.println("cost => "+ paymentCashback.getMainCast());
        System.out.println(("payment => "+paymentCashback.getPaymentDescription() ));

        System.out.println();

        // Point
        Payment paymentPoint = new Point(new BasicPayment() );
        System.out.println("cost => "+ paymentPoint.getMainCast());
        System.out.println(("payment => "+paymentPoint.getPaymentDescription() ));

    }
}
