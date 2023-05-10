import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class Exe3 {
    public static void main (String args[]){
        Random random = new Random();
        ArrayList<Integer>lista = new ArrayList<Integer>();
        for( int a = 0; a < 10; a++)
        lista.add (random.nextInt(100));

        Collections.sort(lista);

        FileOutputStream saida = null;
        FileOutputStream saida2 = null;
try{
        saida = new FileOutputStream ("pares.txt");
        saida2 = new FileOutputStream ("impares.txt");

        for(Integer x: lista)
        if (x % 2==0){
        saida.write (x);
        }
        else
        saida2.write(x);
    } 
    catch (IOException e) {
        e.printStackTrace();
    }

    }
}
