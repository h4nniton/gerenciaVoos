package br.senai.jandira.sp.Model;

abstract class Voo {

    private String numeroVoo, origem, destino, dataPartida;
    public Voo (String numeroVoo, String origem, String destino, String dataPartida){

        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;

    }

    public abstract int getNumeroPassageiros ();

}
