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
// ******************************************************************
// CirclePanel.java
//
// A panel with a circle drawn in the center and buttons on the
// bottom that move the circle.
// ******************************************************************
import java.awt.*;
import static java.awt.Color.magenta;
import static java.awt.Color.pink;
import javax.swing.*;
import java.awt.event.*;
public class CirclePanel extends JPanel{
    private final int CIRCLE_SIZE = 50;
    private int x, y;
    private Color c;
    JButton choose = new JButton("Choose Color");
    
    //---------------------------------------------------------------
    // Set up circle and buttons to move it.
    //---------------------------------------------------------------
    public CirclePanel(int width, int height){
        // Set coordinates so circle starts in middle
        x = (width / 2) - (CIRCLE_SIZE / 2);
        y = (height / 2) - (CIRCLE_SIZE / 2);
        c = Color.green;
        
        // Need a border layout to get the buttons on the bottom
        this.setLayout(new BorderLayout());
        
        // Create buttons to move the circle
        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JButton up = new JButton("Up");
        JButton down = new JButton("Down");
        
        // Create buttons to change color of the circle
        JButton orange = new JButton("Orange");
        JButton cyan = new JButton("cyan");
        JButton magenta = new JButton("magenta");
        JButton pink = new JButton("pink");
        
        // Add listeners to the buttons
        left.addActionListener(new MoveListener(-20, 0));
        right.addActionListener(new MoveListener(20, 0));
        up.addActionListener(new MoveListener(0, -20));
        down.addActionListener(new MoveListener(0, 20));
        
        orange.addActionListener(new ColorListener(Color.orange));
        cyan.addActionListener(new ColorListener(Color.cyan));
        choose.addActionListener(new ColorListener(null));
        magenta.addActionListener(new ColorListener(Color.magenta));
        pink.addActionListener(new ColorListener(Color.pink));
        
//        // Change background color of buttons
        orange.setBackground(Color.orange);
        cyan.setBackground(Color.cyan);
        magenta.setBackground(Color.magenta);
        pink.setBackground(Color.pink);
        
        // Need a panel to put the buttons on or they'll be on
        // top of each other.
        JPanel buttonPanel = new JPanel();
        JPanel colorButtonPanel = new JPanel();
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(up);
        buttonPanel.add(down);
        colorButtonPanel.add(orange);
        colorButtonPanel.add(cyan);
        colorButtonPanel.add(choose);
        colorButtonPanel.add(magenta);
        colorButtonPanel.add(pink);
        
        // Add the button panel to the bottom of the main panel
        this.add(buttonPanel, "South");
        this.add(colorButtonPanel, "North");
    }
 
    //---------------------------------------------------------------
    // Draw circle on CirclePanel
    //---------------------------------------------------------------
    public void paintComponent(Graphics page){
        super.paintComponent(page);
        page.setColor(c);
        page.fillOval(x, y, CIRCLE_SIZE, CIRCLE_SIZE);
    }
    
    //---------------------------------------------------------------
    // Class to listen for button clicks that move circle.
    //---------------------------------------------------------------
    private class MoveListener implements ActionListener{
        private int dx;
        private int dy;
        
        //---------------------------------------------------------------
        // Parameters tell how to move circle at click.
        //---------------------------------------------------------------
        public MoveListener(int dx, int dy){
            this.dx = dx;
            this.dy = dy;
        }
        
        //---------------------------------------------------------------
        // Change x and y coordinates and repaint.
        //---------------------------------------------------------------
        public void actionPerformed(ActionEvent e){
            x += dx;
            y += dy;
            repaint();
        }
    }
    
    private class ColorListener implements ActionListener{
        private Color color;
        
        public ColorListener(Color color){
            this.color = color;
        }
        
        public void actionPerformed(ActionEvent e){
            if(this.color == null){
                c = JColorChooser.showDialog(choose, "Choose your color!", c);
            }
            else{
                c = this.color;
            }
            repaint();
        }
    }
}
