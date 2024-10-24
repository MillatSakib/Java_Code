
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.OOP;

/**
 *
 * @author Sakib
 */

interface Payment{
    long getAmount();
}

class PaymentEngine{
    public void accept(Payment payment){
        System.out.println("Accepting payment: "+payment.getAmount());
    }
}

class BkashPayment implements Payment{
    @Override
    public long getAmount(){
    System.out.println("Tracking BKash Payment.");
    return 100;
    }
}

class CashPayment implements Payment{
    @Override
    public long getAmount(){
        System.out.println("Tracking cash payment.");
        return 500;
    }
}

public class Interfaces {
    public static void main(String[] args){
        PaymentEngine paymentEngine = new PaymentEngine();
        BkashPayment bKashPayment = new BkashPayment();
        paymentEngine.accept(bKashPayment);
        CashPayment cashPayment = new CashPayment();
        paymentEngine.accept(cashPayment);
    }
}
