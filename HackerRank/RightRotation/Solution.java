package RightRotation;

import java.util.*;
import java.util.stream.*;

/* Formato da Entrada:
3 2 3 --> tamanho do array / nro de rotacoes / numero de queries
1 2 3 --> elementos do array
0 --> querie 1 = retornar elemento de indice 0
1 --> querie 2 = retornar elemento de indice 1
2 --> querie 3 = retornar elemento de indice 2
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a primeira linha com n (tamanho do array), k (rotações), e q (consultas)
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();

        // Lê o array
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        // Lê as consultas
        List<Integer> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(scanner.nextInt());
        }

        // Executa a rotação e resolve as consultas
        List<Integer> result = Result.circularArrayRotation(a, k, queries);

        // Imprime o resultado no terminal
        result.forEach(System.out::println);

        scanner.close();
    }
}

