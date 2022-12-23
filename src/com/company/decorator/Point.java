package com.company.decorator;

public class Point extends PaymentDecorator{
    public Point(Payment payment) {
        super(payment);
    }

    // add half main cost point
    @Override
    public String getPaymentDescription() {

        return super.getPaymentDescription() + "And you Earn point => "+super.getMainCast()*.5 + "point" ;
    }
}
