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
import java.text.DecimalFormat;
public class PaintThings {
    public static void main (String[] args){
        final double COVERAGE = 350;
        Paint paint = new Paint (COVERAGE);
        
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        
        deck = new Rectangle(20,35);
        bigBall = new Sphere(15);
        tank = new Cylinder(10,30);
        
        double deckAmt = paint.amount(deck), ballAmt = paint.amount(bigBall), tankAmt = paint.amount(tank);
        
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck "+ fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
