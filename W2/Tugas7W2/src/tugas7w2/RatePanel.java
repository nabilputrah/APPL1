/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7w2;

/**
 *
 * @author nabil
 */
// ******************************************************************  
// RatePanel.java  
//  
// Panel for a program that converts different currencies to  
// U.S. Dollars  
// ****************************************************************** 
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*; 
public class RatePanel extends JPanel  {
 private double[] rate; // exchange rates   private String[] currencyName;  
 private JLabel result;
 private String[] currencyName;
 private JComboBox currencyUnit;
 private JTextField textField;
// ------------------------------------------------------------   
// Sets up a panel to convert cost from one of 6 currencies   
// into U.S. Dollars. The panel contains a heading, a text   
// field for the cost of the item, a combo box for selecting   
// the currency, and a label to display the result.   
// ------------------------------------------------------------ 
    public RatePanel (){
        JLabel title = new JLabel ("How much is that in dollars?");   
        title.setAlignmentX (Component.CENTER_ALIGNMENT);   
        title.setFont (new Font ("Helvetica", Font.BOLD, 20));

        // Set up the arrays for the currency conversions
        currencyName = new String[] {"Select the currency..",   "European Euro", "Canadian Dollar",   "Japanese Yen", "Australian Dollar",   "Indian Rupee", "Mexican Peso"};   
        rate = new double [] {0.0, 1.2103, 0.7351,  0.0091, 0.6969,  0.0222, 0.0880};  
        result = new JLabel (" ------------ ");  
   
        add (title);  
        add (result);  
        
        currencyUnit = new JComboBox(currencyName);
        currencyUnit.addActionListener(new ComboListener());
        add(currencyUnit);

        
        // ******************************************************   
        // Represents an action listener for the combo box.   
        // ******************************************************
    }
        private class ComboListener implements ActionListener{  
            // --------------------------------------------------   
            // Determines which currency has been selected and   
            // the value in that currency then computes and   
            // displays the value in U.S. Dollars.  
            // --------------------------------------------------   
            public void actionPerformed (ActionEvent event){  
                int index = 0;  
                result.setText ("1 " + currencyName[index] +   " = " 
                        + rate[index] + " U.S. Dollars");   }
        }    
    }  
  


