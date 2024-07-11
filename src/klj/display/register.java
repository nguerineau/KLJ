/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package klj.display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
* The error text message is here to show to the user an error 
* The variable used is an int named registerDoor
* the different type of error :
* registerDoor = 0 no action have been performed to create an account
* registerDoor = 1 the password does not match
*
*/

/**
 *
 * @author nicolasguerineau
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        LName = new javax.swing.JTextField();
        countryName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dayBirth = new javax.swing.JTextField();
        monthBirth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        yearbirth = new javax.swing.JTextField();
        emailRegister = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        passwordMemory = new javax.swing.JPasswordField();
        passwordConfirm = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        homePageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica", 3, 18)); // NOI18N
        jLabel1.setText("registration");

        jLabel2.setText("email");

        fName.setText("Enter your name here");
        fName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fNameFocusLost(evt);
            }
        });
        fName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fNameMouseClicked(evt);
            }
        });
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        LName.setText("Enter your last name here");
        LName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LNameFocusLost(evt);
            }
        });
        LName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LNameMouseClicked(evt);
            }
        });
        LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameActionPerformed(evt);
            }
        });

        countryName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                countryNameFocusLost(evt);
            }
        });

        jLabel3.setText("first name ");

        jLabel4.setText("last name");

        jLabel5.setText("date of birth ");

        jLabel6.setText("contry of origin");

        dayBirth.setText("DD");
        dayBirth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dayBirthMouseClicked(evt);
            }
        });
        dayBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayBirthActionPerformed(evt);
            }
        });

        monthBirth.setText("MM");
        monthBirth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthBirthMouseClicked(evt);
            }
        });
        monthBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBirthActionPerformed(evt);
            }
        });

        jLabel7.setText("/");

        jLabel8.setText("/");

        yearbirth.setText("YYYY");
        yearbirth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearbirthMouseClicked(evt);
            }
        });
        yearbirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearbirthActionPerformed(evt);
            }
        });

        emailRegister.setText("exemplemail@test.com");
        emailRegister.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailRegisterFocusLost(evt);
            }
        });
        emailRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailRegisterMouseClicked(evt);
            }
        });

        jLabel9.setText("password");

        jLabel10.setText("comfirm password");

        passwordMemory.setText("enterpassword");
        passwordMemory.setPreferredSize(new java.awt.Dimension(70, 25));
        passwordMemory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordMemoryFocusLost(evt);
            }
        });
        passwordMemory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMemoryMouseClicked(evt);
            }
        });
        passwordMemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordMemoryActionPerformed(evt);
            }
        });

        passwordConfirm.setText("enterpassword");
        passwordConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordConfirmFocusLost(evt);
            }
        });
        passwordConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordConfirmMouseClicked(evt);
            }
        });

        registerButton.setText("register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        homePageButton.setText("Home");
        homePageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dayBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monthBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(countryName)
                                    .addComponent(LName)
                                    .addComponent(fName))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordConfirm)
                                    .addComponent(passwordMemory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homePageButton)
                        .addGap(49, 49, 49)
                        .addComponent(registerButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dayBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(yearbirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(passwordMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(passwordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LNameActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void dayBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayBirthActionPerformed

    private void monthBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthBirthActionPerformed

    private void yearbirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearbirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearbirthActionPerformed

    private void passwordMemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordMemoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordMemoryActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here: 
        if(registerDoor == 0){
            JOptionPane.showMessageDialog(null,"Several array must be fill");
        }
        else if(registerDoor == 1){
            JOptionPane.showMessageDialog(null,"Password does not match");
        }
        else {
            username = firstName+"_"+lastName;
            
            //username = "username";
            JOptionPane.showMessageDialog(null,"Your username is : "+username);
        }
        
        String password =passwordCatch;
        String url="jdbc:mysql://localhost:8889/KLJ?zeroDateTimeBehavior=CONVERT_TO_NULL";
        
        Connection con;
        try {
            con = DriverManager.getConnection(url,"root","root");
            PreparedStatement stmt2 = con.prepareStatement("INSERT INTO account(username, type,password,mail,country) VALUES (?, ?, ?, ?, ?)");

        stmt2.setString(1,username);
        stmt2.setInt(2, 1);
        stmt2.setString(3,password);
        stmt2.setString(4,myMail);//mail
        stmt2.setString(6,country);//counrty
        stmt2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void homePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_homePageButtonActionPerformed

    private void fNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fNameMouseClicked
        // TODO add your handling code here:
        fName.setText("");
    }//GEN-LAST:event_fNameMouseClicked

    private void dayBirthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayBirthMouseClicked
        // TODO add your handling code here:
        dayBirth.setText("");
    }//GEN-LAST:event_dayBirthMouseClicked

    private void monthBirthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthBirthMouseClicked
        // TODO add your handling code here:
        monthBirth.setText("");
    }//GEN-LAST:event_monthBirthMouseClicked

    private void yearbirthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearbirthMouseClicked
        // TODO add your handling code here:
        yearbirth.setText("");
    }//GEN-LAST:event_yearbirthMouseClicked

    private void passwordMemoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMemoryMouseClicked
        // TODO add your handling code here:
         passwordMemory.setText("");
    }//GEN-LAST:event_passwordMemoryMouseClicked

    private void passwordMemoryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordMemoryFocusLost
        // TODO add your handling code here:
        passwordCatch = passwordMemory.getText();
        if (passwordCatch.equals(passwordTest)){
            registerDoor = 10;
        }
        else{
            registerDoor = 1;
        }
        
        
    }//GEN-LAST:event_passwordMemoryFocusLost

    private void passwordConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordConfirmMouseClicked
        // TODO add your handling code here:
        passwordConfirm.setText("");
    }//GEN-LAST:event_passwordConfirmMouseClicked

    private void passwordConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordConfirmFocusLost
        // TODO add your handling code here:
        passwordTest = passwordConfirm.getText();
        if (passwordCatch.equals(passwordTest)){
            registerDoor = 10;
            
        }
        
        else{
            registerDoor = 1;
        }
    }//GEN-LAST:event_passwordConfirmFocusLost

    private void fNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameFocusLost
        // TODO add your handling code here:
        firstName = fName.getText();
    }//GEN-LAST:event_fNameFocusLost

    private void LNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LNameMouseClicked
        // TODO add your handling code here:
        LName.setText("");
    }//GEN-LAST:event_LNameMouseClicked

    private void LNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LNameFocusLost
        // TODO add your handling code here:
        lastName = LName.getText();
    }//GEN-LAST:event_LNameFocusLost

    private void emailRegisterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailRegisterFocusLost
        // TODO add your handling code here:
        myMail = emailRegister.getText();
    }//GEN-LAST:event_emailRegisterFocusLost

    private void emailRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailRegisterMouseClicked
        // TODO add your handling code here:
        emailRegister.setText("");
    }//GEN-LAST:event_emailRegisterMouseClicked

    private void countryNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryNameFocusLost
        // TODO add your handling code here:
        country = countryName.getText();
    }//GEN-LAST:event_countryNameFocusLost

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }
    protected String username;
    protected int registerDoor=0; // like a real door to allow you to register. Also not very nice :(
    protected String myMail;
    protected String country; //Country Road take me Home!
    protected String firstName;
    protected String lastName;
    protected String passwordCatch;
    protected String passwordTest;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LName;
    private javax.swing.JTextField countryName;
    private javax.swing.JTextField dayBirth;
    private javax.swing.JTextField emailRegister;
    private javax.swing.JTextField fName;
    private javax.swing.JButton homePageButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField monthBirth;
    private javax.swing.JPasswordField passwordConfirm;
    private javax.swing.JPasswordField passwordMemory;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField yearbirth;
    // End of variables declaration//GEN-END:variables
}
