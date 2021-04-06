import java.util.Scanner;

public class Userinputs
{
    Scanner scan = new Scanner(System.in);
    String fileName = "", event = "";
    int day, month, year, hour, minute;
        
        public String event() {
            System.out.print("Please enter the name of the event.");
            event = scan.nextLine();
            return event;
        }
        
        public Int month() {
            System.out.print("Please enter the Month of the event.");
            month = scan.nextInt();
        }
        
        public Int day() {
            System.out.print("Please enter the Day of the event.");
            day = scan.nextInt();
        }
        
        public Int year() {
            System.out.print("Please enter the Year of the event.");
            year = scan.nextInt();
        }

        public Int hour() {
            System.out.print("Please enter the Hour of the event.");
            hour = scan.nextInt();
        }

        public Int minute() {
            System.out.print("Please enter the Minute of the event.");
            minute = scan.nextInt();
        }
}