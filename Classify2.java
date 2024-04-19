/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classify2;

/**
 *
 * @author LILIAN
 */
import java.util.*;
public class Classify2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        Male mo = new Male ();
        Female Fo = new Female ();
        
        System.out.print("choose between Female and males\n"
        + "1 : Male\n"
        + "2 :Female");
        
        int num;
        num=sc.nextInt();
        
       switch(num){
           case 1:
               mo.display();
               break;
           case 2:
               Fo.display();
       }
    }
    
}
