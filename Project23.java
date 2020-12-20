/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project23;


import java.awt.event.ActionEvent;


public class Project23 extends javax.swing.JFrame {

    public Project23() {
        initComponents();
    }

 
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
       
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan/Tax Calc");
        
       jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\F M K\\Documents\\NetBeansProjects\\Project23\\src\\project23\\Screenshot_15.png"));
         
        jButton1.setText("Loan");
        jButton1.setFont(new java.awt.Font("Dubai Light", 1,30));
        jButton1.setBackground(new java.awt.Color(255,255,204));
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton1ActionPerformed(evt);
        });
            
    jButton2.setText("Tax");
    jButton2.setFont(new java.awt.Font("Dubai Light", 1,30));
    jButton2.setBackground(new java.awt.Color(255,255,204));
            jButton2.addActionListener((ActionEvent evt) -> {
                jButton2ActionPerformed(evt);
        });

            
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(67, Short.MAX_VALUE))
                                 .addComponent(jLabel1,javax.swing.GroupLayout.DEFAULT_SIZE, 10,Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(85, Short.MAX_VALUE))
                             .addComponent(jLabel1,javax.swing.GroupLayout.DEFAULT_SIZE, 10,Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Button1 s1 = new Button1();
        Button1.createAndShowGUI();

      
    }
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
      Button2 s2 = new Button2();
        Button2.Show();
}
    
    public static void main(String args[]) {



        java.awt.EventQueue.invokeLater(() -> {
            new Project23().setVisible(true);
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
   
}