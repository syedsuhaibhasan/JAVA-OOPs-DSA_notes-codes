package Lecture.FileHandling;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try(FileReader obj = new FileReader(fileName)){
        int read = 0;
        do{
        read =  obj.read();
            System.out.print((char)read);
        }while(read!=-1);
        }catch(IOException e){
        
        }
    }
}
