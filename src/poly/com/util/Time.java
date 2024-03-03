package poly.com.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author TinDev
 */
public class Time {
    public static Thread hour, day;
    public static Thread loadHour(JLabel lblHour) {
        hour = new Thread() {
            @Override
            public void run() {
                while (true) {
                    Date d = new Date();
                    SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss a");
                    String time = f.format(d);
                    lblHour.setText(time);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        hour.start();
        return hour;
        
    }
    
    public static Thread loadDay(JLabel lblday) {
        day = new Thread() {
            @Override
            public void run() {
                while (true) {
                    Date d = new Date();
                    SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
                    String day = fd.format(d);
                    lblday.setText(day);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        day.start();
        return day;
    }
}
