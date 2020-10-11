/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer>{
    
      public Customer(String password, String userName) {
        super(password, userName, "CUSTOMER");
        this.date = new Date();
      //  directory = new ProductDirectory();
    }
      
      private Date date;

    public Date getDate() {
        
        System.out.println(date);
        return date;
        
    }

    
   

      
    
      
    

    @Override
    public String toString() {
        
        
//To change body of generated methods, choose Tools | Templates.
       
          return getUserName();
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }

    @Override
    public int compareTo(Customer o) {
        return o.getUserName().compareTo(this.getUserName());
    }
    
}
