
package UI;

import Model.Application;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;


public class CreateJPanel extends javax.swing.JPanel {

    private Application application;

   
   

    CreateJPanel(Application application) {
        initComponents();
        
        this.application = application;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bloodpressure = new javax.swing.JTextField();
        temp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("CREATE A VITAL SIGNATURE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 280, 40));

        fieldid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldidActionPerformed(evt);
            }
        });
        add(fieldid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, 30));

        jLabel2.setText("Blood Pressure");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        add(bloodpressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 120, 30));
        add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 130, 30));

        jLabel3.setText("ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 20, -1));

        jLabel4.setText("Temperature");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        addbtn.setText("ADD OBSERVATION");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
      
        
        VitalSignHistory history = this.application.getHistory();
        
      
        
        String id = fieldid.getText();
        String temperature = temp.getText();
        String bloodPressure = bloodpressure.getText();
        
       
        
        history.createObservation(Integer.valueOf(id), Double.valueOf(bloodPressure), Double.valueOf(temperature));
        
        JOptionPane.showMessageDialog(null, "Added observation");
    }//GEN-LAST:event_addbtnActionPerformed

    private void fieldidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldidActionPerformed
       
    }//GEN-LAST:event_fieldidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField bloodpressure;
    private javax.swing.JTextField fieldid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField temp;
    // End of variables declaration//GEN-END:variables
}
