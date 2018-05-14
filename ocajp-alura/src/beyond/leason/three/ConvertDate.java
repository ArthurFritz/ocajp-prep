package beyond.leason.three;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ConvertDate {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate d = ldt.toLocalDate();
        LocalTime t = ldt.toLocalTime();
        System.out.println(ldt);
        System.out.println(d);
        System.out.println(t);

        LocalDateTime ldt1 = d.atTime(t);
        LocalDateTime ldt2 = t.atDate(d);
        System.out.println(ldt1);
        System.out.println(ldt2);




    }
}
