import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;


public class CopiandoBytes
{
    public static void main (String args[]) throws IOException  
    {
         Scanner scan = new Scanner(System.in);
         boolean condicao = true;
         do{

        try{
            System.out.println("digite o nome do arquivo:");
            String resposta = scan.nextLine();

           FileInputStream in = new FileInputStream( resposta );
           FileOutputStream out = new FileOutputStream("saida.txt");
           condicao = false;
           int c = 0;
           while ((c = in.read()) != -1) {
               System.out.println(c);
           }

        }
        catch(IOException e){
         System.out.println("Não foi encontrado!!");   
        }



     }while(condicao);
     
    }
    
    }


  