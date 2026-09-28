/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author joshn
 */
public class ConsoleSales extends Consoles{
    
    public ConsoleSales(String deviceType,String storeName,int totalSales){
        super(deviceType,storeName,totalSales);
    }
    
    public void printReport(){
        System.out.println("CONSOLE NAME: "+super.getDeviceType());
        System.out.println("STORE: "+super.getStoreName());
        System.out.println("TOTAL SALES: "+super.getTotalSales());
    }
    
    
    @Override
    public String getConsoleType() {
        return null;
    }

    @Override
    public String getStore() {
        return null;
    }
}
