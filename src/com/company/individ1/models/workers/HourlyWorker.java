package com.company.individ1.models.workers;

import com.company.individ1.exceptions.PaymentException;
import com.company.individ1.models.otdel.MyOtdel;

public class HourlyWorker extends Worker {

    private MyOtdel otdel;
    private int paymentPerHour;

    public HourlyWorker(String name, int birthYear, int paymentPerHour) {
        super(name, birthYear);
        try {
            setPaymentPerHour(paymentPerHour);
        } catch (PaymentException exception) {
            System.out.println(exception.getMessage() + "default will be 50");
            safeSetPaymentPerHour(50);
        }
    }

    private void safeSetPaymentPerHour(int paymentPerHour){
        this.paymentPerHour = paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) throws PaymentException {
        if(paymentPerHour > 1000)
            throw new PaymentException("Too much payment");
        this.paymentPerHour = paymentPerHour;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void quit(){
        otdel.quitMe(this);
    }

    @Override
    public void deleteOtdel() {
        otdel = null;
    }

    @Override
    public void attachOtdel(MyOtdel otdel) {
        this.otdel = otdel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HourlyWorker)) return false;
        HourlyWorker that = (HourlyWorker) o;
        return getPaymentPerHour() == that.getPaymentPerHour() &&
                getName().equals(that.getName()) &&
                getBirthYear() == that.getBirthYear();
    }

    @Override
    public String output() {
        return toString();
    }

    @Override
    public String toString() {
        String otdelStr;
        if(otdel==null)
            otdelStr = "null";
        else otdelStr = otdel.getName();
        return "HourlyWorker{" +
                "otdel=" + otdelStr +
                ", paymentPerHour=" + paymentPerHour +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
