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
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double r,double s){
        super("Rectangle");
        length = r;
        width = s;
    }
    
    @Override
    public double area(){
        return length*width;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" +  "of length " +length + " and of width "+width;
    }
}
