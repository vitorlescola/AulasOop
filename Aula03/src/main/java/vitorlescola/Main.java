package vitorlescola;

public class Main {
    static void main() {
        Cachorro bob=new Cachorro();
        Pessoa pessoa=new Pessoa("Joao");
        pessoa.adotar(bob);

        Treinador fred=new Treinador("Fred");
        Time flamengo=new Time("Flamengo",fred);
    }
}
