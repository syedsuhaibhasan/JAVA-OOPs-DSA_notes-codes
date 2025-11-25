package Lecture.FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
    public FileWriter2(String fileName) {
    }
    public static void main(String[] args) {
        
         String fileName="example.txt";
        try(FileWriter obj = new FileWriter(fileName) ){
       obj.write("This is the best java repo");
       obj.flush();
            System.out.println("Written succesfully");
        }catch(IOException e){
            System.out.println(e.getMessage());           
        }
        }
    }             
