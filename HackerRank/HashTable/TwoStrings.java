package HashTable;

import java.nio.charset.Charset;
import java.util.*;;

class Result {

  /*
   * Complete the 'twoStrings' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   * 1. STRING s1
   * 2. STRING s2
   */

  public static String twoStrings(String s1, String s2) {

    // Complexidade de Acesso: o(1)
    Set<Character> s1Chars = new HashSet<>();

    for(int i = 0; i < s1.length(); i++) {
      s1Chars.add(s1.charAt(i));
    }

    for(int i = 0; i < s2.length(); i++) {
      if (s1Chars.contains(s2.charAt(i))) {
        return "YES";
      }
    }

    return "NO";
  }

}
