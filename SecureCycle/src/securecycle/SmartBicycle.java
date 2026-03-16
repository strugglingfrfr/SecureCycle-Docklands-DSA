/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securecycle;

/**
 *
 * @author muhammadhamzaanjum
 */
public class SmartBicycle extends Bicycle{   
    
    private String iotID;
    
    //constructor
    public SmartBicycle(String serialNumber, String ownerName, String model, String status, String iotID) {
        super(serialNumber, ownerName, model, status);
        this.iotID = iotID;
    }
    
    //getter
    public String getIotID() {
        return iotID;
    }
    
    //other methods 
    @Override
    public String toString() {
        return super.toString() + ", IoT ID: " + iotID;
    }
    
    
    
}
