package day9.CriterionFilter;

public class LongerThreshold implements StringCriterion{
    int num;

    public LongerThreshold(int num){
        this.num = num;
    }

    @Override
    public boolean test(String ls){
        return (ls.length() > this.num);
    }
}
