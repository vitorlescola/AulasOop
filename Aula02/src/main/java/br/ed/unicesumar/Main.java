package br.ed.unicesumar;

public class Main {
    static void main() {
        Veiculo uno=new Veiculo("","",0);

        uno.setMarca("Fiat");
        uno.setModelo("Uno");
        uno.setAno(2009);

        uno.exibirDados();

        Veiculo fusca=new Veiculo("WV","Fusca",1976);
        fusca.exibirDados();

        uno.setQtdPortas(3);
        System.out.printf("\n%d",uno.getQtdPortas());
    }
}