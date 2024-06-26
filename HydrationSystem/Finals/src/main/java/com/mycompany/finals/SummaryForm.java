/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finals;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class SummaryForm extends javax.swing.JFrame {
    
    private final Connection conn;
    String username, ml, time,
            sYear, sMonth, sDay, eYear, eMonth, eDay;
    private final DefaultTableModel tableModel;
    Date dateS;
    int userId;
    
    public SummaryForm() {
        initComponents();
        conn = Dbconnect.connectDbase();
        tableModel = (DefaultTableModel) tblsummary.getModel();
        populateComboBox();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsummary = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        cboStartYear = new javax.swing.JComboBox<>();
        cboStartMonth = new javax.swing.JComboBox<>();
        cboStartDay = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboEndYear = new javax.swing.JComboBox<>();
        cboEndMonth = new javax.swing.JComboBox<>();
        cboEndDay = new javax.swing.JComboBox<>();
        btnsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Summary");

        tblsummary.setBackground(new java.awt.Color(255, 255, 255));
        tblsummary.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblsummary.setForeground(new java.awt.Color(0, 0, 0));
        tblsummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Liters", "Time"
            }
        ));
        tblsummary.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblsummaryAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblsummary);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cboStartYear.setBackground(new java.awt.Color(255, 255, 255));
        cboStartYear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboStartYear.setForeground(new java.awt.Color(0, 0, 0));
        cboStartYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboStartMonth.setBackground(new java.awt.Color(255, 255, 255));
        cboStartMonth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboStartMonth.setForeground(new java.awt.Color(0, 0, 0));
        cboStartMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboStartDay.setBackground(new java.awt.Color(255, 255, 255));
        cboStartDay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboStartDay.setForeground(new java.awt.Color(0, 0, 0));
        cboStartDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Year");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Month");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Day");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("To");

        cboEndYear.setBackground(new java.awt.Color(255, 255, 255));
        cboEndYear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboEndYear.setForeground(new java.awt.Color(0, 0, 0));
        cboEndYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboEndMonth.setBackground(new java.awt.Color(255, 255, 255));
        cboEndMonth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboEndMonth.setForeground(new java.awt.Color(0, 0, 0));
        cboEndMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboEndDay.setBackground(new java.awt.Color(255, 255, 255));
        cboEndDay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboEndDay.setForeground(new java.awt.Color(0, 0, 0));
        cboEndDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnsearch.setBackground(new java.awt.Color(0, 255, 0));
        btnsearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(0, 0, 0));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnsearch))
                            .addComponent(cboEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboStartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboEndDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch))))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Dashboard db = new Dashboard();
        db.setVisible(true);
        setVisible(false);
        db.setLocation(null);     
        db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblsummaryAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblsummaryAncestorAdded
        // TODO add your handling code here:
        tableModel.setRowCount(0); 
      
        String startDate = sYear + "-" + sMonth + "-" + sDay;
        String endDate = eYear + "-" + eMonth + "-" + eDay;
        
        try {
            try (PreparedStatement pstmt = conn.prepareStatement(
                    "SELECT intake_date, intake_ml, intake_time FROM water_intake_log WHERE usersid = ? AND intake_date BETWEEN ? AND ?")) {
                pstmt.setInt(1, userId);
                pstmt.setDate(2, Date.valueOf(startDate));
                pstmt.setDate(3, Date.valueOf(endDate));

                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    dateS = rs.getDate("intake_date");
                    ml = rs.getString("intake_ml");
                    time = rs.getString("intake_time");
                    tableModel.addRow(new Object[]{dateS, ml, time});
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error occurred while retrieving data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblsummaryAncestorAdded

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        sYear = (String) cboStartYear.getSelectedItem();
         sMonth = (String) cboStartMonth.getSelectedItem();
         sDay = (String) cboStartDay.getSelectedItem();
         eYear = (String) cboEndYear.getSelectedItem();
         eMonth = (String) cboEndMonth.getSelectedItem();
         eDay = (String) cboEndDay.getSelectedItem();

        // Check if any date fields are not selected
        if (sYear.equals("Select Year") || sMonth.equals("Select Month") || sDay.equals("Select Day") ||
                eYear.equals("Select Year") || eMonth.equals("Select Month") || eDay.equals("Select Day")) {
            JOptionPane.showMessageDialog(this, "Please select valid start and end dates.");
            return;
        }

        // Construct the start and end date strings
        String startDate = sYear + "-" + sMonth + "-" + sDay;
        String endDate = eYear + "-" + eMonth + "-" + eDay;

        // Clear the table before populating with new data
        tableModel.setRowCount(0);

        try (PreparedStatement pstmt = conn.prepareStatement("SELECT intake_date, intake_ml, intake_time FROM water_intake_log WHERE usersid = ? AND intake_date BETWEEN ? AND ?")) {
            pstmt.setInt(1, userId);
            pstmt.setDate(2, Date.valueOf(startDate));
            pstmt.setDate(3, Date.valueOf(endDate));

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {                   
                    Date dateS = rs.getDate("intake_date");
                    String ml = rs.getString("intake_ml");
                    String time = rs.getString("intake_time");

                    tableModel.addRow(new Object[]{dateS, ml, time});
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error occurred while retrieving data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void populateComboBox() {
        // Populate start year combo box
        DefaultComboBoxModel<String> startYearsModel = new DefaultComboBoxModel<>();
        startYearsModel.addElement("Select Year");
        for (int i = 2000; i <= 2030; i++) {
            startYearsModel.addElement(String.valueOf(i));
        }
        cboStartYear.setModel(startYearsModel);

        // Populate end year combo box
        DefaultComboBoxModel<String> endYearsModel = new DefaultComboBoxModel<>();
        endYearsModel.addElement("Select Year");
        for (int i = 2000; i <= 2030; i++) {
            endYearsModel.addElement(String.valueOf(i));
        }
        cboEndYear.setModel(endYearsModel);

        // Populate start month combo box
        DefaultComboBoxModel<String> startMonthModel = new DefaultComboBoxModel<>();
        startMonthModel.addElement("Select Month");
        for (int i = 1; i <= 12; i++) {
            startMonthModel.addElement(String.format("%02d", i));
        }
        cboStartMonth.setModel(startMonthModel);

        // Populate end month combo box
        DefaultComboBoxModel<String> endMonthModel = new DefaultComboBoxModel<>();
        endMonthModel.addElement("Select Month");
        for (int i = 1; i <= 12; i++) {
            endMonthModel.addElement(String.format("%02d", i));
        }
        cboEndMonth.setModel(endMonthModel);

        // Populate start day combo box
        DefaultComboBoxModel<String> startDayModel = new DefaultComboBoxModel<>();
        startDayModel.addElement("Select Day");
        for (int i = 1; i <= 31; i++) {
            startDayModel.addElement(String.format("%02d", i));
        }
        cboStartDay.setModel(startDayModel);

        // Populate end day combo box
        DefaultComboBoxModel<String> endDayModel = new DefaultComboBoxModel<>();
        endDayModel.addElement("Select Day");
        for (int i = 1; i <= 31; i++) {
            endDayModel.addElement(String.format("%02d", i));
        }
        cboEndDay.setModel(endDayModel);
    }



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
            java.util.logging.Logger.getLogger(SummaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummaryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummaryForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cboEndDay;
    private javax.swing.JComboBox<String> cboEndMonth;
    private javax.swing.JComboBox<String> cboEndYear;
    private javax.swing.JComboBox<String> cboStartDay;
    private javax.swing.JComboBox<String> cboStartMonth;
    private javax.swing.JComboBox<String> cboStartYear;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsummary;
    // End of variables declaration//GEN-END:variables
}
