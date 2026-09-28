/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Question1;
import java.util.Arrays;
/**
 *
 * @author joshn
 */
public class App {

    public static void main(String[] args) {
        int[][] sales = {
            {1000,2000,3000}, 
            //
            {2000,3000,4000}, 
            //
            {1500,1100,1200},  
            //
        };
        String[] cities = {"Cape Town","Port Elizabeth","Pretoria"};
        int[] rowSums = new int[sales.length];
        for(int i = 0;i<sales.length;i++){
            int[] oneDArray = sales[i];
            System.out.println(cities[i]+"  "+Arrays.toString(oneDArray));
            
        }
        
        for(int i = 0;i<sales.length;i++){
            int sum = 0;
            for(int j = 0;j<sales[i].length;j++){
                sum+=sales[i][j];
            }
            rowSums[i] = sum;
        }
        System.out.println("");
        
        for(int i =0;i<sales.length;i++){
            System.out.println(cities[i]+"  "+rowSums[i]);
        }
        
        int highest = sales[0][0];//or you can set it as 0
        //int highest = 0;
        
        
        
    }
}
