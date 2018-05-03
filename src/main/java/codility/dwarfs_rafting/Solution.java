package codility.dwarfs_rafting;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
  public int solution(int N, String S, String T) {
    String[] SList, TList;
    int[] SNum, TNum;
    int parsedIndex, areaNum = 4;
    int areaMax, min, max, num02, num13;

    if (S.isEmpty())
      SList = new String[0];
    else
      SList = S.split(" ");

    if (T.isEmpty())
      TList = new String[0];
    else
      TList = T.split(" ");

    // System.out.printf("slist => %s, slist.lenght => %d, tlist => %s\n", Arrays.toString(SList), SList.length, Arrays.toString(TList));

    SNum = new int[areaNum];
    TNum = new int[areaNum];

    for (int i = 0; i < SList.length; i++) {
      parsedIndex = getIndex(SList[i], N);
      SNum[parsedIndex]++;
    }

    for (int i = 0; i < TList.length; i++) {
      parsedIndex = getIndex(TList[i], N);
      TNum[parsedIndex]++;
    }

    // for (int i = 0; i < areaNum; i++) {
    //   System.out.printf("area %d: s => %d, t => %d\n", i, SNum[i], TNum[i]);
    // }

    areaMax = (N / 2) * (N / 2);

    // calculate 02 range
    if (TNum[0] > TNum[2])
      min = TNum[0];
    else
      min = TNum[2];

    if (SNum[0] > SNum[2])
      max = areaMax - SNum[0];
    else
      max = areaMax - SNum[2];

    // System.out.printf("area 02 calculation: min => %d, max => %d\n", min, max);

    if (min > max)
      return -1;

    num02 = max;

    // calculate 13 range
    if (TNum[1] > TNum[3])
      min = TNum[1];
    else
      min = TNum[3];

    if (SNum[1] > SNum[3])
      max = areaMax - SNum[1];
    else
      max = areaMax - SNum[3];

    // System.out.printf("area 02 calculation: min => %d, max => %d\n", min, max);

    if (min > max)
      return -1;

    num13 = max;

    // System.out.printf("num02 => %d, num13 => %d\n", num02, num13);

    return (num02 + num13) * 2 - TNum[0] - TNum[1] - TNum[2] - TNum[3];
  }

  private int getIndex(String location, int N) {
    String row, column;
    String patternS = "(\\d+)(.+)";
    Pattern p = Pattern.compile(patternS);
    Matcher m = p.matcher(location);

    m.find();

    row = m.group(1);
    column = m.group(2);


    return calculateIndex(row, column, N);
  }

  private int calculateIndex(String row, String column, int N) {
    int rowNum = Integer.parseInt(row) - 1;
    char columnChar = column.charAt(0);
    int columnNum = columnChar - 'A';
    boolean left, front;

    // System.out.printf("row: %s => %d, col: %s => %d\n", row, rowNum, column, columnNum);
    if (rowNum < N / 2)
      front = true;
    else
      front = false;

    if (columnNum < N / 2)
      left = true;
    else
      left = false;

    if (front && left)
      return 0;

    if (front && !left)
      return 1;

    if (!front && left)
      return 3;

    return 2;
  }
}
