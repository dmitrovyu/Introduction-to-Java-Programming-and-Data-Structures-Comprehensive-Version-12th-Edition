
package Exercise_06_24;

/**
 * (Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the 
 * current time. Revise this example to display the current date and time. The calendar example
 * in Listing 6.12, PrintCalendar.java, should give you some ideas on 
 * how to find the year, month, and day.
 * @author DEJAN
 */
public class Exercise_06_24 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
      
 
        long totalSeconds = totalMilliseconds / 1000;
        long sec = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long min = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long hour = totalHours % 24;
        long totalDays = totalHours / 24;
        System.out.println("Time: GMT " + hour + ":" + min + ":" + sec);
        
        long remainingDays = remainingDays(totalDays);
        int currentYear = getYear(totalDays);
        int currentMonth = getMonth(remainingDays, currentYear);
        int currentDay = getDay(remainingDays,currentMonth, currentYear);
        System.out.println("Date: " + getMonthName(currentMonth) + " " + currentDay + ", " + currentYear);
        
    }
    public static boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getYear(long totalDays){
        int year = 1970;
        do {
            if (isLeap(year + 1)) totalDays -= 366;
            else totalDays -= 365;
            year++;
        } while ((isLeap(year) && totalDays > 366) || (!isLeap(year) && totalDays > 365));
        return year;
    }
    public static long remainingDays(long totalDays){
        int year = 1970;
        long remainingDays = totalDays;
        do {
            if (isLeap(year + 1)) remainingDays -= 366;
            else remainingDays -= 365;
            year++;
        } while ((isLeap(year) && remainingDays > 366) || (!isLeap(year) && remainingDays > 365));
        return remainingDays;
    }
    public static int getMonth(long remainingDays, int currentYear){
        int month = 0;
        for (int i = 1; i < 13; i++) {
            if (i ==1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                remainingDays -= 31;
            else if (i == 2  && isLeap(currentYear)) remainingDays -= 29;
            else if (i == 2 && !isLeap(currentYear)) remainingDays -= 28;
            else remainingDays -= 30;
            
            if (remainingDays > 0) month = i;
            else break;         
        }
        return month + 1;
    }
    public static int getDay(long remainingDays, int currentMonth, int currentYear){
        int days = 0;
        System.out.println("current Month: " + currentMonth);
        for (int i =1; i < currentMonth; i++){
            if (currentMonth == 1) return (int)remainingDays; 
            if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                days += 31;
            else if (i == 2  && isLeap(currentYear)) days += 29;
            else if (i == 2 && !isLeap(currentYear)) days += 28;
            else days += 30;
            
            
        }
        days = (int) (remainingDays - days);
        return days + 1;
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
}
