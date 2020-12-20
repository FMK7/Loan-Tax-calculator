/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button1 extends JPanel {


    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JTextField textField1;
    private final JTextField textField2;
  
    private final JComboBox termList;

    double[] interest = {5.35, 5.5, 5.75};
    int[] term = {7, 15, 30};
    double numMonths = 0;
    double monthlyInterest = 0;
    double monthlyPayment = 0;
    double principlePayment = 0;
    double interestPayment = 0;
    double balance = 0;
    
    java.text.DecimalFormat df = new java.text.DecimalFormat("$,###.00");

    public Button1() {
        super(new BorderLayout());
        label1 = new JLabel("Loan Amount (Ex: $200,000 = 200000 ): " , JLabel.LEFT);
        label1.setFont(new java.awt.Font("Dubai Light", 1,13));
        textField1 = new JTextField(10);
        label2 = new JLabel("Term Length/Interest Rate: ", JLabel.LEFT);
        label2.setFont(new java.awt.Font("Dubai Light", 1,13));
        String[] termStrings = {"7 years at 5.35%", "15 years at 5.5%", "30 years at 5.75%"};

        termList = new JComboBox(termStrings);
        termList.setSelectedIndex(0);
        termList.setBackground(new java.awt.Color(153,204,255));
        
        termList.setFont(new java.awt.Font("Dubai Light", 0,17));
        
        button1 = new JButton("Calculate");
        
        button1.setFont(new java.awt.Font("Dubai Light", 0,17));
        
        button1.setBackground(new java.awt.Color(0,0,0));
        
        button1.setForeground(new java.awt.Color(255,255,255));
        
        button1.addActionListener((ActionEvent evt) -> {
            button1ActionPerformed(evt);
        });

        button2 = new JButton("Clear/Reset");
        button2.setFont(new java.awt.Font("Dubai Light", 0,17));
        
        button2.setForeground(new java.awt.Color(255,255,255));
        
        button2.setBackground(new java.awt.Color(0,0,0));
        
        button2.addActionListener((ActionEvent evt) -> {
            button2ActionPerformed(evt);
        });

        button3 = new JButton("Quit");
        
        button3.setFont(new java.awt.Font("Dubai Light", 0,17));
        
        button3.setForeground(new java.awt.Color(255,255,255));
        
        button3.setBackground(new java.awt.Color(0,0,0));
        
        button3.addActionListener((ActionEvent evt) -> {
            button3ActionPerformed(evt);
            
        });

        label3 = new JLabel("Your Monthly Payment is: ");
        
        label3.setFont(new java.awt.Font("Dubai Light", 1,13));
        
        textField2 = new JTextField();
 
       
        
         
        
          
        JPanel labelPane = new JPanel(new GridLayout(0, 1));
        
        labelPane.add(label1);
        
        labelPane.add(label2);
        
        labelPane.add(label3);
      
         

        JPanel fieldPane = new JPanel(new GridLayout(0, 1));
        
        fieldPane.add(textField1);
        
        fieldPane.add(termList);
        
        fieldPane.add(textField2);
      
       
        JPanel buttonPane = new JPanel(new GridLayout(0, 1));
        
        buttonPane.add(button1);
        
        buttonPane.add(button2);
        
        buttonPane.add(button3);
        

        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        add(labelPane, BorderLayout.WEST);
        
        add(fieldPane, BorderLayout.CENTER);
        
        add(buttonPane, BorderLayout.LINE_END);
        
        
         
    }

    private void button3ActionPerformed(ActionEvent evt) {
        
        System.exit(0);
    }

    private void button2ActionPerformed(ActionEvent evt) {
        textField1.setText("");
        
        termList.setSelectedIndex(0);
        
        textField2.setText("");
        
    }

    private void button1ActionPerformed(ActionEvent evt) {
        float principle;

        Object source = evt.getSource();
        if (source == button1) {
            try {
           
            } catch (NumberFormatException e) {
                // validates input.
                JOptionPane.showMessageDialog(null, "Invalid Loan Amount to continue. \n", " MISSING / INVALID INFORMATION"
                        , JOptionPane.ERROR_MESSAGE);
                {
                    Toolkit.getDefaultToolkit().beep();
                    return;
                }
            }
        }
        principle = Float.parseFloat(textField1.getText());
        monthlyInterest = (interest[termList.getSelectedIndex()] / (12 * 100));
        numMonths = (term[termList.getSelectedIndex()] * 12);
        
        monthlyPayment = principle * (monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numMonths)));
        
        textField2.setText(String.valueOf(df.format(monthlyPayment)));
        
        balance = principle;
 
        interestPayment = balance * (interest[termList.getSelectedIndex()] / (12 * 100));
        
        principlePayment = monthlyPayment - interestPayment;
        
        for (int i = 0; i < numMonths; ++i) {
            
            System.out.printf("Payment " + (i + 1) + ": Interest Paid - $%.2f", +interestPayment);
            
            System.out.printf("    Remaining Balance: $%.2f\n", +(balance - principlePayment));

            balance = balance - principlePayment;
            
            interestPayment = balance * (interest[termList.getSelectedIndex()] / (12 * 100));
            
            principlePayment = monthlyPayment - interestPayment;
            
         
        }
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Loan Calculator");
        frame.add(new Button1());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
