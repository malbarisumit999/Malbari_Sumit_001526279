/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author adwai
 */
public class MasterOrderCatalog {
    
    private ArrayList<Order> orderCatalog;

    public MasterOrderCatalog()
    {
        orderCatalog = new ArrayList<Order>();
        
    }
    
    public Order addOrder(Order o)
    {
        
        orderCatalog.add(o);
        return o;
        
    }
    
    public void removeOrder(Order o)
    {
        orderCatalog.remove(o);
    }
    
}
