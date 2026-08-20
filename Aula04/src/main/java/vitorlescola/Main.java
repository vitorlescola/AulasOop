package vitorlescola;

public class Main {
    static void main() {
        //associação
        Cachorro bob=new Cachorro();
        Pessoa fulano=new Pessoa("Fulano");
        fulano.adotar(bob);

        Medico medico=new Medico("sadsdada");
        Paciente paciente=new Paciente();
        medico.atender(paciente);

        //agregação
        Computador computador=new Computador();
        Monitor monitor=new Monitor();
        computador.conectarMonitor(monitor);

        Treinador treinador=new Treinador();
        Time time=new Time("Flamengo",treinador);

        //composição
        Casa casa=new Casa("76546786");
    }
}