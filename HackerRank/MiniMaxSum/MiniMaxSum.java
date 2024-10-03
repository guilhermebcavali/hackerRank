import java.util.*;

class Result {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    Collections.sort(arr);

    int somaTotal = 0;
    for (int numero : arr) {
      somaTotal += numero;
    }

    for (int numero : arr) {
      int somaParcial = somaTotal;
      somaParcial -= numero;
      minHeap.add(somaParcial);
      maxHeap.add(somaParcial);
    }

    System.out.print(minHeap.peek() + " " + maxHeap.peek());
  }

}
