package day9.CriterionFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriterionFilter1 {
    public static List<String> getLongStrings(List<String> ls){
        List<String> list = new ArrayList<String>();
        for (String val : ls) {
            if (val.length() >= 6)
                list.add(val);
        }
        return list;
        }

}
