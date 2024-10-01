/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class TryingException {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Counting");
        System.out.print("input a: ");
        int a = sc.nextInt();
        System.out.print("input b: ");
        int b = sc.nextInt();
        int hasil = a * b;
        
            if (b <= 0){
            System.out.println(hasil+"Ulang!!"); 
              } else{
                System.out.println(hasil); 
            }
          } catch (Exception e) {
               System.out.println("Exception thorwn:  " + e);
          }
          System.out.println("Input nilai tidak valid");
    }
    
}
