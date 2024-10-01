/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */

public class Uncheked_Demo {
    public static void main(String args[]){
        try{
             int num[] = {1,2,3,4}; //membuat array dengan panjang 4
              System.out.println(num[5]); //menampilakan nilai array ke 5
        }  
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array melebihi batas " + e );
        }
       
    }
}
// jika tidak menggunakan try and catch, class akan mengalami kegagalan dalam proses compiler 
//jika menggunkan try dan catch, class akan menerima pesan terjadinya kesalahan dan dapat mengeksekusi kode setelah catch 