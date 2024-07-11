package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DisCountService {
    public int disCount(ClassGrade classGrade, int price) {
        int disCountPercent = 0;

        if(classGrade == classGrade.BASIC)
            disCountPercent = 10;

        else if(classGrade == classGrade.GOLD)
            disCountPercent = 20;

        else if(classGrade == classGrade.DIAMOND)
            disCountPercent = 30;
        else
            System.out.println("할인X");

        return price * disCountPercent / 100;
    }
}
