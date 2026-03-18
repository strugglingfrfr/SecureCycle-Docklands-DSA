/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package securecycle;

/**
 *
 * @author muhammadhamzaanjum
 */
public class SecureCycleMain {
    
    //static so ResidentGUI and OfficerGUI can see them easily
    public static RegistryList registry = new RegistryList();
    public static UrgentAlertStack alerts = new UrgentAlertStack();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //starting main GUI
        new SecureCycleGUI().setVisible(true);
    }
    
}
