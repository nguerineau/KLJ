/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package klj.display;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author meuni
 */
public class reservations extends javax.swing.JFrame {

    /**
     * Creates new form reservations
     */
    public reservations() {
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

        textReservationsTitle = new java.awt.Label();
        titlePARK = new java.awt.Label();
        textTLA = new java.awt.Label();
        childTicketsTLA = new java.awt.Label();
        regularTicketsTLA = new java.awt.Label();
        seniorTicketsTLA = new java.awt.Label();
        refreshButton = new javax.swing.JButton();
        childTicketsAT = new java.awt.Label();
        seniorTicketsAT = new java.awt.Label();
        regularTicketsAT = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textReservationsTitle.setAlignment(java.awt.Label.CENTER);
        textReservationsTitle.setBackground(new java.awt.Color(255, 255, 0));
        textReservationsTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textReservationsTitle.setText("Tickets Book ");

        titlePARK.setBackground(new java.awt.Color(255, 153, 51));
        titlePARK.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        titlePARK.setText("Your Tickets for the Park A T Risk Ride");

        textTLA.setBackground(new java.awt.Color(51, 255, 255));
        textTLA.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textTLA.setText("Your Tickets for the T La T Pu  LA ride");

        childTicketsTLA.setBackground(new java.awt.Color(51, 255, 255));
        childTicketsTLA.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        childTicketsTLA.setText(childticketTLATPU + " Child Tickets");

        regularTicketsTLA.setBackground(new java.awt.Color(51, 255, 255));
        regularTicketsTLA.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        regularTicketsTLA.setText(regularticketTLATPU+" Regular Tickets");

        seniorTicketsTLA.setBackground(new java.awt.Color(51, 255, 255));
        seniorTicketsTLA.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        seniorTicketsTLA.setText(seniorticketTLATPU +" Senior Tickets");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        childTicketsAT.setBackground(new java.awt.Color(255, 153, 51));
        childTicketsAT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        childTicketsAT.setText(childticketAteam+" Child Tickets");

        seniorTicketsAT.setBackground(new java.awt.Color(255, 153, 51));
        seniorTicketsAT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        seniorTicketsAT.setText(seniorticketAteam+" Senior Tickets");

        regularTicketsAT.setBackground(new java.awt.Color(255, 153, 51));
        regularTicketsAT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        regularTicketsAT.setText(regularticketAteam+" Regular Tickets");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regularTicketsTLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seniorTicketsTLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(childTicketsTLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(childTicketsAT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regularTicketsAT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seniorTicketsAT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePARK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textReservationsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refreshButton)
                        .addGap(190, 190, 190))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textReservationsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshButton)
                .addGap(22, 22, 22)
                .addComponent(textTLA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(childTicketsTLA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regularTicketsTLA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seniorTicketsTLA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(titlePARK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(childTicketsAT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regularTicketsAT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seniorTicketsAT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        setBounds(725, 50, 491, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        
        String url = "jdbc:mysql://localhost:8889/KLJ?zeroDateTimeBehavior=CONVERT_TO_NULL";
        // Database credentials
        

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Establishing a connection
            connection = DriverManager.getConnection(url, "root", "root");

            // SQL query with placeholders
            String sql = "SELECT ticket_regular, tiket_child, ticket_senior FROM ticket WHERE ride=1";
            
            // Create a PreparedStatement
            preparedStatement = connection.prepareStatement(sql);
            
            // Execute the query
            resultSet = preparedStatement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                
                //getting value
                childticketTLATPU = resultSet.getInt("tiket_child");
                regularticketTLATPU = resultSet.getInt("tiket_regular");
                seniorticketTLATPU = resultSet.getInt("tiket_senior");
                
                // update value
                childTicketsTLA.setText(childticketTLATPU+" Child Tickets");
                regularTicketsTLA.setText(regularticketTLATPU+" Regular Tickets");
                seniorTicketsTLA.setText(seniorticketTLATPU+" Senior Tickets");
                

            }
            
        // SQL query with placeholders
            sql = "SELECT ticket_regular, tiket_child, ticket_senior FROM ticket WHERE ride=2";
            
            // Create a PreparedStatement
            preparedStatement = connection.prepareStatement(sql);
            
            // Execute the query
            resultSet = preparedStatement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                
                //getting value
                childticketAteam = resultSet.getInt("tiket_child");
                regularticketAteam = resultSet.getInt("tiket_regular");
                seniorticketAteam = resultSet.getInt("tiket_senior");
                
                // update value
                childTicketsAT.setText(childticketAteam+" Child Tickets");
                regularTicketsAT.setText(regularticketAteam+" Regular Tickets");
                seniorTicketsAT.setText(seniorticketAteam+" Senior Tickets");
                

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
        
        
        childTicketsAT.setText(childticketAteam +" Child Tickets");
        regularTicketsAT.setText(regularticketAteam +" Regular Tickets");
        seniorTicketsAT.setText(seniorticketAteam +" Senior Tickets");
        
        
    }//GEN-LAST:event_refreshButtonActionPerformed

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
            java.util.logging.Logger.getLogger(reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservations().setVisible(true);
            }
        });
    }
    
    int regularticketAteam ;
    int regularticketTLATPU;
    int seniorticketAteam ;
    int seniorticketTLATPU;
    int childticketAteam ;
    int childticketTLATPU;
    public String ticketsForTLAChild;
    public String ticketsForATEAM;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label childTicketsAT;
    private java.awt.Label childTicketsTLA;
    private javax.swing.JButton refreshButton;
    private java.awt.Label regularTicketsAT;
    private java.awt.Label regularTicketsTLA;
    private java.awt.Label seniorTicketsAT;
    private java.awt.Label seniorTicketsTLA;
    private java.awt.Label textReservationsTitle;
    private java.awt.Label textTLA;
    private java.awt.Label titlePARK;
    // End of variables declaration//GEN-END:variables
}
