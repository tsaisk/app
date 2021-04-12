import java.io.*;
import java.util.Scanner;
public class NewRemind {
    String fileName = "", event = "";
    int day, month, year, hour, minute;


public NewRemind(String remindName, String reminder, int day, int month, int year) throws IOException, FileNotFoundException {
    makeEvent(remindName, "'" + reminder + "'", day, month, year);
}
    public NewRemind(String remindName, String reminder, int day, int month, int year, int hour, int minute) throws IOException, FileNotFoundException {
        makeEvent(remindName, "'" + reminder + "'", day, month, year, hour, minute);
    }

public void makeEvent(String eventName, String reminder, int day, int month, int year) throws IOException, FileNotFoundException {
    File file = new File ("reminders.md");

    String write = findEnd(file) + eventName + "," + reminder + "," + day + "/" + month + "/" + year;

    PrintWriter game = new PrintWriter("reminders.md");

    game.write(write);
    game.flush();
    game.close();
    }

    public void makeEvent(String eventName, String reminder, int day, int month, int year, int hour, int minute) throws IOException, FileNotFoundException {
        File file = new File ("reminders.md");
    
        String write = findEnd(file) + eventName + "," + reminder + "," + day + "/" + month + "/" + year + "," + hour + ":" + minute;
    
        PrintWriter game = new PrintWriter("reminders.md");
    
        game.write(write);
        game.flush();
        game.close();
        }

    public String findEnd(File fileName) throws IOException, FileNotFoundException {
        Scanner scan = new Scanner(fileName);
        String text = "";
        scan.useDelimiter("\\n");
        while (scan.hasNext()) {
            text = text + scan.next() + "\n";
        }
        return text;
    }
}