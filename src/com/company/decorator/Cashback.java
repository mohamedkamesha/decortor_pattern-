package com.company.decorator;

public class Cashback extends PaymentDecorator{
    public Cashback(Payment payment) {
        super(payment);
    }

    // main value not change
    // cash back to 15%
    @Override
    public String getPaymentDescription() {
        //
        return (super.getPaymentDescription() + "and your cashback is "+ super.getMainCast()*.15) ;
    }
}
