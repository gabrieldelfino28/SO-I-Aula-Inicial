package view;

import controller.PercorrerVetor;

public class Principal {

    public static void main(String[] args) {

        PercorrerVetor p = new PercorrerVetor();

        int[] Vetor = new int[1000];
        int[] Vet2 = new int[10000];
        int[] Vet3 = new int[100000];

        for (int i = 0; i < 1000; i++) {
            Vetor[i] = 1;
        }

        for (int i = 0; i < 10000; i++) {
            Vet2[i] = 1;
        }

        for (int i = 0; i < 100000; i++) {
            Vet3[i] = 1;
        }

        p.FuncVet1(Vetor);
        p.FuncVet2(Vet2);
        p.FuncVet3(Vet3);
    }
}
