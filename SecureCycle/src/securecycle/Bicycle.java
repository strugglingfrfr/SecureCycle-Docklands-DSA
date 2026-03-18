/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package securecycle;

/**
 *
 * @author muhammadhamzaanjum
 */
public class Bicycle {
    
    protected String serialNumber;
    protected String ownerName;
    protected String model;
    protected String status; 
    
    //constructor
    public Bicycle(String serialNumber, String ownerName, String model, String status) {
        this.serialNumber = serialNumber;
        this.ownerName = ownerName;
        this.model = model;
        this.status = status;
    }
    
    //setter
    public void setStatus(String status) {
        this.status = status;
    }
    
    //getters
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getModel() {
        return model;
    }

    public String getStatus() {
        return status;
    }

    //other methods 
    @Override
    public String toString() {
        return "Serial: " + serialNumber + ", Owner: " + ownerName + ", Status: " + status;
    }
    
}
