/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
import java.io.File; // untuk membuat file baru
//import java.io.FileNotFoundException;
import java.io.FileReader; // untuk membuka dan membaca file
//
public class Percobaan1 {
  public static void main(String[] args) {
      try{
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file); 
      }
      catch(Exception e){
          System.out.println("File tidak tersedia" + e);
      }
  }  
}
