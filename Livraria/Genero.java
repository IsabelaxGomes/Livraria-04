public enum Genero{


    ROMANCE("Quem e voce Alasca" , 10),
    ACAO("Assasinato no Expresso Oriente", 7),
    CRISTAO("o Deus que destroi sonhos", 8);

    private String favorito;
    private int nota;


    private Genero(String favorito, int nota){
        this.favorito = favorito;
        this.nota = nota;

    }


    // metodo get para meu eneum ser chamado fora do enum
    public String getFavorito() {
        return favorito;
    }

    public int getNota() {
        return nota;
    }
}