/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project23;

public class Button2 extends javax.swing.JFrame {

    public Button2() {
        initComponents();
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        InputValue = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        FiveTax = new javax.swing.JRadioButton();
        FifteenTax = new javax.swing.JRadioButton();
        EnterValue = new javax.swing.JLabel();
        Sar1 = new javax.swing.JLabel();
        HighOfTax = new javax.swing.JLabel();
        BtnCalculate = new javax.swing.JButton();
        Result = new javax.swing.JLabel();
        InputResult = new javax.swing.JTextField();
        Sar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

   
       jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\F M K\\Documents\\NetBeansProjects\\Project23\\src\\project23\\464778-taxcollage.jpg"));
       
       setTitle("Tax Calculator");
        InputValue.addActionListener((java.awt.event.ActionEvent evt) -> {
            InputValueActionPerformed(evt);
        });

        Title.setFont(new java.awt.Font("Dubai Light", 1,25));// NOI18N
        Title.setText("Tax calculator");

        FiveTax.setSelected(true);
        FiveTax.setText("15% tax");
        FiveTax.setBackground(new java.awt.Color(255,255,204));
        FiveTax.addActionListener((java.awt.event.ActionEvent evt) -> {
            TenTaxActionPerformed(evt);
        });

        FifteenTax.setText("5% tax");
        FifteenTax.setBackground(new java.awt.Color(255,255,204));
        FifteenTax.addActionListener((java.awt.event.ActionEvent evt) -> {
            TwelveTaxActionPerformed(evt);
        });

        EnterValue.setText("Enter value:");
        EnterValue.setFont(new java.awt.Font("Dubai Light", 1,18));

        Sar1.setText("SAR");

        HighOfTax.setText("Choose Tax:");
        HighOfTax.setFont(new java.awt.Font("Dubai Light", 1,18));
        
        
        BtnCalculate.setText("Calculate");
        BtnCalculate.setFont(new java.awt.Font("Dubai Light", 1,15));
        BtnCalculate.setBackground(new java.awt.Color(255,255,204));
        BtnCalculate.addActionListener((java.awt.event.ActionEvent evt) -> {
            BtnCalculateActionPerformed(evt);
        });

        Result.setText("Tax:");
        Result.setFont(new java.awt.Font("Dubai Light", 1,18));
        InputResult.addActionListener((java.awt.event.ActionEvent evt) -> {
            InputResultActionPerformed(evt);
        });

        Sar.setText("SAR");
        Sar.setFont(new java.awt.Font("Dubai Light", 1,18));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HighOfTax)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EnterValue)
                        .addGap(18, 18, 18)
                        .addComponent(InputValue, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FiveTax, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FifteenTax))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Result)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InputResult, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jLabel1,javax.swing.GroupLayout.DEFAULT_SIZE, 10,Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterValue)
                    .addComponent(Sar1))
                .addGap(18, 18, 18)
                .addComponent(HighOfTax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiveTax)
                    .addComponent(FifteenTax))
                .addGap(12, 12, 12)
                .addComponent(BtnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Result)
                    .addComponent(InputResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sar))
                .addContainerGap(27, Short.MAX_VALUE))
                .addComponent(jLabel1,javax.swing.GroupLayout.DEFAULT_SIZE, 10,Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void InputValueActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void TenTaxActionPerformed(java.awt.event.ActionEvent evt) {
        FifteenTax.setSelected(false);
    }

    private void TwelveTaxActionPerformed(java.awt.event.ActionEvent evt) {
        FiveTax.setSelected(false);
    }

    private void InputResultActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void BtnCalculateActionPerformed(java.awt.event.ActionEvent evt) {
        String StringValue = InputValue.getText();
        float ParsedValue = Float.parseFloat(StringValue);
        float ResultValue;
        
        if(FiveTax.isSelected()){
            ResultValue = (ParsedValue / 100)*15;
        } else {
            ResultValue = (ParsedValue / 100)*5;
        }
        
        String result =String.valueOf(ResultValue);
        InputResult.setText(result);
    }

    
    public static void Show() {
        java.awt.EventQueue.invokeLater(() -> {
            new Button2().setVisible(true);
        });
                }

    
    private javax.swing.JButton BtnCalculate;
    private javax.swing.JLabel EnterValue;
    private javax.swing.JLabel HighOfTax;
    private javax.swing.JTextField InputResult;
    private javax.swing.JTextField InputValue;
    private javax.swing.JLabel Result;
    private javax.swing.JRadioButton FiveTax;
    private javax.swing.JLabel Title;
    private javax.swing.JRadioButton FifteenTax;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel Sar1;
    private javax.swing.JLabel Sar;
    private javax.swing.JLabel jLabel1;
}