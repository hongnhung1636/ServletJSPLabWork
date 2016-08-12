package day9.CriterionFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriterionFilter2 {
    public static List<String> getLongStrings(List<String> ls, int num){
        List<String> list = new ArrayList<String>();
        for (String val : ls) {
            if (val.length() >= num)
                list.add(val);
        }
        return list;
    }
    public static void main(String[] args) {
        List<String> ls = Arrays.asList(
                "Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby"
        );
        List<String> longStrings = getLongStrings(ls, 6);
        assert longStrings.size() == 3;
        assert longStrings.get(0).equals("William");
        assert longStrings.get(1).equals("Susannah");
        assert longStrings.get(2).equals("Orinoco");
    }
}
