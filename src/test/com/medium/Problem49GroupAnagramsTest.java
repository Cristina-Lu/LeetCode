package com.medium;

import org.junit.Test;

public class Problem49GroupAnagramsTest {
    @Test
    public void test(){
        Problem49GroupAnagrams problem49GroupAnagrams
                = new Problem49GroupAnagrams();
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{""}));
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"a"}));
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"ac","d"}));
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"duh","ill"}));
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"erg","pie"}));
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"mes","pep"}));
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"ads","gap"}));
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"ape","oaf","arc"}));
        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"tho","tin","erg","end","pug","ton",
                        "alb","mes","job","ads","soy","toe","tap",
                        "sen","ape","led","rig","rig","con","wac",
                        "gog","zen","hay","lie","pay","kid","oaf",
                        "arc","hay","vet","sat","gap","hop","ben",
                        "gem","dem","pie","eco","cub","coy","pep","wot","wee"}));

        System.out.println(problem49GroupAnagrams.groupAnagrams(
                new String[]{"vow","pam","vic","bee","ken","jay",
                        "oft","sue","joy","yuk","sac","mac","inc",
                        "big","icy","bus","lob","flo","day","aol",
                        "eel","rex","jug","man","cod","mix","guy",
                        "ken","ion","meg","tot","noe","ref","ito","inn","van","cry","tad"}));

    }
}
