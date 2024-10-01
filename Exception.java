/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
public class Exception {
    public static void main (String args[]){
     int a[]= new int[5];
     a[5] = 100;
    }
}
//ketika menggunakan nama kelas Exception beberapa kelas mengalami erorr salah satu solusi nya adlaah dengan mengubah nama kelas seperti myException untuk menghindari adanya eror pada kelas lain
//sedangkan untuk menangani permasalahan kode cukup menggunakan try and catch dengan exception ArrayIndexOutOfBoundsException 
// karena array yang tertera hanya terdiri dari 5 saja yang terdiri  0,1,2,3,4 saja 
// sedangkan pada kode diatas mencoba untuk mengakses nilai indeks 5 