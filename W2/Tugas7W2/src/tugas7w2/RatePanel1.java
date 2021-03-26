/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7w2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RatePanel1 extends JPanel{
    private double[] rate; // exchange rates
    private String[] currencyName;
    private JLabel result;
    private JComboBox selectCurrencyName;
    private JTextField textField;
    // ------------------------------------------------------------
    // Sets up a panel to convert cost from one of 6 currencies
    // into U.S. Dollars. The panel contains a heading, a text
    // field for the cost of the item, a combo box for selecting
    // the currency, and a label to display the result.
    // ------------------------------------------------------------
    public RatePanel1 (){
        JLabel title = new JLabel ("How much is that in dollars?");
        title.setAlignmentX (Component.CENTER_ALIGNMENT);
        title.setFont (new Font ("Helvetica", Font.BOLD, 20));
        
        // Set up the arrays for the currency conversions
        currencyName = new String[] {"Select the currency..",
        "European Euro", "Canadian Dollar",
        "Japanese Yen", "Australian Dollar",
        "Indian Rupee", "Mexican Peso"};
        rate = new double [] {0.0, 1.2103, 0.7351,0.0091, 0.6969,0.0222, 0.0880};
        result = new JLabel (" ------------ ");
        
        // Currency
        JLabel currency = new JLabel("Currency");
        selectCurrencyName = new JComboBox(currencyName);
        selectCurrencyName.addActionListener(new ComboListener());
        
        // TextField
        textField = new JTextField("0");
        textField.setPreferredSize(new Dimension(120,30));
        
        add(title);
        add(result);
        add(currency, "SOUTH");
        add(selectCurrencyName);
        add(textField);
        
        // Modify the layout
        this.setBackground(new Color(200,164,255));
        this.setLayout(new GridLayout(4,3,0,10));
    }
    // ******************************************************
    // Represents an action listener for the combo box.
    // ******************************************************
    private class ComboListener implements ActionListener{
        // --------------------------------------------------
        // Determines which currency has been selected and
        // the value in that currency then computes and
        // displays the value in U.S. Dollars.
        // --------------------------------------------------
        public void actionPerformed(ActionEvent event){
            int index = selectCurrencyName.getSelectedIndex();
            result.setText (textField.getText() +" " + currencyName[index] + " = " 
            + (rate[index] * Integer.valueOf(textField.getText())) + " U.S. Dollars");
        }
    }
}
