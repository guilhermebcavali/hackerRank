import java.util.*;

class Result {

  /*
   * Complete the 'alternate' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts STRING s as parameter.
   */

   // exemplo de entrada: s = 'beabeefeab'

  public static int alternate(String s) {
    Map<Character, Integer> charsCount = new HashMap<>();
    // validar se o input já está correto


    // se não, iniciar tratamento da string
    for(int i = 0; i < s.length(); i++) {
      Character currentChar = s.charAt(i);
      charsCount.put(currentChar, 1, Integer::sum);
    }

    return 0;
  }

}
