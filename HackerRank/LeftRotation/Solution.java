package LeftRotation;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a primeira linha contendo n (tamanho do array) e d (número de rotações)
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.nextLine(); // Consome a linha para evitar problemas de leitura

        // Lê o array de inteiros
        List<Integer> a = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Realiza a rotação
        List<Integer> result = Result.rotLeft(a, d);

        // Imprime o resultado no terminal
        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
        
        scanner.close();
    }
}
