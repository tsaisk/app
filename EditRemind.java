import java.io.*;
import java.util.Scanner;


public class EditRemind {
    
    public static void editEvent(String eventName, String newEvent) throws FileNotFoundException, IOException {
        File file = new File ("reminders.md");
        Scanner fileScan = new Scanner(file);
        String text = "", findEvent;
        int count = 0;
        fileScan.useDelimiter("\\n|/|,'|',|:|,");
        while (fileScan.hasNext()) {
            findEvent = fileScan.next();
            if (findEvent.equals(eventName)) {
                text = text + findEvent + ",'" + newEvent + "',";
                findEvent = fileScan.next();
                count = 2;
            } else {
                text += findEvent;
                count++;
                if (count == 7) {
                    text += "\n";
                    count = 0;
                } else if (count == 6) {
                    text += ":";
                } else if (count == 4 || count == 3) {
                    text += "/";
                } else if (count == 2) {
                    text += "',";
                } else if (count == 1) {
                    text += ",'";
                } else {
                    text += ",";
                }
            }
        }
        print(text);
    }

    public static void editDate(String eventName, int newDay, int newMonth, int newYear) throws FileNotFoundException, IOException {
        File file = new File ("reminders.md");
        Scanner fileScan = new Scanner(file);
        String text = "", findEvent;
        int count = 0;
        fileScan.useDelimiter("\\n|/|,'|',|:|,");
        while (fileScan.hasNext()) {
            findEvent = fileScan.next();
            if (findEvent.equals(eventName)) {
                text = text + findEvent + ",'" + fileScan.next() + "'," + newDay + "/" + newMonth + "/" + newYear + ",";
                findEvent = fileScan.next();
                findEvent = fileScan.next();
                findEvent = fileScan.next();
                count = 5;
            } else {
                text += findEvent;
                count++;
                if (count == 7) {
                    text += "\n";
                    count = 0;
                } else if (count == 6) {
                    text += ":";
                } else if (count == 4 || count == 3) {
                    text += "/";
                } else if (count == 2) {
                    text += "',";
                } else if (count == 1) {
                    text += ",'";
                } else {
                    text += ",";
                }
            }
        }
        print(text);
    }

    public static void editTime(String eventName, int newHour, int newMinute) throws FileNotFoundException, IOException {
        File file = new File ("reminders.md");
        Scanner fileScan = new Scanner(file);
        String text = "", findEvent;
        int count = 0;
        fileScan.useDelimiter("\\n|/|,'|',|:|,");
        while (fileScan.hasNext()) {
            findEvent = fileScan.next();
            if (findEvent.equals(eventName)) {
                text = text + findEvent + ",'" + fileScan.next() + "'," + fileScan.next() + "/" + fileScan.next() + "/" + fileScan.next() + "," + newHour + ":" + newMinute + "\n";
                findEvent = fileScan.next();
                findEvent = fileScan.next();  
                count = 0;
            } else {
                text += findEvent;
                count++;
                if (count == 7) {
                    text += "\n";
                    count = 0;
                } else if (count == 6) {
                    text += ":";
                } else if (count == 4 || count == 3) {
                    text += "/";
                } else if (count == 2) {
                    text += "',";
                } else if (count == 1) {
                    text += ",'";
                } else {
                    text += ",";
                }
            }
        }
        print(text);
    }

    public static void print(String text) throws FileNotFoundException, IOException {
        PrintWriter print = new PrintWriter("reminders.md");
    
        print.write(text);
        print.flush();
        print.close();
    }

}
