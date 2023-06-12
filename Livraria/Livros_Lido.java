import java.util.Scanner;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;

public class Livros_Lido {

 

    public static void main(String[] args) {

        //Criando o arquivo
        try{

            File arq = new File("meus_livros.dat");

            boolean nao_existe = arq.createNewFile();

            if(nao_existe){
                System.out.println("Arquivo criado");
            }else{
                System.out.println("Já existe");
            }

        
            //Escrevendo no arquivo 

        FileWriter fw = new FileWriter("meus_livros.dat", true);

        String livro1 = "\n Titulo: A Cabana  Autor: William P. Young ";
        String livro2 = "\n Titulo: Para todos os garotos que ja amei  Autor: Jenny Han";
        String livro3 = "\n Titulo: Cristianismo puro e simples Autor: C.S. Lewis ";
        String livro4 = "\n Titulo: Enraizando Autor: Banning Liebscher";
        String livro5 = "\n Titulo: Esconda-se  Autor: Lisa Gardner\n";
        

        fw.write(livro1);
        fw.write(livro2);
        fw.write(livro3);
        fw.write(livro4);
        fw.write(livro5);

        fw.close();


        

       
    }catch(Exception e){
        e.printStackTrace();
    }


}
}
