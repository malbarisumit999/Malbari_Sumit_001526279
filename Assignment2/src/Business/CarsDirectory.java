/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author sai
 */
public class CarsDirectory {
    
    
    private static ArrayList<Cars> carsDirectory;
    
    private static HashSet<String> brandNameDirectory;
    
    public HashSet<String> brndNameHashSet = brandNameDirectory;

    public static void setBrandNameDirectory(String brandNameDirectory) {
        CarsDirectory.brandNameDirectory.add(brandNameDirectory);
    }
    
    
    public CarsDirectory() {
        this.carsDirectory = new ArrayList<Cars>();
        this.brandNameDirectory = new HashSet<String>();
    }

    public static HashSet<String> getBrandNameDirectory() {
        return brandNameDirectory;
    }
    
    
    public ArrayList<Cars> getCarsDirectory() {
        return carsDirectory;
    }

    public void setCarsDirectory(ArrayList<Cars> carsDirectory) {
        this.carsDirectory = carsDirectory;
    }

   
    public Cars addCars(){
        Cars cars = new Cars();
        carsDirectory.add(cars);
        
        System.out.println(carsDirectory.get(0).getBrandName());
        
        return cars;
    }
    
    public void deleteCars(Cars cars){
        carsDirectory.remove(cars);
    }
    
    public Cars searchCarBySerailNumber(String serialNumber){
        for(Cars cars: carsDirectory){
            if(cars.getSerialNumber().equals(serialNumber)){
                return cars;
            }
        }
        return null;
    }
    
    public Cars listOfCarsByBrandName(String brandName){
        for(Cars cars: carsDirectory){
            if(cars.getSerialNumber().equals(brandName)){
                return cars;
            }
        }
        return null;
    }
    
    
    public Cars firstAvailableCar(String location){
        for(Cars cars: carsDirectory){
            if(cars.getLocation().equals(location) && cars.getStatus().equalsIgnoreCase("Y")){
                return cars;
            }
        }
        return null;
    }
    
    public Cars carsByBrand(String brandName){
        for(Cars cars: carsDirectory){
            if(cars.getBrandName().equals(brandName)){
                return cars;
            }
        }
        return null;
    }
    
    public Cars MinMaxSeats(int min, int max){
        for(Cars cars: carsDirectory){
            if(cars.getNumberOfSeats() > min && cars.getNumberOfSeats() < max){
                return cars;
            }
        }
        return null;
    }
    
}
