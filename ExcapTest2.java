/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
public class ExcapTest2 {
    public static void main(String args[]){
        try{ //induk 
            int a[] = new int[2];
            try{ //anak
                int b = 0;
                int c =1/b;
            }catch(ArrayIndexOutOfBoundsException e){ //catch anak
                System.out.println("Exception thrown: "+e);
            }
            System.out.println("Acces element three: "+ a[3]);
            
        }catch(Exception e){ //catch induk
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }
}
//pada program ini hasil dari compile hanya menampilkan satu exception yaitu ArithmeticException padahal terdapat 2 permasalahan pada setiap try baik induk maupun anak
//peletakan catch yang tidak sesuai dengan ketentuan dimana catch yang lebih spesifik lalu yang lebih umum
// memungkinkan terjadinya satu penanganan walaupun sebenarnya terdapat 2 permasalahan karena pengecualian yang lebih umum menangkap semua exception termasuk yang spesifik sehingga exception yang spesifik tidak dapat ditangai secara terpisah