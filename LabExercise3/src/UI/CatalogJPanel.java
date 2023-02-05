
package UI;

import Model.Application;
import Model.Medicine;
import Model.MedicineCatalog;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CatalogJPanel extends javax.swing.JPanel {

    private Application application;

   
    
    DefaultTableModel medTableModel;
    
    CatalogJPanel(Application application) {
        initComponents();
        
        this.application = application;
        this.medTableModel = (DefaultTableModel) table.getModel();
        
        displayMedicineCatalog();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        fieldb = new javax.swing.JTextField();
        fielda = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Dosage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 340));
        add(fieldb, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 160, 50));

        fielda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldaFocusLost(evt);
            }
        });
        fielda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldaActionPerformed(evt);
            }
        });
        add(fielda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 160, 50));

        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("             CATALOG FRAME");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 340, -1));

        jLabel2.setText("MEDICINE NAME -");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel3.setText("DOSAGE AMOUNT-");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldaActionPerformed
        
    }//GEN-LAST:event_fieldaActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
       
        
        String name = fielda.getText();
        String dosage = fieldb.getText();
      
        
        MedicineCatalog catalog = this.application.getCatalog();
                
        catalog.createMedicine(name, Double.valueOf(dosage));
        
     
        displayMedicineCatalog();
    }//GEN-LAST:event_addBtnActionPerformed

    private void fieldaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldaFocusLost
        
        
        String name = fielda.getText();
        
        Boolean isUnique = this.application.getCatalog().checkIfMedicineUnique(name);
        
        if(isUnique) {
            
        } else {
            fielda.setText("");
            JOptionPane.showMessageDialog(null, "Medicine already exists");
        }
        
    }//GEN-LAST:event_fieldaFocusLost

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
      
        
        int selectedRow = table.getSelectedRow();
        
        if(selectedRow >= 0) {
            
       
            Medicine med = (Medicine) table.getValueAt(selectedRow, 0);
            
            this.application.getCatalog().removeMedicine(med.getMedicineName());
            
            displayMedicineCatalog();
        } else {
            
        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    public void displayMedicineCatalog() {
      
        
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        
        if(medicines.size() > 0) {
          
            
            medTableModel.setRowCount(0);
            
            for(Medicine med: medicines) {
                
            
                Object row[] = new Object[2];
                row[0] = med;
                row[1] = med.getDosage();
                
                medTableModel.addRow(row);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fielda;
    private javax.swing.JTextField fieldb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
