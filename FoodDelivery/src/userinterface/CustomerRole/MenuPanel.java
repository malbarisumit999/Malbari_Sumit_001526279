/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Organization;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class MenuPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Restaurant restaurant;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    ArrayList<Dishes> items=new ArrayList<Dishes>();
    int sum = 0;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public MenuPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, Restaurant restaurant) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.restaurant = restaurant;
        
        populateMenuTable();
    }
    
    public void populateMenuTable(){
         DefaultTableModel tablemodel = (DefaultTableModel) tblMenu.getModel();
        
            tablemodel.setRowCount(0);
                Object[] row = new Object[3];
                for(Dishes dish:restaurant.getMenu()){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     tablemodel.addRow(row);
                } 
    }
    
    public void populateCart(Dishes dishitem){
        DefaultTableModel tablemodel = (DefaultTableModel) tblCart.getModel();
        tablemodel.setRowCount(0);
        
         items.add(dishitem);
         Object[] row = new Object[3];
                for(Dishes dish:items){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     sum=sum+Integer.parseInt(dish.getPrice());
                     tablemodel.addRow(row);
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
        jTable1 = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        btnRemoveFromCart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 100, -1));
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 150, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Your Cart :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 120, 30));

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);
        if (tblCart.getColumnModel().getColumnCount() > 0) {
            tblCart.getColumnModel().getColumn(0).setResizable(false);
            tblCart.getColumnModel().getColumn(1).setResizable(false);
            tblCart.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 130));

        btnAddToCart.setText("Add To Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, -1));

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMenu);
        if (tblMenu.getColumnModel().getColumnCount() > 0) {
            tblMenu.getColumnModel().getColumn(0).setResizable(false);
            tblMenu.getColumnModel().getColumn(1).setResizable(false);
            tblMenu.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 130));

        btnRemoveFromCart.setText("Remove Item");
        btnRemoveFromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFromCartActionPerformed(evt);
            }
        });
        add(btnRemoveFromCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Location:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMenu.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dishes dishItem=(Dishes)tblMenu.getValueAt(selectedRow, 0);
            
            populateCart(dishItem);
          
        }
        
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnRemoveFromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFromCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCart.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to remove from cart","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dishes item=(Dishes)tblCart.getValueAt(selectedRow, 0);
            items.remove(item);
            DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);
           // commented no use
                }  
    }//GEN-LAST:event_btnRemoveFromCartActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnRemoveFromCart;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblMenu;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
