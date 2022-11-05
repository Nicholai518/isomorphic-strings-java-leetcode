public class Solution {
    public boolean isIsomorphic(String s, String t) {
        // used for mapping
        // there are 256 different ascii characters
        char[] sConvertedToT = new char[256];
        char[] tConvertedToS = new char[256];

        // iterate through string s
        for (int i = 0; i < s.length(); i++) {

            // isolate a character from each string
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // we havent seen this character before
            if (sConvertedToT[sChar] == 0 && tConvertedToS[tChar] == 0) {

                // mapping
                sConvertedToT[sChar] = tChar;
                tConvertedToS[tChar] = sChar;
            }
            // there is already a mapping for the character
            // but we need to check if strings are isomorphic
            else if (sConvertedToT[sChar] != tChar) {
                return false;
            }
        }
        return true;
    }
}
