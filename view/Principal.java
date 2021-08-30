package view;

import java.util.Random;

import controller.ThreadVetor;

public class Principal {

    public static void main(String[] args) {

        Random random = new Random();
        int var;
        int vetor [] = new int [1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100)+1;
        }

        for (var = 1; var <=2; var++) {
            Thread threadVetor = new ThreadVetor (var, vetor);
            threadVetor.start();
        }
    }
}
