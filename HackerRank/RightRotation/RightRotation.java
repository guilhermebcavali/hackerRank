package RightRotation;

import java.util.*;

class Result {

  /*
   * Complete the 'circularArrayRotation' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER k
   *  3. INTEGER_ARRAY queries --> indices que terei que retornar o valor
   */

   public static List<Integer> circularArrayRotation(List<Integer> array, int rotationsNumber, List<Integer> queries) {
    List<Integer> rotatedArray = new ArrayList<>();

    // Cálculo do número efetivo de rotações
    int d = rotationsNumber % array.size();

    // Fatia 1: Últimos `d` elementos (do final para o início)
    for (int i = array.size() - d; i < array.size(); i++) {
        rotatedArray.add(array.get(i));
    }

    // Fatia 2: Elementos restantes (do início até antes da fatia 1)
    for (int i = 0; i < array.size() - d; i++) {
        rotatedArray.add(array.get(i));
    }

    // Para cada query em `queries`, adiciona os valores correspondentes do array rotacionado
    List<Integer> queriedArrayToReturn = new ArrayList<>();
    for (int indexToReturn : queries) {
        queriedArrayToReturn.add(rotatedArray.get(indexToReturn));
    }

    return queriedArrayToReturn;
}
}
