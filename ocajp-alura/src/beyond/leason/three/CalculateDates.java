package beyond.leason.three;

import types.leason.five.method.People;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalculateDates {
    public static void main(String[] args) {
        Instant i = Instant.now();
        Duration tenSeconds = Duration.ofSeconds(10);
        Instant i2 = i.plus(tenSeconds);
        System.out.println(i);
        System.out.println(i2);

        Instant m1 = Instant.EPOCH;
        Instant m2 = Instant.now();
        long seconds = Duration.between(m1,m2).getSeconds();
        System.out.println(seconds);


        LocalDate ld1 = LocalDate.of(1989,7,8);
        LocalDate ld2 = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(ld1,ld2));
        System.out.println(ChronoUnit.MONTHS.between(ld1,ld2));
        System.out.println(ChronoUnit.DAYS.between(ld1,ld2));

        Period timeLife = Period.between(ld1, ld2);
        System.out.println(timeLife);
        System.out.println(timeLife.getYears());
        System.out.println(timeLife.getMonths());
        System.out.println(timeLife.getDays());


    }
}
