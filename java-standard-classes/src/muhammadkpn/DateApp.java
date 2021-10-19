package muhammadkpn;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        // Method dari Class Date sudah banyak yg deprecated, sehingga kita harus menggunakan kombinasi Class Date & Class Calendar
        // Instantiate current time
        Date tanggal = new Date();
        System.out.println(tanggal);

        // Instantiate specific time should be input a milliseconds
        Date tanggal2 = new Date(829184523000L);
        System.out.println(tanggal2);

        // Manipulation of date using Class Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar1: " + calendar.getTime());
        calendar.set(Calendar.YEAR, 2011);
        System.out.println("Calendar2: " + calendar.getTime());
        calendar.set(Calendar.MONTH, 2);
        System.out.println("Calendar3: " + calendar.getTime());
        calendar.set(Calendar.DAY_OF_MONTH, 2);
        System.out.println("Calendar4: " + calendar.getTime());

    }
}
