package Demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Demo_Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.MONTH)+1);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getMonth());
    }
}
