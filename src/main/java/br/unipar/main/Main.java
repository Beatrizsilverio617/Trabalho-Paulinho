
package br.unipar.main;

import static br.unipar.main.ordenacao.Bolha.bubbleSort;
import static br.unipar.main.ordenacao.ImprimirTempo.ImprimirTempo;
import static br.unipar.main.ordenacao.Insercao.insertionSort;
import static br.unipar.main.ordenacao.Selecao.selectionSort;
import javax.swing.JOptionPane;



public class Main {

    public static void main(String[] args) {
                int array;

        array = Integer.parseInt(JOptionPane.showInputDialog
        ("Insira o tamanho da array: "));
        int[] numeros = new int[array];
        for (int i = 0; i < numeros.length; i++) {
            String input = JOptionPane.showInputDialog("Informe o número para a posição " + i + ":");
            numeros[i] = Integer.parseInt(input);
        }
        System.out.println("Array está desordenada");
        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);
        }
        

        String input = JOptionPane.showInputDialog("Qual método de ordenação deseja realizar?\n "
                + " ('1' para utilizar o método BubbleSort, "
                + "'2' para utilizar o método SelectionSort ou '3' para usar o método InsertionSort): ");
        switch (input.toUpperCase()) {

            case "1":
                bubbleSort(numeros);
                System.out.println("Ordenação bubble sort: ");
                for (int num :numeros) {
                    System.out.println(num);
                }
                break;

            case "2":
                selectionSort(numeros);
                System.out.println("Ordenação selection sort: ");
                for (int num : numeros) {
                    System.out.println(num);
                }
                break;

            case "3":
                insertionSort(numeros);
                System.out.println("Ordenação insertion sort: ");
                for (int num :numeros) {
                    System.out.println(num);
                }
                break;

            default:
                System.out.println("Ordenação inválida! selecione uma das opções para ordenar 1, 2 ou 3");
        }
        
        ImprimirTempo(numeros);
        
        
        
    }
}
 

