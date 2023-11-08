package br.senai.jandira.sp.Model;

public class Azul extends Voo {

    int numeroPassageiros;

    public Azul (String numeroVoo, String origem, String destino, String dataPartida, int numeroPassageiros){

        super(numeroVoo, origem, destino, dataPartida);

        this.numeroPassageiros = numeroPassageiros;

    }

    @Override
    public int getNumeroPassageiros() {
        return 0;
    }
}
