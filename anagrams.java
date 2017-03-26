/*
Given two strings, write a function to determine whether they are anagrams.

banana
BANANA

*/


public boolean isAnagram(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] letters = new int[1<<8];

        for (char c : s1.toCharArray()) {
            letters[c]++;
        }

        for (char c : s2.toCharArray()) {
            letters[c]--;
        }

        for (int i : letters) {
            if (i != 0) return false;
        }

        return true;
}

isAnagram("", ""); // return true
isAnagram("abb", "bab"); // return false
isAnagram("abbb", "baba"); // return false
isAnagram("babble", "elbbab"); // return true
