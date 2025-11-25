package Lecture.FileHandling;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Challenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please describe the file name:");
        String fileName = sc.nextLine();
        
        try(FileReader obj = new FileReader(fileName)){
        int read;
        while((read = obj.read())!=-1){
            System.out.print((char)read);
        } 
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException  e){
            System.out.println(e.getMessage());              
        }
        finally{
        sc.close();
        }
    }
}
