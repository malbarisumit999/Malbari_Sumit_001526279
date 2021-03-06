/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Cars;
import Business.CarsDirectory;
import java.awt.CardLayout;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sai
 */
public class ManageCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCarJPanel
     */
    private JPanel userProcessContainer;
    private CarsDirectory carsDirectory;
    private Cars cars;

    ManageCarJPanel(JPanel userProcessContainer, CarsDirectory carsDirectory, Cars cars) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.carsDirectory = carsDirectory;
       this.cars = cars;
       comboboxpopulate();
       
    }

     private void comboboxpopulate(){
        Vector a = new Vector();
        for(String item: carsDirectory.getBrandNameDirectory()){
            a.add(item.toString());
        }
        
        DefaultComboBoxModel dm = new DefaultComboBoxModel(a);
        comboBrandName.setModel(dm);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchSerialNumber = new javax.swing.JButton();
        btnFirstAvailableCar = new javax.swing.JButton();
        txtSerialNumber = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        btnListOfCarsByBrand = new javax.swing.JButton();
        btnListOfCarsInAGivenYear = new javax.swing.JButton();
        btnAvailableCarsWithSeats = new javax.swing.JButton();
        txtMinSeats = new javax.swing.JTextField();
        txtMaxSeats = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnListOfCarsByModelName = new javax.swing.JButton();
        btnListAllManufacturers = new javax.swing.JButton();
        btnFleetCatalogUpdatedDate = new javax.swing.JButton();
        btnListOfCarsInACity = new javax.swing.JButton();
        btnListOfCarsExpired = new javax.swing.JButton();
        txtBrandName = new javax.swing.JTextField();
        txtYearOfManufacturing = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnNoOfCarsAvailable = new javax.swing.JButton();
        txtAvailability = new javax.swing.JTextField();
        comboBrandName = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 0));

        btnSearchSerialNumber.setBackground(new java.awt.Color(0, 102, 204));
        btnSearchSerialNumber.setText("Search Serial Number");
        btnSearchSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSerialNumberActionPerformed(evt);
            }
        });

        btnFirstAvailableCar.setBackground(new java.awt.Color(0, 102, 204));
        btnFirstAvailableCar.setText("First Available Car");
        btnFirstAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableCarActionPerformed(evt);
            }
        });

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        btnListOfCarsByBrand.setBackground(new java.awt.Color(0, 102, 204));
        btnListOfCarsByBrand.setText("List of Cars by Brand");
        btnListOfCarsByBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfCarsByBrandActionPerformed(evt);
            }
        });

        btnListOfCarsInAGivenYear.setBackground(new java.awt.Color(0, 102, 204));
        btnListOfCarsInAGivenYear.setText("List of cars in a given year");
        btnListOfCarsInAGivenYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfCarsInAGivenYearActionPerformed(evt);
            }
        });

        btnAvailableCarsWithSeats.setBackground(new java.awt.Color(0, 102, 204));
        btnAvailableCarsWithSeats.setText("Available cars with seats");
        btnAvailableCarsWithSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableCarsWithSeatsActionPerformed(evt);
            }
        });

        jLabel1.setText("Min:");

        jLabel2.setText("Max:");

        btnListOfCarsByModelName.setBackground(new java.awt.Color(0, 102, 204));
        btnListOfCarsByModelName.setText("List of Cars by Model Number");
        btnListOfCarsByModelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfCarsByModelNameActionPerformed(evt);
            }
        });

        btnListAllManufacturers.setBackground(new java.awt.Color(0, 102, 204));
        btnListAllManufacturers.setText("List all manufacturers");
        btnListAllManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListAllManufacturersActionPerformed(evt);
            }
        });

        btnFleetCatalogUpdatedDate.setBackground(new java.awt.Color(0, 102, 204));
        btnFleetCatalogUpdatedDate.setText("Fleet Catalog updated date");
        btnFleetCatalogUpdatedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFleetCatalogUpdatedDateActionPerformed(evt);
            }
        });

        btnListOfCarsInACity.setBackground(new java.awt.Color(0, 102, 204));
        btnListOfCarsInACity.setText("List of Cars in a City");
        btnListOfCarsInACity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfCarsInACityActionPerformed(evt);
            }
        });

        btnListOfCarsExpired.setBackground(new java.awt.Color(0, 102, 204));
        btnListOfCarsExpired.setText("List of Cars having expired certificates");
        btnListOfCarsExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListOfCarsExpiredActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Manage Cars");

        btnBack.setBackground(new java.awt.Color(255, 0, 255));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNoOfCarsAvailable.setBackground(new java.awt.Color(0, 102, 204));
        btnNoOfCarsAvailable.setText("No Of Cars Available(Y)/Not Available(N)");
        btnNoOfCarsAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoOfCarsAvailableActionPerformed(evt);
            }
        });

        comboBrandName.setBackground(new java.awt.Color(153, 153, 255));
        comboBrandName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tata", "McLaren", "Ford", "BMW", "Honda", "Land Rover", "Rolls Royce", " ", " " }));
        comboBrandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBrandNameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 255));
        jButton1.setText("Submit After BrandName");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnFleetCatalogUpdatedDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListAllManufacturers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListOfCarsExpired, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchSerialNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFirstAvailableCar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListOfCarsByBrand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListOfCarsInAGivenYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAvailableCarsWithSeats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListOfCarsByModelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListOfCarsInACity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNoOfCarsAvailable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYearOfManufacturing, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity)
                            .addComponent(txtAvailability))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBrandName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 33, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirstAvailableCar)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListOfCarsByBrand)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListOfCarsInAGivenYear)
                    .addComponent(txtYearOfManufacturing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvailableCarsWithSeats)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListOfCarsByModelName)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnListAllManufacturers)
                .addGap(13, 13, 13)
                .addComponent(btnFleetCatalogUpdatedDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListOfCarsInACity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnListOfCarsExpired)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoOfCarsAvailable))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnListAllManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListAllManufacturersActionPerformed
        // TODO add your handling code here:
        
         UniqueManufacturerPanel uniqueManufacturerPanel = new UniqueManufacturerPanel(userProcessContainer,carsDirectory);
        userProcessContainer.add("UniqueManufacturerPanel",uniqueManufacturerPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnListAllManufacturersActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSerialNumberActionPerformed
        // TODO add your handling code here:
        Cars result = carsDirectory.searchCarBySerailNumber(txtSerialNumber.getText());
        if(result == null){
            JOptionPane.showMessageDialog(null, "No such match found.");
        }

        else{
                ViewCar viewpanel = new ViewCar(userProcessContainer, result);
                userProcessContainer.add("ViewCar",viewpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnSearchSerialNumberActionPerformed

    private void btnFirstAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableCarActionPerformed
        // TODO add your handling code here:
        Cars result = carsDirectory.firstAvailableCar(txtLocation.getText());
        if(result == null){
            JOptionPane.showMessageDialog(null, "No cars available at the given location.");
        }

        else{
                ViewCar viewpanel = new ViewCar(userProcessContainer, result);
                userProcessContainer.add("ViewCar",viewpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnFirstAvailableCarActionPerformed

    private void btnListOfCarsByBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfCarsByBrandActionPerformed
        // TODO add your handling code here:
        
      //  Cars result = carsDirectory.listOfCarsByBrandName(txtBrandName.getText());
      //  if(result == null){
       //     JOptionPane.showMessageDialog(null, "No such match found.");
      //  }
      //  Cars resultcbb = carsDirectory.carsByBrand(txtBrandName.getText());
      //  if(resultcbb == null){
       //     JOptionPane.showMessageDialog(null, "No cars available for given brand.");
       // }
      //  else{
            String x = txtBrandName.getText();
            CarsByBrandPanel carBrandPanel = new CarsByBrandPanel(userProcessContainer, x, carsDirectory);
            userProcessContainer.add("CarsByBrandPanel",carBrandPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
       // }
    }//GEN-LAST:event_btnListOfCarsByBrandActionPerformed

    private void btnListOfCarsInAGivenYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfCarsInAGivenYearActionPerformed
        // TODO add your handling code here:
        CarsByYearPanel carsYearPanel = new CarsByYearPanel(userProcessContainer,String.valueOf(txtYearOfManufacturing.getText()),carsDirectory);
        userProcessContainer.add("CarsByYearPanel",carsYearPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnListOfCarsInAGivenYearActionPerformed

    private void btnListOfCarsByModelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfCarsByModelNameActionPerformed
        // TODO add your handling code here:
        CarsByModelPanel carsModelPanel = new CarsByModelPanel(userProcessContainer,txtModelNumber.getText(),carsDirectory);
        userProcessContainer.add("CarsByModelPanel",carsModelPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnListOfCarsByModelNameActionPerformed

    private void btnListOfCarsInACityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfCarsInACityActionPerformed
        // TODO add your handling code here:
        CarsByCityPanel carsCityPanel = new CarsByCityPanel(userProcessContainer,txtCity.getText(),carsDirectory);
        userProcessContainer.add("CarsByCityPanel",carsCityPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnListOfCarsInACityActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnNoOfCarsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoOfCarsAvailableActionPerformed
        // TODO add your handling code here:
        CarsAvailabilityPanel carsAvailabilityPanel = new CarsAvailabilityPanel(userProcessContainer,txtAvailability.getText(),carsDirectory);
        userProcessContainer.add("CarsAvailabilityPanel", carsAvailabilityPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnNoOfCarsAvailableActionPerformed

    private void btnAvailableCarsWithSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableCarsWithSeatsActionPerformed
        // TODO add your handling code here:
         Cars resulta = carsDirectory.MinMaxSeats(Integer.parseInt(txtMinSeats.getText()),Integer.parseInt(txtMaxSeats.getText()));
        if(resulta == null){
            JOptionPane.showMessageDialog(null, "No such match found for the seats specified.");
        }

        else{
                ViewCar viewpanel = new ViewCar(userProcessContainer, resulta);
                userProcessContainer.add("ViewCar",viewpanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnAvailableCarsWithSeatsActionPerformed

    private void btnListOfCarsExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListOfCarsExpiredActionPerformed
        // TODO add your handling code here:
        ExpiredCarsPanel expiredCarsPanel = new ExpiredCarsPanel(userProcessContainer,carsDirectory);
        userProcessContainer.add("ExpiredCarsPanel", expiredCarsPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnListOfCarsExpiredActionPerformed

    private void btnFleetCatalogUpdatedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFleetCatalogUpdatedDateActionPerformed
        // TODO add your handling code here:
        FleetCataloguePanel fleetCarsPanel = new FleetCataloguePanel(userProcessContainer,carsDirectory, cars);
        userProcessContainer.add("ExpiredCarsPanel", fleetCarsPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFleetCatalogUpdatedDateActionPerformed

    private void comboBrandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBrandNameActionPerformed
        // TODO add your handling code here:
       // HashSet<String> data = carsDirectory.brndNameHashSet;
       // DefaultComboBoxModel mod = new DefaultComboBoxModel(carsDirectory.brndNameHashSet);
       // comboBrandName.setModel(mod);
        
    }//GEN-LAST:event_comboBrandNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String comboBrand = comboBrandName.getSelectedItem().toString();
        System.out.println(comboBrand);
         CarsByBrandPanel carsbrand = new CarsByBrandPanel(userProcessContainer, comboBrand, carsDirectory);
         userProcessContainer.add(carsbrand);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvailableCarsWithSeats;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFirstAvailableCar;
    private javax.swing.JButton btnFleetCatalogUpdatedDate;
    private javax.swing.JButton btnListAllManufacturers;
    private javax.swing.JButton btnListOfCarsByBrand;
    private javax.swing.JButton btnListOfCarsByModelName;
    private javax.swing.JButton btnListOfCarsExpired;
    private javax.swing.JButton btnListOfCarsInACity;
    private javax.swing.JButton btnListOfCarsInAGivenYear;
    private javax.swing.JButton btnNoOfCarsAvailable;
    private javax.swing.JButton btnSearchSerialNumber;
    private javax.swing.JComboBox<String> comboBrandName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYearOfManufacturing;
    // End of variables declaration//GEN-END:variables
}
