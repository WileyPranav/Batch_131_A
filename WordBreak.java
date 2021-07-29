/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author pshastri
 */
public class WordBreak {
    private static boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakRecur(s, new HashSet<>(wordDict), 0);
    }

    private static boolean wordBreakRecur(String s, Set<String> wordDict, int start) {
        if (start == s.length()) {
            return true;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreakRecur(s, wordDict, end)) {
                return true;
            }
        }
        return false;
    }
      public static void main(String[] args) {
        String s = "WordbreakproblemilikeAlphaViktorsamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithiceilikesamsungmobileandicecreamwithice";
        String Dict = "this, th, is, famous, Word, break, b, r, e, a, k, br, bre, brea, ak, problem, Alpha, Beta, Delta, Gamma, Sigma, Viktor, Vajt, Adios, Test, Line, Word1, Word2, i, like, sam, sung, with, samsung, mobile, ice, cream, icecream, man, go, mango, and";
        String [] wordDict = Dict.split(", ");
       // String s = "catsanddog";
        //String [] wordDict = {"cats","dog","sand","and","cat"};
        System.out.println(" The Status of the Given string in the Dictionary is :"
        +wordBreak(s, Arrays.asList(wordDict)));
    }
}

