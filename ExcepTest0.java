/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
public class ExcepTest0 {
    public static void main (String args []){
        try{
            int a[] = new int[2];
            int b = 0;
            int c = 1/b;
            System.out.println("Acces Elements theree:" + a[3]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Exception thorwn :" + e);       
        }
          System.out.println("Out of the blocks");
}
}
// pada program ini terdapat satu try dan 2 catch akan tetapi kedua catch dikumpulkan menjadi satu dengan tanda pemisah | 
// exception akan menghandel 1 catch blok yang relevan dengan permasalahan pada kode program try
// aturan penggunaan multiple catch blok diurutkan dari yang paling spesifik ke yang generic atau umum
// pada kelas ini permasalahan terdapat pada kesalahan pembagian dengan angka nol 
// sehingga ArithmeticException yang menghandle permasalahan ini.