import java.util.*;

class Result {

  /*
   * Estruturas utilizadas na resoluçã0:
   * Fila de Prioridade Mínima para adicionar as menores somas;
   * Fila de Prioridade Máxima para adicionar as maiores somas;
   * Long para representar os numeros e evitar estouro de representação
   * (overflow);
   */

  public static void miniMaxSum(List<Integer> arr) {
    PriorityQueue<Long> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Long> minHeap = new PriorityQueue<>();

    Collections.sort(arr);

    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }

    long somaTotal = 0;
    for (int i = 0; i < arr.size(); i++) {
      somaTotal = somaTotal + arr.get(i);
    }

    for (int numero : arr) {
      long somaParcial = somaTotal;
      somaParcial -= numero;
      minHeap.add(somaParcial);
      maxHeap.add(somaParcial);
    }

    // System.out.println("Soma total dos numeros: " + somaTotal);
    // System.out.println("Menor soma dos numeros: " + minHeap.peek());
    // System.out.println("Maior soma dos numeros: " + maxHeap.peek());
    System.out.print(minHeap.peek() + " " + maxHeap.peek());
  }

}
