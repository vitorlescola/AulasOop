package vitorlescola;

public class Casa{
    private String endereco;
    private Quarto quartoPrincipal;

    public Casa(String endereco){
        this.endereco=endereco;
        this.quartoPrincipal= new Quarto();
    }
}