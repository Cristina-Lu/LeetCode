package test.java.simple;

import main.java.simple.Problem27RemoveElement;
import org.junit.Test;

public class Problem27RemoveElementTest {
    @Test
    public void test(){
        Problem27RemoveElement problem27RemoveElement
                =new Problem27RemoveElement();
        int[] tests={1,2,3,4,5,6,7};
        //System.out.println(problem27RemoveElement.removeElement(tests,1));
        //System.out.println(problem27RemoveElement.removeElement(tests,7));
        //System.out.println(problem27RemoveElement.removeElement(tests,5));
        System.out.println(problem27RemoveElement.removeElement(tests,9));


    }
}
