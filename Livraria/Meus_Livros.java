import java.util.ArrayList;
import java.util.Scanner; 
import java.io.*;




public class Meus_Livros{

   


Scanner sc = new Scanner (System.in);


public void cadastrar (){

    System.out.println("Informe o nome do livro para o cadastro:");
    String nome = sc.nextLine();

    System.out.println("Informe o autor do livro:");
    String autor = sc.nextLine();

    String Informacao = "Titulo: " + nome + "  " + "Autor: " + autor;

    escreverArquivo(Informacao);
}
public void escreverArquivo (String Informacao){

    try{
        BufferedWriter w = new BufferedWriter(new FileWriter("meus_livros.dat" , true));
        w.write(Informacao);
        w.newLine();
        w.close();

    }catch(Exception e){
        System.out.println("Erro ao escrever no arquivo");
        e.printStackTrace();
    }
}



public void listarLivros(){

    try{
        BufferedReader r = new BufferedReader(new FileReader("meus_livros.dat"));
        String lerArquivo;

        while ((lerArquivo= r.readLine()) != null){
            System.out.println(lerArquivo);
        }
    
        r.close();
    }catch (Exception e){
        e.printStackTrace();

    }
}

////////////////////////////////////////////////////////////////Criacao do menu 

public void criacaoMenu(){
    System.out.println("Digite a opção que deseja:");
    System.out.println("1 - Listar todos os livros");
    System.out.println("2 - Cadastar um novo Livro");
    System.out.println("3 - Livros do TOP3");



    Scanner sc1 = new Scanner(System.in);
    int menu = sc1.nextInt();

    Meus_Livros ml = new Meus_Livros();
    //ml.imprimir_Enum();

    Meus_Livros cadastar = new Meus_Livros();
   // cadastar.cadastrar();

    Meus_Livros listar = new Meus_Livros();
    // listar.listarLivros();

 

    switch(menu){

        case 1: 
        ml.imprimir_Enum();
        
        break;
        case 2: 
        cadastar.cadastrar();
        break; 
        case 3: 
         listar.listarLivros();
        break; 
       


    }
}



public void imprimir_Enum(){

    for (Genero genero : Genero.values()){

        System.out.println("\nLivro Favorito:\n");

        System.out.println("Genero:" + genero.name());
        System.out.println("Favorito:" + genero.getFavorito());
        System.out.println("Nota:" + genero.getNota());

    }

    

}

public static void main(String[] args) {
    //Meus_Livros.imprimir_Enum();

    

    //rodar para cadastar os livros 
    //Meus_Livros cadastar = new Meus_Livros();
    //cadastar.cadastrar();

    //Listar meus livros
   // Meus_Livros listar = new Meus_Livros();
   // listar.listarLivros();

   Meus_Livros menu = new Meus_Livros();
   menu.criacaoMenu();



    
}
    
   
    
    
    
}