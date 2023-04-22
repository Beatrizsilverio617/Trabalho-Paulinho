
package br.unipar.main.ordenacao;


public class ImprimirTempo {
     public static void ImprimirTempo(int[] array){
        long inicio = System.nanoTime();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tempo = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempo;
                }
            }
        }
        long fim = System.nanoTime();
        long tempoExecucao01 = fim - inicio;
        System.out.print("\nTempo de execução para ordenação bubbleSort: " 
                + tempoExecucao01 + " milésimos");
        
        inicio = System.nanoTime();
        for (int i = 0; i < array.length - 1; i++) {
            int menor = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[menor]){
                    menor = j;
                }
            }
            if(menor != i){
                int aux = array[i];
                array[i] = array[menor];
                array[menor] = aux;
            }
        }
        fim = System.nanoTime();
        long tempoExecucao02 = fim - inicio;
        System.out.print("\nTempo de execução para ordenação selectionSort: " 
                + tempoExecucao02 + " milésimos");
        
        int entrada, j;
        inicio = System.nanoTime();
        for(int i = 1; i < array.length; i++){
            entrada = array[i];
            for(j = i - 1;  j >= 0 && array[j] >  entrada ; j-- ){
                array[j+1] = array[j];
            }
            array[j+1] =  entrada;
        }
        fim = System.nanoTime();
        long tempoExecucao3 = fim - inicio;
        System.out.print("\nTempo de execução para ordenação insertionSort: " 
                + tempoExecucao3 + " milésimos\n");
    }
}

