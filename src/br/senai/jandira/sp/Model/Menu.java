package br.senai.jandira.sp.Model;

public class Menu {

    public void executarMenu (){

        Gol vooGol1 = new Gol("GL-111", "São Paulo", "Paraná", "12-06-2024", 127);
        Gol vooGol2 = new Gol("GL-222", "Rio Grande do Norte", "Amapá", "09-09-2024", 268);

        Latam vooLatam1 = new Latam("LT-333", "São Paulo", "Argentina", "24-10-2024", 528);
        Latam vooLatam2 = new Latam("LT-444", "Paraná", "Mato Grosso do Sul", "15-11-2023", 742);
        Latam vooLatam3 = new Latam("AZ-555", "Bahia", "Amazonas", "28-02-2024", 362);

        Azul vooAzul1 = new Azul("AZ-666", "Minas Gerais", "Paraíba", "01-08-2024", 327);
        Azul vooAzul2 = new Azul("AZ-777", "Santa Catarina", "Acre", "06-03-2024", 638);

        System.out.println("Olá ! Seja Bem Vindo ao nosso gerenciamento de voos");
        System.out.println("Escolha uma companhia aérea: ");
        System.out.println("1 - Gol | 2 - Latam | 3 - Azul");

    }
}
