/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sai
 */
public class Cars {
    
    private String modelNumber;
    private String brandName;

   
    private int numberOfSeats;
    private String serialNumber;
    private int yearOfManufacturing;
    private String status;
    private Date expirationDate;
    private String location;
    private String city;
    private Date createdOn;
    public Date updatedOn;

    public Date getCreatedOn() {
        return createdOn;
    }
    
     public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
        this.updatedOn = createdOn;
    }
    
    public Date getUpdatedOn() {
        return updatedOn;
    }
     
    public Cars() {
        this.createdOn = new Date();
        this.updatedOn = createdOn;
    }
   // Date date = new Date();
   // SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
   // String stringDate= DateFor.format(date);

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
     @Override
    public String toString(){
        return modelNumber;
    }
    
    
}
