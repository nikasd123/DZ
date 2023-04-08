import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        dayOfWeek();
    }

    public static void dayOfWeek(){
        dayOfWeekByDate();
        dateOfTuesday();
    }

    public static void dayOfWeekByDate() {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        DayOfWeek day = date.getDayOfWeek();
        System.out.println("The day of the week is: " + day);

//        DateFormat format = new SimpleDateFormat("hh:mm a MM/dd/yyyy");
//        Date date = new Date();
//        System.out.println(format.format(date));
//
//        System.out.println();
//
//        format = new SimpleDateFormat("HH:mm dd/MM/yyyy");
//        System.out.println(format.format(date));
    }

    public static void dateOfTuesday(){
        LocalDate ld = LocalDate.of(2023, Month.MARCH, 30);
        ld = ld.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        
        System.out.println(ld);
    }
}