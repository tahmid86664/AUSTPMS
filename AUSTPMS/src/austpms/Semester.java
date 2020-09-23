/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package austpms;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author tahmi
 */
public class Semester extends javax.swing.JFrame {

    /**
     * Creates new form Semester
     */
    public Semester() {
        initComponents();
        screenShowing();
    }
    
    
    private void screenShowing(){
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        //setSize(size.width/2, size.height/2 + 100);
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
    }
    
    private boolean checkDatePattern(String date){
        String datePattern = "\\d{4}-\\d{1,2}-\\d{1,2}";
        return date.matches(datePattern);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        semNameField = new javax.swing.JTextField();
        semStartDateField = new javax.swing.JTextField();
        semEndDateField = new javax.swing.JTextField();
        semSubmitButton = new javax.swing.JButton();
        semChangeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Handle Semester Dates");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Semester Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Start Date:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("End Date:");

        semNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        semStartDateField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        semEndDateField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        semSubmitButton.setBackground(new java.awt.Color(102, 102, 102));
        semSubmitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        semSubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        semSubmitButton.setText("Submit");
        semSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semSubmitButtonActionPerformed(evt);
            }
        });

        semChangeButton.setBackground(new java.awt.Color(204, 51, 0));
        semChangeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        semChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        semChangeButton.setText("Change");
        semChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semChangeButtonActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("**format: 2020-04-30");

        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("**format: 2020-04-30");

        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("(**Can change only one date or both using semester name)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(semChangeButton)
                .addGap(18, 18, 18)
                .addComponent(semSubmitButton)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(57, 57, 57)
                                .addComponent(semEndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(semNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(51, 51, 51)
                                .addComponent(semStartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(semNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(semStartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(semEndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semSubmitButton)
                    .addComponent(semChangeButton))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void semSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semSubmitButtonActionPerformed
        // TODO add your handling code here:
        String name = semNameField.getText();
        String startDate = semStartDateField.getText();
        String endDate = semEndDateField.getText();
        
        String datePattern = "\\d{4}-\\d{1,2}-\\d{1,2}";
        boolean isStartDate = startDate.matches(datePattern);
        boolean isEndDate = endDate.matches(datePattern);
        
        if(name.equals("") || startDate.equals("") || endDate.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the filed");
        }else{
            if(!isStartDate || !isEndDate ){
                JOptionPane.showMessageDialog(null, "Date format error");
            }
            else{
                ConnectDatabase db = new ConnectDatabase();
                db.ConnectDB();

                db.storeSemesterInfo(name, startDate, endDate);
                
            }
        }
    }//GEN-LAST:event_semSubmitButtonActionPerformed

    private void semChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semChangeButtonActionPerformed
        // TODO add your handling code here:
        String name = semNameField.getText();
        String startDate = semStartDateField.getText();
        String endDate = semEndDateField.getText();
        boolean isStartDate = checkDatePattern(startDate);
        boolean isEndDate = checkDatePattern(endDate);
        
        if(name.equals("") || (!isStartDate && !isEndDate)){
            JOptionPane.showMessageDialog(null, "Please fill the name and at least one date to change in correct format");
        }else{
            ConnectDatabase db = new ConnectDatabase();
            db.ConnectDB();

            db.updateSemesterInfo(name, startDate, endDate);
            
        }
    }//GEN-LAST:event_semChangeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Semester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Semester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Semester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Semester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Semester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton semChangeButton;
    private javax.swing.JTextField semEndDateField;
    private javax.swing.JTextField semNameField;
    private javax.swing.JTextField semStartDateField;
    private javax.swing.JButton semSubmitButton;
    // End of variables declaration//GEN-END:variables
}
