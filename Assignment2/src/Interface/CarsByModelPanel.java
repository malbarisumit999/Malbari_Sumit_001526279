/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Cars;
import Business.CarsDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sai
 */
public class CarsByModelPanel extends javax.swing.JPanel {

    /**
     * Creates new form CarsByModelPanel
     */
    
    private JPanel userProcessContainer;
    private String textModelNumber;
    private CarsDirectory carsDirectory;

    CarsByModelPanel(JPanel userProcessContainer, String textModelNumber, CarsDirectory carsDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.textModelNumber = textModelNumber;
        this.carsDirectory = carsDirectory;
        populateCarsByModelTable();
    }

     public void populateCarsByModelTable(){
        DefaultTableModel tcb = (DefaultTableModel) tblModelNumber.getModel();
        tcb.setRowCount(0);
        
        
        for(Cars cars: carsDirectory.getCarsDirectory()){
            
            System.out.println(cars.getModelNumber());
            System.out.println(cars.getBrandName());
            System.out.println(cars.getSerialNumber());
            System.out.println(cars.getCity());
            
            Object[] row =  new Object[4];
            row[0]= cars;
            row[1]=cars.getBrandName();
            row[2]=cars.getSerialNumber();
            row[3]=cars.getCity();
            
            //tcb.addRow(row);
            if(textModelNumber.equalsIgnoreCase(cars.getModelNumber())){
               tcb.addRow(row);
            }
            
        }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblModelNumber = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 0));

        tblModelNumber.setBackground(new java.awt.Color(153, 153, 255));
        tblModelNumber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cars Model", "Serial Number", "Brand Name", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblModelNumber);
        if (tblModelNumber.getColumnModel().getColumnCount() > 0) {
            tblModelNumber.getColumnModel().getColumn(0).setResizable(false);
            tblModelNumber.getColumnModel().getColumn(1).setResizable(false);
            tblModelNumber.getColumnModel().getColumn(2).setResizable(false);
            tblModelNumber.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(204, 0, 204));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblModelNumber;
    // End of variables declaration//GEN-END:variables
}
