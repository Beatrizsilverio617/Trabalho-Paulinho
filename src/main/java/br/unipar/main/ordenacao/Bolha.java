
package br.unipar.main.ordenacao;

public class Bolha {
    
    public static void bubbleSort(int[] arr) {
        long inicio = System.nanoTime();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tempo = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempo;
                }
            }
        }
        long fim = System.nanoTime();
        long tempoExecucao = fim - inicio;
        System.out.println("\nTempo de execução para ordenação bubbleSort: " 
                + tempoExecucao + " milésimos");
    }
    
}
