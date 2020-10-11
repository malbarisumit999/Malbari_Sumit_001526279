/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Cars;
import Business.CarsDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author sai
 */
public class CarWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CarWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private CarsDirectory carsDirectory;
    private Cars cars;

    CarWorkAreaJPanel(JPanel userProcessContainer, CarsDirectory carsDirectory, Cars cars) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.carsDirectory = carsDirectory;
        this.cars = cars;
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddCar = new javax.swing.JButton();
        btnManageCar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        btnAddCar.setBackground(new java.awt.Color(255, 255, 0));
        btnAddCar.setText("Add Car");
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });

        btnManageCar.setBackground(new java.awt.Color(255, 255, 0));
        btnManageCar.setText("Manage Car");
        btnManageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageCar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageCar)
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCarActionPerformed
        // TODO add your handling code here:
        ManageCarJPanel managecarpanel = new ManageCarJPanel(userProcessContainer, carsDirectory, cars);
        userProcessContainer.add("ManageCarJPanel",managecarpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageCarActionPerformed

    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarActionPerformed
        // TODO add your handling code here:
        AddCar addcarpanel = new AddCar(userProcessContainer, carsDirectory);
        userProcessContainer.add("AddCar",addcarpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnAddCarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCar;
    private javax.swing.JButton btnManageCar;
    // End of variables declaration//GEN-END:variables
}