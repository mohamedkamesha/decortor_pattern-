package com.company.decorator;

public class PaymentDecorator implements Payment {
    private  Payment payment;

    public PaymentDecorator(Payment payment) {
        this.payment = payment;
    }



    @Override
    public Double getMainCast() {
        return this.payment.getMainCast();
    }

    @Override
    public String getPaymentDescription() {
        return this.payment.getPaymentDescription() ;
    }
}
