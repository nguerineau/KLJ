/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package klj.ride;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import klj.display.register;

/**
 *
 * @author meuni
 */
public class parkATRisk extends javax.swing.JFrame {

    /**
     * Creates new form parkATRisk
     */
    public parkATRisk() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regularTicketsNumber = new javax.swing.JTextField();
        childTicketsNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        senior = new java.awt.Label();
        regular = new java.awt.Label();
        child = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        seniorTicketsNumber = new javax.swing.JTextField();
        ticketsBookATeam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        regularTicketsNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regularTicketsNumberFocusLost(evt);
            }
        });
        regularTicketsNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularTicketsNumberActionPerformed(evt);
            }
        });

        childTicketsNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                childTicketsNumberFocusLost(evt);
            }
        });
        childTicketsNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childTicketsNumberActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ATeamBackground.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        senior.setBackground(new java.awt.Color(255, 102, 51));
        senior.setText("Senior Tickets");

        regular.setBackground(new java.awt.Color(255, 102, 51));
        regular.setText("Regular Tickets");

        child.setBackground(new java.awt.Color(255, 102, 51));
        child.setText("Child Tickets");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/A-Team.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        seniorTicketsNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                seniorTicketsNumberFocusLost(evt);
            }
        });
        seniorTicketsNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seniorTicketsNumberActionPerformed(evt);
            }
        });

        ticketsBookATeam.setBackground(new java.awt.Color(0, 255, 204));
        ticketsBookATeam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ticketsBookATeam.setForeground(new java.awt.Color(255, 255, 0));
        ticketsBookATeam.setText("Book");
        ticketsBookATeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketsBookATeamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(child, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senior, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regularTicketsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(childTicketsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seniorTicketsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap(191, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ticketsBookATeam)
                        .addGap(62, 62, 62))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(childTicketsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(regularTicketsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(child, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(regular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(senior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seniorTicketsNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ticketsBookATeam)
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regularTicketsNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularTicketsNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regularTicketsNumberActionPerformed

    private void childTicketsNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childTicketsNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_childTicketsNumberActionPerformed

    private void seniorTicketsNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seniorTicketsNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seniorTicketsNumberActionPerformed

    private void seniorTicketsNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_seniorTicketsNumberFocusLost
        seniorticketString = seniorTicketsNumber.getText();
        seniorticket = Integer.parseInt(seniorticketString);
        
    }//GEN-LAST:event_seniorTicketsNumberFocusLost

    private void ticketsBookATeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsBookATeamActionPerformed
        String url="jdbc:mysql://localhost:8889/KLJ?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        Connection con;
        try {
            con = DriverManager.getConnection(url,"root","root");
            PreparedStatement stmt2 = con.prepareStatement("INSERT INTO klj.ticket (ticket_regular, tiket_child, ticket_senior, ride)  VALUES (?, ?, ?, ?)");

        stmt2.setInt(1,regularticket);
        stmt2.setInt(2,childticket);
        stmt2.setInt(3,seniorticket);
        stmt2.setInt(4,ride);
        
        stmt2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_ticketsBookATeamActionPerformed

    private void childTicketsNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_childTicketsNumberFocusLost
        childticketString = childTicketsNumber.getText();
        childticket = Integer.parseInt(childticketString);
    }//GEN-LAST:event_childTicketsNumberFocusLost

    private void regularTicketsNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regularTicketsNumberFocusLost
        regularticketString = regularTicketsNumber.getText();
        regularticket = Integer.parseInt(regularticketString);
    }//GEN-LAST:event_regularTicketsNumberFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(parkATRisk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parkATRisk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parkATRisk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parkATRisk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parkATRisk().setVisible(true);
            }
        });
    }
    int ride = 2;
    String regularticketString ;
    int regularticket;
    String seniorticketString ;
    int seniorticket;
    String childticketString ;
    int childticket;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label child;
    private javax.swing.JTextField childTicketsNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label regular;
    private javax.swing.JTextField regularTicketsNumber;
    private java.awt.Label senior;
    private javax.swing.JTextField seniorTicketsNumber;
    private javax.swing.JButton ticketsBookATeam;
    // End of variables declaration//GEN-END:variables
}
