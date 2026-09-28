/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;
import java.util.Scanner;
/**
 *
 * @author joshn
 */
public class RunApplication {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please select console type: ");
        String catChoice = input.nextLine();
        
        System.out.print("Enter the store name: ");
        String storeName = input.nextLine();
        System.out.print("Enter the total sales of PS5 consoles for "+storeName+": ");
        int totalSales = input.nextInt();
        
        System.out.println("");
        ConsoleSales sale = new ConsoleSales(catChoice,storeName,totalSales);
        sale.printReport();
    }
}
