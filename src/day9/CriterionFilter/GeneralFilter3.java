package day9.CriterionFilter;

import java.util.ArrayList;
import java.util.List;

public class GeneralFilter3 {
    public static List<String> stringFilter(List<String> ls, StringCriterion sc){
        List<String> result = new ArrayList<>();
        for(String val : ls){
            if(sc.test(val)) {
                result.add(val);
            }
        }
        return result;
    }


}
