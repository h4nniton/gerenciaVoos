package br.senai.jandira.sp.Model;

public class Latam extends Voo {

    int numeroPassageiros;

    public Latam (String numeroVoo, String origem, String destino, String dataPartida, int numeroPassageiros){

        super(numeroVoo, origem, destino, dataPartida);

        this.numeroPassageiros = numeroPassageiros;

    }

    @Override
    public int getNumeroPassageiros() {
        return 0;
    }
}
