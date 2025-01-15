package HashTable;

import java.util.*;

class Result {

  /*
   * Complete the 'checkMagazine' function below.
   *
   * The function accepts following parameters:
   *  1. STRING_ARRAY magazine
   *  2. STRING_ARRAY note
   */

  public static void checkMagazine(List<String> magazine, List<String> note) {
    Map<String, Integer> allWordsNoteCount = new HashMap<>(); // armazenar as palavras e a contagem de cada uma delas
    Map<String, Integer> allWordsMagazineCount = new HashMap<>(); // armazenar as palavras e a contagem de cada uma delas
    Boolean noFlag = false;

    // mapear as palavras do note para o dicionario;
    for(int i = 0; i < note.size(); i++) {
      allWordsNoteCount.merge(note.get(i), 1, Integer::sum);
    }

    // mapear as palavras da magazine para o dicionário;
    for(int i = 0; i < magazine.size(); i++) {
      allWordsMagazineCount.merge(magazine.get(i), 1, Integer::sum);
    }

    // Comparar os dicionarios e quantidades de palavras em cada um deles;
    for(String key : allWordsNoteCount.keySet()){

      // Se não existir pelo menos uma palavra do dicionario note no dicionario magazine, já printa "No"
      if (!allWordsMagazineCount.containsKey(key)) {
        System.out.println("No");
        noFlag = true;
        break;
      } 
      
      // se a palavra existe em ambos dicionarios, mas quantidade dessa palavra no dicionario magazine for menor do que no dicionario note, printa "No" também
      else if (allWordsMagazineCount.get(key) < allWordsNoteCount.get(key)) {
        System.out.println("No");
        noFlag = true;
        break;
      }
    }

    // caso contrário, o dicionário magazine possui as palavras necessárias para formar a frase do dicionário Note.
    if(noFlag == false) {
      System.out.println("Yes");
    }
  }
}
