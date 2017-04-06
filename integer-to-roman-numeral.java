/*
Given an integer, write a function to return its roman numeral representation.

e.g.
integerToRoman(1) = "I"
integerToRoman(4) = "IV"
integerToRoman(49) = "XLIX"
*/

value= 49
numeral= ""
i= 0

private static final String[] numerals =
  new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}
private static final int[] values =
  new int[]{100, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

public static String integerToRoman(int value){
  if (value - values[i] < 1) throw new IllegalArgumentException();

  StringBuilder numeral = new StringBuilder();
  int i = 0;
  while (value > 0){
    if(value - values[i] >= 0) {
      numeral.append(numerals[i]);
      value -= values[i];
    } else {
      i++;
    }
  }

  return numeral.toString();
}
