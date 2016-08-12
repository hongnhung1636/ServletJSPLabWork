package day9.CriterionFilter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList(
                "Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby"
        );
        List<String> longStrings = CriterionFilter1.getLongStrings(ls);
        assert longStrings.size() == 3;
        assert longStrings.get(0).equals("William");
        assert longStrings.get(1).equals("Susannah");
        assert longStrings.get(2).equals("Orinoco");

        StringCriterion[] sc = {new LongerThreshold(6),new FirstLetter(),new Letter() };
        for (StringCriterion aSc : sc) {
            System.out.println(GeneralFilter3.stringFilter(ls, aSc));
        }
    }
}
