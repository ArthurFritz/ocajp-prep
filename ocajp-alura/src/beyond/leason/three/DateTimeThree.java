package beyond.leason.three;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class DateTimeThree {
    public static void main(String[] args) {
        Date d = new Date();
        Instant i1 = d.toInstant();
        LocalDateTime ldt1 = LocalDateTime.ofInstant(i1, ZoneId.systemDefault());

        Calendar c = Calendar.getInstance();
        Instant i2 = c.toInstant();
        LocalDateTime ldt2 = LocalDateTime.ofInstant(i2, ZoneId.systemDefault());

        Instant i3 = ldt2.toInstant(ZoneOffset.UTC);
        Date d2 = Date.from(i3);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(d2);




    }
}
