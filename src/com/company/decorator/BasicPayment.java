package com.company.decorator;

public class BasicPayment implements Payment{


    @Override
    public Double getMainCast() {
        // adding dummy data
        return 100.00;
    }

    @Override
    public String getPaymentDescription() {
        return "Dear Customer : deserved amount =>  " + getMainCast();
    }
}
