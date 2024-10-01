/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
public class ExcepTest5 {
    public static void main(String[] args){
        int a[] = new int[2]; // membuat array a yang berisi 2 baris dengan nilai 0 dan 1
        try{
            System.out.println("Acces element three :"+ a[3]);//meminta untuk menampilkan nilai 3 pada array a
        }catch (Exception e){
            System.out.println("Exception thrown :"+ e); // exception untuk mengendalikan kesalahan
        }finally{ 
            a[0] = 6; //membuat nilai awal pada array a 
             System.out.println("First element value "+ a[0]); // menampilkan  nilai pada awal pada array
           System.out.println("The finally statement is excuted");
        }
    }
}
//finally tetap dieksekusi walaupun terdapat exception. finally dikesekusi setelah try dan catch