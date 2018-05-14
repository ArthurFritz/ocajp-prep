package beyond.leason.three;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTimeTwo {
    public static void main(String[] args) {
        MonthDay mOne = MonthDay.of(1,1);// day one of january
        MonthDay mTwo = MonthDay.of(1,2);//day two of january

        System.out.println(mOne);
        System.out.println(mTwo);
        System.out.println(mOne.isBefore(mTwo));
        System.out.println(mOne.isAfter(mTwo));

        LocalDate d = LocalDate.of(2014,3,29);
        LocalDate d2 = d.withMonth(4).withYear(2015);
        System.out.println(d);
        System.out.println(d2);

        LocalDate d3 = d.plusDays(5).plusMonths(3).minusYears(2);
        System.out.println(d3);

        LocalDate d4 = d.minus(4, ChronoUnit.YEARS);
        System.out.println(d4);



    }
}
