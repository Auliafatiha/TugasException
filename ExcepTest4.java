/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
public class ExcepTest4 {
    public static void main(String[] args){
        System.out.println(testFinallyBlock()); //menampilkan nilai dari testFinallyBlock
    }

    private static int testFinallyBlock() { //membuat methode untuk menampilkan hasil dari testFinallyBlock
       int a[] = new int[2]; //membuat arry yang terdiri dari 2 baris yaitu o dan 1
       try{
          return 1; // memberikan nilai yang akan ditampilkan 
       }catch (ArrayIndexOutOfBoundsException e){ //exception untuk menangani kesalahan pada array
           System.out.println("Ecxeption thrown: "+ e);
       }finally{ // finally diesekusi setalah try dan catch
           a[0] = 6; //memberikan nilai awal pada array a 
           System.out.println("First element value "+ a[0]); // menampilkan nilai awal dari array a
           System.out.println("The finally statement is excuted");
       }
//     
        return 0; //statement untuk mengembalikan nilai
    }
}
//finally tetap akan dieksekusi meskipun dalam program tidak terdapat exception