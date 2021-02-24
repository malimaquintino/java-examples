import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main (String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2020-02-24T10:30:34Z"));
        System.out.println("date " + sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println("date " + sdf.format(d));

        int minute = cal.get(Calendar.MINUTE);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = 1 + cal.get(Calendar.MONTH);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("minute " + minute);
        System.out.println("day " + day);
        System.out.println("month " + month);
        System.out.println("week " + week);
    }
}
