package Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class multiplevalues {


    public static void main(String[] arg)
    {

//        List<String> stringList=new LinkedList<>();
        Map<String, List<String>> gfg = new HashMap<String,List<String>>();

        // enter name/url pair
        /*gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");
        gfg.put("GFG", "quiz.geeksforgeeks.org");*/
        List<String> one=new ArrayList<>();
        one.add("geeksforgeeks.org");
        one.add("quiz.geeksforgeeks.org");

        gfg.put("GFG",one);

        // forEach(action) method to iterate map

        gfg.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

    }
}
