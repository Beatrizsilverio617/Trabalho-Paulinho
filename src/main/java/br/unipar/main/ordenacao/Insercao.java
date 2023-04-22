
package br.unipar.main.ordenacao;



public class Insercao {
     public static void insertionSort(int[] arr) {
        int entrada, j;
        long inicio = System.nanoTime();
        for(int i = 1; i < arr.length; i++){
            entrada = arr[i];
            for(j = i - 1;  j >= 0 && arr[j] > entrada ; j-- ){
                arr[j+1] = arr[j];
            }
            arr[j+1] = entrada;
        }
        long fim = System.nanoTime();
        long tempoExecucao = fim - inicio;
        System.out.println("\nTempo de execução para ordenação insertionSort: " 
                + tempoExecucao + " milésimos");
    }
}
    
 
 