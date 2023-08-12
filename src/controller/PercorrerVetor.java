package controller;

public class PercorrerVetor {
    public PercorrerVetor() {
        super();
    }

    public int[] FuncVet1(int[] Vetor) {

        double TempoInicial = System.nanoTime();
        for (int i = 0; i < Vetor.length; i++) {

        }
        double TempoFinal = System.nanoTime();

        double Tempo = TempoFinal - TempoInicial;
        Tempo /= Math.pow(10, 9);

        System.out.println("Primeiro Vetor: " + String.format("%.9f", Tempo) + " Segundos");

        return Vetor;
    }

    public int[] FuncVet2(int[] Vet2) {

        double TempoInicial = System.nanoTime();
        for (int i = 0; i < Vet2.length; i++) {

        }
        double TempoFinal = System.nanoTime();

        double Tempo = TempoFinal - TempoInicial;
        Tempo /= Math.pow(10, 9);

        System.out.println("Segundo Vetor: " + String.format("%.9f", Tempo) + " Segundos");

        return Vet2;
    }

    public int[] FuncVet3(int[] Vet3) {

        double TempoInicial = System.nanoTime();
        for (int i = 0; i < Vet3.length; i++) {

        }
        double TempoFinal = System.nanoTime();

        double Tempo = TempoFinal - TempoInicial;
        Tempo /= Math.pow(10, 9);

        System.out.println("Terceiro Vetor: " + String.format("%.9f", Tempo) + " Segundos");

        return Vet3;
    }
}
