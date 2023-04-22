
package br.unipar.main.ordenacao;

public class Selecao {
    
   public static void selectionSort(int[] arr) {
        long inicio = System.nanoTime();
        for (int i = 0; i < arr.length - 1; i++) {
            int menor = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[menor]){
                    menor = j;
                }
            }
            if(menor != i){
                int aux = arr[i];
                arr[i] = arr[menor];
                arr[menor] = aux;
            }
        }
        long fim = System.nanoTime();
        long tempoExecucao = fim - inicio;
        System.out.println("\nTempo de execução para ordenação selectionSort: "
                + tempoExecucao + " milésimos");
    }
    
    
    
}
