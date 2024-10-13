
package Exercise_10_01;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author DejanD
 */
public class Time {
    private int hours, minutes, seconds;
    
    public Time() {
        this(System.currentTimeMillis());
        
    }
    // Constructs a Time object with a specified elapsed 
	// time since midnight, January 1, 1970, in milliseconds.
    public Time (long elapsedTime){
        this.setTime(elapsedTime);
    }
    
    public Time (int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public final void setTime(long elapsedTime){
        this.seconds = (int) ((elapsedTime/1000) % 60);
        this.minutes = (int) ((elapsedTime/1000*60) % 60);
        this.minutes = (int) ((elapsedTime / 1000 * 60 * 60) % 60);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    
}
