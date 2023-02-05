
package UI;

import Model.Application;


public class MainJFrame extends javax.swing.JFrame {

    
    
    Application application;
    
    public MainJFrame() {
        initComponents();
        
        this.application = new Application();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlJPanel = new javax.swing.JPanel();
        assignBtn = new javax.swing.JButton();
        createbtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        catalogbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlJPanel.setBackground(new java.awt.Color(51, 255, 255));
        ControlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignBtn.setText("ASSIGN ");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 50));

        createbtn.setText("CREATE ");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(createbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 50));

        viewbtn.setText("VIEW VITAL  HISTORY");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 50));

        catalogbtn.setText("CATALOG");
        catalogbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogbtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(catalogbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, 50));

        jSplitPane1.setLeftComponent(ControlJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
      
        
        jSplitPane1.setRightComponent(new MedicineAssignJPanel(this.application));
    }//GEN-LAST:event_assignBtnActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
    
        
        jSplitPane1.setRightComponent(new CreateJPanel(this.application));
    }//GEN-LAST:event_createbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
       
        jSplitPane1.setRightComponent(new ViewJPanel(this.application));
    }//GEN-LAST:event_viewbtnActionPerformed

    private void catalogbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogbtnActionPerformed
       
        jSplitPane1.setRightComponent(new CatalogJPanel(this.application));
    }//GEN-LAST:event_catalogbtnActionPerformed

    
    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton catalogbtn;
    private javax.swing.JButton createbtn;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
