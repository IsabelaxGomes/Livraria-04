public class Livros_Acao implements Livros_Generos {

    String descricao;
    int numero_livros;
    String cor;
    int numero_paginas;
    int ano;



     

    public void descricao(){
        this.descricao = descricao;

    }

    public void quantidade_lida(){

        this.numero_livros = 10;
    
    } //quantidade que li o livro

    public void cor_capa(){
        this.cor = cor; 
    }

    public void quantidade_paginas(){
        this.numero_paginas = numero_paginas;
    }

    public void ano_lancamento(){
        this.ano = ano;

    }


    //Criar um contrutor 

    public Livros_Acao(){

    }
}