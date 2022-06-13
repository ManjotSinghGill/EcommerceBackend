package com.example.app.model;

public class PaymentModel {

    private final String CUST_ID;
    private final String TXN_AMOUNT;
    private final String ORDER_ID;

    public String getCUST_ID() {
        return CUST_ID;
    }

    public String getTXN_AMOUNT() {
        return TXN_AMOUNT;
    }

    public String getORDER_ID() {
        return ORDER_ID;
    }

    public PaymentModel(String CUST_ID, String TXN_AMOUNT, String ORDER_ID) {
        this.CUST_ID = CUST_ID;
        this.TXN_AMOUNT = TXN_AMOUNT;
        this.ORDER_ID = ORDER_ID;
    }

}
