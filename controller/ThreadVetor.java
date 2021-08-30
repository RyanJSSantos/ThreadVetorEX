package controller;

public class ThreadVetor extends Thread {

        private int var;
        private int vetor [] = new int [1000];

        public ThreadVetor (int var, int vetor []) {
            this.var = var ;
            this.vetor = vetor;
        }

        @Override
        public void run() {
            operationContador();
        }

        public boolean numPar (int var) {
            if (var % 2 == 0) {
                return true;
            }
            else
                return false;
        }


        public void operationContador() {
            double inicioTime, finalTime, totalTime;
            String ForTipo;

            inicioTime = System.nanoTime();

            if (numPar(var)) {
                ForTipo = "for";
                for (int i = 0 ; i < vetor.length; i++) {
                }
            }
            else {
                ForTipo = "foreach";
                for (int a : vetor)
                {
                    a = a + 0;
                }
            }

            finalTime = System.nanoTime();

            totalTime = finalTime - inicioTime;
            totalTime = totalTime / Math.pow(10, 9);

            System.out.println ("TID #" + getId() + "==> for utilizado: " + ForTipo + ", tempo total: " + totalTime + "segundos.");
    }
}
