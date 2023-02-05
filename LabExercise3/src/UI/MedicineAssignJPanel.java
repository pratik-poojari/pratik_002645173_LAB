
package UI;

import Model.Application;
import Model.Medicine;
import Model.Observation;
import java.util.ArrayList;


public class MedicineAssignJPanel extends javax.swing.JPanel {

    private Application application;

    
    MedicineAssignJPanel(Application application) {
        initComponents();
        
        this.application = application;
        
        populateDropdowns();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicinebtn = new javax.swing.JComboBox();
        Observationbtn = new javax.swing.JComboBox();
        assignbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(medicinebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 190, 30));

        Observationbtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ObservationbtnItemStateChanged(evt);
            }
        });
        add(Observationbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 200, 30));

        assignbtn.setText("ASSIGN");
        assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtnActionPerformed(evt);
            }
        });
        add(assignbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 300, 130, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 90, 60));

        jLabel2.setText("MEDICINE NAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, -1));

        jLabel3.setText("ID ASSIGNED TO -");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("MEDICINE ASSIGNED TO - ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 260, -1));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 80, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void assignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignbtnActionPerformed
      
        
        Observation o = (Observation) Observationbtn.getSelectedItem();
        Medicine m = (Medicine) medicinebtn.getSelectedItem();
          if(o.getMedication() != null) {
           jLabel1.setText(o.getMedication().getMedicineName());
           jLabel5.setText(String.valueOf(o.getObservationId()));
        }
        
        o.setMedication(m);
        
    }//GEN-LAST:event_assignbtnActionPerformed

    private void ObservationbtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ObservationbtnItemStateChanged
       
        Observation o = (Observation) Observationbtn.getSelectedItem();
        
       
        
    }//GEN-LAST:event_ObservationbtnItemStateChanged

    public void populateDropdowns() {
        
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        
        ArrayList<Observation> observations = this.application.getHistory().getVitalSignHistory();
        
        for(Observation o: observations) {
            Observationbtn.addItem(o);
        }
        
        for(Medicine med: medicines) {
            medicinebtn.addItem(med);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Observationbtn;
    private javax.swing.JButton assignbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox medicinebtn;
    // End of variables declaration//GEN-END:variables
}
