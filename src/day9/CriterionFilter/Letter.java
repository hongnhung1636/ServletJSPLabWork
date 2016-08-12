package day9.CriterionFilter;

public class Letter implements StringCriterion{

    @Override
    public boolean test(String ls){
        String test = ls.toLowerCase();
        return(!ls.equals(test));
    }
}