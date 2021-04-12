import java.io.*;
import java.util.Scanner;

public class getRemind {

    public static void get(String eventName, int times) throws FileNotFoundException, IOException {
        File file = new File ("reminders.md");
        Scanner fileScan = new Scanner(file);
        String text = "", findEvent;
        fileScan.useDelimiter("\\n|/|,'|',|:|,");
        while (fileScan.hasNext()) {
            findEvent = fileScan.next();
            if (findEvent.equals(eventName)) {
                for (int i = 0; i < times; i++) {
                    findEvent = fileScan.next();
                }
                text = findEvent;
            }
        }
        System.out.println(text);
    }
      
    public static void getEvent(String eventName) throws FileNotFoundException, IOException {
        get(eventName, 1);
    }

    public static void getDay(String eventName) throws FileNotFoundException, IOException {
        get(eventName, 2);
    }
    
    public static void getMonth(String eventName) throws FileNotFoundException, IOException {
        get(eventName, 3);
    }

    public static void getYear(String eventName) throws FileNotFoundException, IOException {
        get(eventName, 4);
    }

    public static void getHour(String eventName) throws FileNotFoundException, IOException {
        get(eventName, 5);
    }

    public static void getMinute(String eventName) throws FileNotFoundException, IOException {
        get(eventName, 6);
    }

}