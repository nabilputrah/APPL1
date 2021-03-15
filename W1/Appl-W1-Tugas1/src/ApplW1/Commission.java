/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApplW1;

/**
 *
 * @author nabil
 */

public class Commission extends Hourly {
    private double comrate;
    private double totalSales;
    
    public Commission (String eName, String eAddress, String ePhone,String socSecNumber
            , double rate,double comisi){
        super (eName, eAddress, ePhone, socSecNumber, rate);
        this.comrate = comisi;
    }
    
    public void addSales(double totalSales){
        this.totalSales =+ totalSales;
    }
    
    @Override
    public double pay(){
        totalSales = totalSales*comrate;
        totalSales = totalSales + super.pay(); 
        double myPay = totalSales;
        totalSales = 0;
        return myPay;
    }
    
    
    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: "+ totalSales;
        return result;
    }
}
