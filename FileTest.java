/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author LENOVO
 */
import java.io.File; //membuat fle
import java.io.FileReader;//membaca file
import java.io.FileWriter;//menulis file
import java.io.IOException; // exception checked
public class FileTest {
    public static void main(String args[]){
        try{
            File file = new File("d://test//testFile1.txt");
            //create the file
            if(file.createNewFile()){ //  jika file belum ada makan diarahkan untuk membuat file baru
                
            }else{
                System.out.println("File already exists"); //jika sudah ada makan ditampilkan pesan bahwa file sudah tersedia
            }
            //write Content
            FileWriter writer = new FileWriter(file); // menulis file
            writer.write("Test data"); //menulis file dengan kata kata "Test data"
            writer.close();
            
        //read content
        FileReader reader = new FileReader(file); //membaca file dan membuka
        
        int c; //melakukan perulangan  untuk membaca setiap karakter secra terurut sampai ahir file
        while ((c = reader.read()) != -1){
            char ch =(char) c; //mengubah integer ke char
            System.out.print(ch);
        }
        }catch (IOException e){
            System.out.print("Exception"); //untuk menangani kesalahan saat membuat, membaca maupun menulis 
        }
    }
}
