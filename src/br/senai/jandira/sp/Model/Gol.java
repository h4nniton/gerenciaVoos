package br.senai.jandira.sp.Model;

public class Gol extends Voo {

    int numeroPassageiros;

    public Gol (String numeroVoo, String origem, String destino, String dataPartida, int numeroPassageiros){

        super(numeroVoo, origem, destino, dataPartida);

        // this é para referenciar a variável local, diferenciar as variaveis
        this.numeroPassageiros = numeroPassageiros;

    }

    @Override
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
}
