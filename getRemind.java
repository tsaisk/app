import java.io.*;
import java.util.Scanner;

public class getRemind {

    public static String get(String eventName, String string) throws FileNotFoundException, IOException {
        File file = new File ("reminders.md");
        Scanner fileScan = new Scanner(file);
        String text = "", findEvent;
        fileScan.useDelimiter("\\n|/|,'|',|:|,");
        while (fileScan.hasNext()) {
            findEvent = fileScan.next();
            if (findEvent.equals(eventName)) {
                for (int i = 0; i < string; i++) {
                    findEvent = fileScan.next();
                }
                text = findEvent;
            }
        }
        return text;
    }
      
    public static String getEvent(String eventName) throws FileNotFoundException, IOException {
        return get(eventName, 1);
    }

    public static int getDay(String eventName) throws FileNotFoundException, IOException {
        return Integer.parseInt(get(eventName, 2));
    }
    
    public static int getMonth(String eventName) throws FileNotFoundException, IOException {
        return Integer.parseInt(get(eventName, 3));
    }

    public static int getYear(String eventName) throws FileNotFoundException, IOException {
        return Integer.parseInt(get(eventName, 4));
    }

    public static int getHour(String eventName) throws FileNotFoundException, IOException {
        return Integer.parseInt(get(eventName, 5));
    }

    public static int getMinute(String eventName) throws FileNotFoundException, IOException {
        return Integer.parseInt(get(eventName, 6));
    }

}