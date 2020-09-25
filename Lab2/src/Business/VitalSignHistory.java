/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
/**
 *
 * @author sai
 */
public class VitalSignHistory {
    
    public VitalSignHistory()
    {
        vitalSignHistory = new ArrayList<VitalSigns>();
    }
    
    private ArrayList<VitalSigns> vitalSignHistory;

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSigns addVitals()
    {
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v)
    {
        vitalSignHistory.remove(v);
    }
    
}
