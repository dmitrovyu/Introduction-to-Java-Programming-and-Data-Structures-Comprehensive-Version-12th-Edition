package Exercise_10_01;

/**
 *
 *(The Time class) Design a class named Time. The class contains:
 * ■ The data fields hour, minute, and second that represent a time.
 * ■ A no-arg constructor that creates a Time object for the current time. (The
 * values of the data fields will represent the current time.)
 * ■ A constructor that constructs a Time object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds. (The values of the data
 * fields will represent this time.)
 * ■ A constructor that constructs a Time object with the specified hour, minute,
 * and second.
 * ■ Three getter methods for the data fields hour, minute, and second,
 * respectively.
 * ■ A method named setTime(long elapseTime) that sets a new time for the
 * object using the elapsed time. For example, if the elapsed time is 555550000
 * milliseconds, the hour is 10, the minute is 19, and the second is 10.
 * Draw the UML diagram for the class then implement the class. Write a
 * test program that creates three Time objects (using new Time(), new
 * Time(555550000), and new Time(5, 23, 55)) and displays their hour,
 * minute, and second in the format hour:minute:second.
 * (Hint: The first two constructors will extract the hour, minute, and second
 * from the elapsed time. For the no-arg constructor, the current time can be
 * obtained using System.currentTimeMillis(), as shown in Listing 2.7,
 * ShowCurrentTime.java. Assume the time is in GMT.)
 * 
 * UML diagrame created by https://www.plantuml.com/
/-------------------------------------------\
|Time                                       |
|-------------------------------------------|
|-hour:int                                  |
|-minutes:int                               |
|-seconds:int                               |
* ------------------------------------------|
|+Time()                                    |
|+Time(elapsedTime:long)                    |
|+seTime(hour:int, minutes:int, seconds:int)|
|+getString():String                        |
|+getHour():int                             |
|+getMinutes():int                          |
|+getSeconds():int                          |
\-------------------------------------------/
 * @author DejanD 
 */
public class Exercise_10_01 {

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);
        
        System.out.println("First time: " + time1.getHours() +  ":" 
                + time1.getMinutes() + ":" + time1.getSeconds());
        System.out.println("Second time: " + time2.getHours() +  ":" 
                + time2.getMinutes() + ":" + time2.getSeconds());
        System.out.println("Second time: " + time3.getHours() +  ":" 
                + time3.getMinutes() + ":" + time3.getSeconds());
                
               
    }
}
