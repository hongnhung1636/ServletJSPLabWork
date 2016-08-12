package day9.CriterionFilter;

public class FirstLetter implements StringCriterion{
    @Override
    public boolean test(String ls){
        return (ls.toUpperCase().startsWith("A")||ls.toUpperCase().startsWith("M"));
    }
}