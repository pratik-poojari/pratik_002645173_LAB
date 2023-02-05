
package UI;

import Model.Application;
import Model.Observation;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewJPanel extends javax.swing.JPanel {

    private Application application;
    DefaultTableModel viewtableModel;
    Observation selectedObservation;

   
    ViewJPanel(Application application) {
        initComponents();

        this.application = application;
        this.viewtableModel = (DefaultTableModel) table1.getModel();

       
        displayObservations();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pressure = new javax.swing.JTextField();
        temp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        viewbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("VIEW AND UPDATE PANEL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 270, 40));

        idfield.setEnabled(false);
        add(idfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, 30));

        jLabel2.setText("Blood Pressure");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        add(pressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 120, 30));
        add(temp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 120, 30));

        jLabel3.setText("ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setText("Temperature");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        updateBtn.setText("UPDATE OBSERVATION");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Temperature", "BP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 340));

        viewbtn.setText("VIEW DETAILS");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
     
       
        if (!idfield.getText().isEmpty()) {

          
            Observation o = this.application.getHistory().findObservation(Integer.valueOf(idfield.getText()));
            o.setBloodPressure(Double.valueOf(pressure.getText()));
            o.setTemperature(Double.valueOf(temp.getText()));

           
            
        } else {
            JOptionPane.showMessageDialog(null, "You have not made any selection");
        }
        
        displayObservations();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
     
        int selectedRow = table1.getSelectedRow();

        if (selectedRow >= 0) {

         
            this.selectedObservation = (Observation) table1.getValueAt(selectedRow, 0);

            
            idfield.setText(String.valueOf(this.selectedObservation.getObservationId()));
            pressure.setText(String.valueOf(this.selectedObservation.getBloodPressure()));
            temp.setText(String.valueOf(this.selectedObservation.getTemperature()));

        } else {

            JOptionPane.showMessageDialog(null, "Please select a row!");
        }

    }//GEN-LAST:event_viewbtnActionPerformed

    public void displayObservations() {
        VitalSignHistory history = this.application.getHistory();

        if (history.getVitalSignHistory().size() > 0) {
          

            viewtableModel.setRowCount(0);
            for (Observation o : history.getVitalSignHistory()) {
             

                Object row[] = new Object[3];
                row[0] = o;
                row[1] = o.getTemperature();
                row[2] = o.getBloodPressure();

                
                viewtableModel.addRow(row);

            }

        } else {
            System.out.print("Empty list");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pressure;
    private javax.swing.JTable table1;
    private javax.swing.JTextField temp;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
