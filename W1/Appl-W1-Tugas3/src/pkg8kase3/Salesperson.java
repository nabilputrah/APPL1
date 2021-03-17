/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8kase3;

/**
 *
 * @author nabil
 */
public class Salesperson implements Comparable{
    private String firstName, lastName;
    private int totalSales;
    
    public Salesperson (String first, String last, int Sales){
        firstName = first;
        lastName = last;
        totalSales = Sales;
    }
    
    @Override
    public String toString(){
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    
    @Override
    public boolean equals (Object other){
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }
    
    @Override
    public int compareTo(Object other){
        int result = Integer.compare(getSales(),((Salesperson)other).getSales());
        //perubahaan
        if (result ==0){
            return getFirstName().compareTo(((Salesperson)other).getFirstName())*-1;
        }
        return result;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getSales(){
        return totalSales;
    }
}
