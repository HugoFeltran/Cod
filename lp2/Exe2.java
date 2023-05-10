import java.io.FileInputStream;
import java.io.IOException;

public class Exe2 {
    public static void main(String args[]){

    
    try{
        FileInputStream in = new FileInputStream("impar.txt");
        int c = 0;
        while ((c = in.read()) != -1) {
            System.out.println(c);
        }
    }
    catch(IOException e){
        e.printStackTrace();
    }
} 
}
