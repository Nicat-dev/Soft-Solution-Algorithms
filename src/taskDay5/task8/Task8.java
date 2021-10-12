package taskDay5.task8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task8 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Current Date " + dateFormat.format(date));


        Calendar c = Calendar.getInstance();
        c.setTime(date);

        c.add(Calendar.HOUR, 2);
        c.add(Calendar.MINUTE, 2);
        c.add(Calendar.SECOND, 2);


        Date currentDatePlusOne = c.getTime();

        System.out.println("Updated Date " + dateFormat.format(currentDatePlusOne));
    }
}
