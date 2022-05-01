package org.mojaloop.schema.common.utils;

public class Money {
    
    public static final String REGEX = "^([0]|([1-9][0-9]{0,17}))([.][0-9]{0,3}[1-9])?$";

    private String amount;
    private Currency currency;

    public Money() {
    }

    public Money(String amount, String currency) {
        setAmount(amount);
        setCurrency(Currency.valueOf(currency));
    }

    public Money(String amount, Currency currency) {
        setAmount(amount);
        setCurrency(currency);
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        // validating the value
        if(amount.matches(REGEX)){
            this.amount = amount;
        }
        else{
            throw new IllegalArgumentException("Money does not match pattern.");
        }
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    public int compareTo(Money o) {
        Float anotherFloat = Float.parseFloat(o.amount);
        Float thisValue = Float.parseFloat(amount);
        return thisValue.compareTo(anotherFloat);
    }

    public boolean isGreaterThan(Money other){
        int result = compareTo(other);
        return result == 1;
    }

    public boolean isSmallerThan(Money other){
        int result = compareTo(other);
        return result == -1;
    }


}
