package Exercise_06_33;

/**
 *
 * (Current date and time) Invoking System.currentTimeMillis() returns the 
 * elapsed time in milliseconds since midnight of January 1, 1970. Write a program 
 * that displays the date and time. Here is a sample run:
 * 
 * Current date and time is May 16, 2012 10:34:23
 * 
 * @author DejanD
 */
public class Exercise_06_33 {
    public static void main(String[] args) {
        //long timeMillis = System.currentTimeMillis();
        long timeMillis = 1293930000000L;
        System.out.print("Current date and time is ");
        System.out.print(date(timeMillis)+ " ");
        System.out.print(time(timeMillis));
    }
    public static String date(long totalMilliseconds) {
        long totalDays = totalMilliseconds/1000/60/60/24;
        
        //Find year
        int year = 1970;
        long remainingDays = totalDays;
        do {
            remainingDays = (isLeap(year)) ? (remainingDays - 366) : (remainingDays - 365);
            year++;
        } while(remainingDays > 0);
        year --;
        
        remainingDays = (isLeap(year)) ? (366+remainingDays) : (365+remainingDays);
        
        //Find month
        int month = 0;
        do {
            if (month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                remainingDays -= 31;
            else if (month == 2  && isLeap(year)) remainingDays -= 29;
            else if (month == 2 && !isLeap(year)) remainingDays -= 28;
            else remainingDays -= 30;
            month ++;
        } while(remainingDays > 0);

        //Find day of the Month
        int day = 0;
        if (month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                remainingDays += 31;
            else if (month == 2  && isLeap(year)) remainingDays += 29;
            else if (month == 2 && !isLeap(year)) remainingDays += 28;
            else remainingDays += 30;
        day = (int) remainingDays;
        
        return getMonthName(month)+ " " + day + ", " + year;
    }
    
    public static boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static String getMonthName(int month){
        switch(month){
            case 1 : return "January";
            case 2 : return "February";
            case 3 : return "March";
            case 4 : return "April";
            case 5 : return "May";
            case 6 : return "June";
            case 7 : return "July";
            case 8 : return "August";
            case 9 : return "September";
            case 10 : return "October";
            case 11 : return "Novemeber";
            case 12 : return "December";
            default : return null;
        }
    }
    
    public static String time(long totalMilliseconds)
    {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
       

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = (totalMinutes / 60);

        // Compute the current hour
        long currentHour = totalHours % 24;


        // return results
        return twoDigits(currentHour)+ ":" 
                + twoDigits(currentMinute) + ":" 
                + twoDigits(currentSecond) + " GMT";
    }
    
    public static String twoDigits(long num){
        String out = (num < 10) ? "0" + num :  "" + num;
        return out;
    }

}
