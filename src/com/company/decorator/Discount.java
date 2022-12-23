package com.company.decorator;

public class Discount extends PaymentDecorator{


    public Discount(Payment payment) {
        super(payment);
    }


    @Override
    public Double getMainCast() {
        //discount 10%
        return (super.getMainCast() - (super.getMainCast() * .1) );
    }

    @Override
    public String getPaymentDescription() {

        return super.getPaymentDescription() + " , make discount 10 % form main value ";
    }
}
