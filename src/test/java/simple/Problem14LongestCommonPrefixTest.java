package test.java.simple;

import main.java.simple.Problem14LongestCommonPrefix;
import org.junit.Test;

public class Problem14LongestCommonPrefixTest {
    @Test
    public void tests(){
        Problem14LongestCommonPrefix problem14LongestCommonPrefix
                =new Problem14LongestCommonPrefix();
        //String[] m={"flower","flow","flight"};
        //String[] m={"dog","racecar","car"};
        String[] m={"","",""};
        System.out.println(problem14LongestCommonPrefix.longestCommonPrefix(m));
    }
}
