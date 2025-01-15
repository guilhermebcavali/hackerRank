package StringManipulation;

class Result {

  /*
   * Complete the 'alternatingCharacters' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts STRING s as parameter.
   */

  // Input Sample: ABBAAABBAB
  // Expected Output: ABABAB
  // Deletions: 4

  public static int alternatingCharacters(String s) {
    int charsRemoved = 0;
    String stringOriginal = s;

    for (int charIndex = 0; charIndex < stringOriginal.length() - 1; charIndex++) {
      char currentChar = stringOriginal.charAt(charIndex);
      char nextChar = stringOriginal.charAt(charIndex + 1);

      if (currentChar == nextChar) {
        charsRemoved++;
      }
    }

    return charsRemoved;
  }
}
