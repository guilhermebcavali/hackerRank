package TimeConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Problem Description: Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
*/

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String s = bufferedReader.readLine();

    String result = Result.timeConversion(s);

    System.out.println(result); // Imprime o resultado no console

    bufferedReader.close();
  }
}
