import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DayOff {

    // Parameterized constructor
    public DayOff (String nextClassDateStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter.withLocale(Locale.ENGLISH);

        LocalDate nextClassDate = LocalDate.parse(nextClassDateStr, formatter);

        Duration duration = Duration.between(LocalDateTime.now(), nextClassDate.atStartOfDay());

        System.out.printf("My next SDA class is in %d days", duration.toDays());

    }
}
