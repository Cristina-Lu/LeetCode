package com.medium;

import org.junit.Test;

public class Problem71SimplifyPathTest {
    @Test
    public void test(){
        Problem71SimplifyPath problem71SimplifyPath = new Problem71SimplifyPath();
        String[] path ={"/home/","/a/./b/../../c/","/home//foo/","/home","/../"
        ,"/.././GVzvE/./xBjU///../..///././//////T/../../.././zu/q/e"};
        System.out.println(problem71SimplifyPath.simplifyPath(path[0]));
        System.out.println(problem71SimplifyPath.simplifyPath(path[1]));
        System.out.println(problem71SimplifyPath.simplifyPath(path[2]));

        System.out.println(problem71SimplifyPath.simplifyPath(path[3]));

        System.out.println(problem71SimplifyPath.simplifyPath(path[4]));
        System.out.println(problem71SimplifyPath.simplifyPath(path[5]));

    }
}
