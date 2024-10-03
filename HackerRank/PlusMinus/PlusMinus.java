package PlusMinus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {
  /*
   * Estruturas utilizadas na resoluçã0:
   * Fila de Prioridade Mínima para adicionar as menores somas;
   * Fila de Prioridade Máxima para adicionar as maiores somas;
   */
  
  public static void plusMinus(List<Integer> arr) {
    // Mapa para contar positivos, negativos e zeros
    Map<String, Integer> propMap = new HashMap<String, Integer>();

    propMap.put("positives", 0);
    propMap.put("negatives", 0);
    propMap.put("zeros", 0);

    for (int index = 0; index < arr.size(); index++) {
      int numeroAtual = arr.get(index);
      if (numeroAtual < 0) {
        propMap.merge("negatives", 1, Integer::sum);
      } else if (numeroAtual > 0) {
        propMap.merge("positives", 1, Integer::sum);
      } else {
        propMap.merge("zeros", 1, Integer::sum);
      }
    }

    int total = arr.size();

    // Proporção de valores positivos:
    Double propPositivos = propMap.get("positives").doubleValue() / total;
    System.out.printf("%.6f%n", propPositivos);

    // Proporção de valores negativos:
    Double propNegativos = propMap.get("negatives").doubleValue() / total;
    System.out.printf("%.6f%n", propNegativos);

    // Proporção de valores zeros:
    Double propZeros = propMap.get("zeros").doubleValue() / total;
    System.out.printf("%.6f%n", propZeros);
  }
}
