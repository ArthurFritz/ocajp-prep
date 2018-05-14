package beyond.leason.three;

import java.time.*;
import java.time.temporal.ChronoField;

public class DateTimeOne {
    public static void main(String[] args) {
        /*
        LocalDate - Data
        LocalTime - Hour
        LocalDateTime - Data and Hour
        MonthDay - day of month
        YearMonth - month and year
        */

        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(d);
        System.out.println(t);
        System.out.println(ldt);

        LocalTime t1 = LocalTime.now(ZoneId.of("America/Chicago"));
        LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(t1);
        System.out.println(t2);


        LocalTime t3 = LocalTime.of(12,0);// min two params hour and minute
        System.out.println(t3);

        LocalDate d1 = LocalDate.of(2014,12,25);
        LocalDate d2 = LocalDate.of(2014, Month.DECEMBER,25);
        System.out.println(d1);
        System.out.println(d2);

        LocalDateTime ldt1 = LocalDateTime.of(2014,12,25,12,0);
        LocalDateTime ldt2 = LocalDateTime.of(d2, t3);
        System.out.println(ldt1);
        System.out.println(ldt2);

        //LocalDate d5 = LocalDate.of(2014,13,25);//DateTimeException

        System.out.println(ldt1.getDayOfMonth());
        System.out.println(ldt1.getYear());
        System.out.println(ldt1.getMonth());
        System.out.println(ldt1.getHour());

        System.out.println(ldt1.get(ChronoField.DAY_OF_WEEK));
        System.out.println(ldt1.get(ChronoField.DAY_OF_MONTH));

        LocalDate d4 = LocalDate.now();
        //LocalDate.getHour(); not found exception
        //d4.get(ChronoField.HOUR_OF_DAY);// EXCEPTION UnsupportedTemporalTypeException

    }
}
