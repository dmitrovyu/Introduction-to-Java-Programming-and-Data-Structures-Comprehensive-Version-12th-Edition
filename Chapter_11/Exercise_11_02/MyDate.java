
package Exercise_11_02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author DejanD
 */
public class MyDate {
    private int day,month,year;
    
    public MyDate(){
        this(System.currentTimeMillis());
    }
    
    public MyDate(long milliseconds){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(milliseconds);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH);
        this.year = calendar.get(Calendar.YEAR);
    }
    
    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    public void setTime(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH);
        this.year = calendar.get(Calendar.YEAR);
    }
    
}
