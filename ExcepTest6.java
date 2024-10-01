/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
public class ExcepTest6 {
    public static void main(String[] args){
        int a = 3;
        int b = 0;
       try{ 
           System.out.println("result:" + divide(a,b)); //menampilkan nilai divide(a,b)
       } catch(Exception e){ //bagian penanganan
            System.out.println("Exception" + e);
       }
    }

    private static int divide(int a, int b)
            throws Exception
    { //membuat method untuk menampilkan nilai dari divide(a.b) dimana method ini dapat melakukan throw exception
        if(b==0){
            throw new Exception("second argumnet cannot be zero"); // melemparkan exception secara jelas
        }
        return a/b;
    }
}
// jika throw dan throws tidak ada proses compiler tetap berjalan dengan baik 