import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scan = new Scanner("System.in");
        String str = "03:12:20 Sunday 19-Dec-2021";
        int hour = Integer.parseInt(str.substring(0,2));
        int minutes = Integer.parseInt(str.substring(3,5));
        int seconds = Integer.parseInt(str.substring(6,8));
        String day = str.substring(9,15);
        int date = Integer.parseInt(str.substring(16,18));
        String month = str.substring(19,22);
        int year = Integer.parseInt(str.substring(23));
        
        System.out.println(hour);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

    
    }
    
}
