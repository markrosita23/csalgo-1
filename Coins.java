/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coin;
import java.util.*;

public class Coin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double[] peso = {10,5,1,0.25};
        double maxPeso = 572.75;
        double MP = 0;
        int c = 0;
        int q[] = new int[4];
        
        while (MP < maxPeso){
            if(MP + peso[c] <= maxPeso){
                q[c] +=1;
                MP =+ peso[c];
            }else c++;
            System.out.println("10 peso: " + q[0] + "\n 5 peso: " +q[1] + "\n 1 peso: " + q[2] + "\n 25 cent: " +q[3]);
        }
        
    }
    
}
