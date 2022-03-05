package com.medium;

import com.toolClasses.ToString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Problem399EvaluateDivisionTest {

    @Test
    public void test(){
        Problem399EvaluateDivision problem399EvaluateDivision
                = new Problem399EvaluateDivision();
        List<List<String>> equation = new ArrayList<>();
        List<String> equation1 = new ArrayList<>();
        equation1.add("a");
        equation1.add("b");
        List<String> equation2 = new ArrayList<>();
        equation2.add("b");
        equation2.add("c");
        List<String> equation3 = new ArrayList<>();
        equation3.add("bc");
        equation3.add("cd");
        equation.add(equation1);
        equation.add(equation2);
        equation.add(equation3);
        double[] values = {1.5,2.5,5.0};
        List<List<String>> queries  = new ArrayList<>();
        List<String> queries1  = new ArrayList<>();
        queries1.add("a");
        queries1.add("c");
        List<String> queries2 = new ArrayList<>();
        queries2.add("b");
        queries2.add("bc");
        List<String> querie3 = new ArrayList<>();
        querie3.add("bc");
        querie3.add("cd");
        queries.add(queries1);
        queries.add(queries2);
        queries.add(querie3);
        ToString.SingleDouble(
                problem399EvaluateDivision.calcEquation(equation,values,queries)
        );
    }
}
