package beyond.leason.three;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//dd/JJ/yyyy IllegalArgumentException

        System.out.println(formatter.format(now));
        System.out.println(now.format(formatter));

        LocalDate ld = LocalDate.parse("08/07/1989", formatter);//
        //LocalDate ldexception = LocalDate.parse("08/99/1989", formatter);//DateTimeParseException
        System.out.println(ld);


    }
}
