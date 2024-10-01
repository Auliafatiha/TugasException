/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
public class ExcepTest1 {
    public static void main(String args[]){
        try{
            int a[] = new int[2];
            System.out.println("Acces element three: " +a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the bloick");
    }
}
//Analisis
//1.blok Try menyimpan kode yang nantinya akan dilakukan exception, 
//2. blok catch digunakan untuk menangani exception. khusus pada kode program kali ini menggunakan ArrayIndexOutOfBoundsException karena kode program pada blok try merupakan Array
//3. blok catch menampilkan pesan exception 
//4. jika nilai a >=2 maka exception akan menghandel dengan menampilkan pesan excepotion
//5. jika nilai a<=2 maka exception tidak akan menampilkan pesan dan pesan berhasil atau sukses
//6. jika class ExcapTest tanpa ecxeption maka ketika melakaukan compiler akan menampilkan pesan eror 