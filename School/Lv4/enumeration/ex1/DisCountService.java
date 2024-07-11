package enumeration.ex1;

public class DisCountService {
    public int disCount(String grade, int price) {
        int disCountPercent = 0;

        if(grade.equals(StringGrade.BASIC))
            disCountPercent = 10;

        else if(grade.equals(StringGrade.GOLD))
            disCountPercent = 20;

        else if(grade.equals(StringGrade.DIAMOND))
            disCountPercent = 30;

        return price * disCountPercent / 100;
    }
}
