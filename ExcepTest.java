/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
public class ExcepTest {
    public static void main (String args []){
        try{
            int a[] = new int[2];
            int b = 0;
            int c = 1/b;
            System.out.println("Acces Elements theree:" + a[3]);
        }
////        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
////            System.out.println("Exception thorwn :" + e);       
//        }
//          System.out.println("Out of the blocks");
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException thorwn : " + e);
        }catch(Exception e){
            System.out.println("Exception thorwn : " + e);
        }
        System.out.println("Out of the blocks");
                
    }
}
//terdapat satu try dan 2 catch. catch yang pertama menangani array dan catch yang kedua menangani pembagian dengan nol atau aritmetika
// program akan mencocokkan bagian mana yang akan mengalami eror dan akan menyesuaikan/menghandle eror dengan exception pada catch yang sesuai
// jika program tidak menggunakan exception program sisa kode sete;ah bagian yang eror tidak akan ditampilkan. Sedangkan jika menggunakan exception sisa kode yang mengalami eror dan ditangani oleh exception akan terus mengcompile kode setelahnya 


