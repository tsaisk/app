import java.io.*;
import java.util.Scanner;
public class NewRemind {
    Scanner scan = new Scanner(System.in);
    String fileName = "", event = "";
    int day, month, year, hour, minute;


public NewRemind(String remindName, String reminder, int day, int month, int year) throws IOException, FileNotFoundException {
    makeEvent(remindName, "'" + reminder + "'", day, month, year);
}
    public NewRemind(String remindName, String reminder, int day, int month, int year, int hour, int minute) throws IOException, FileNotFoundException {
        makeEvent(remindName, "'" + reminder + "'", day, month, year, hour, minute);
    }

public void makeEvent(String fileName, String reminder, int day, int month, int year) throws IOException, FileNotFoundException {
    File file = new File (fileName + ".md");

    String write = reminder + " " + day + "/" + month + "/" + year;

    PrintWriter game = new PrintWriter(fileName + ".md");

    game.write(write);
    game.flush();
    game.close();
    }

    public void makeEvent(String fileName, String reminder, int day, int month, int year, int hour, int minute) throws IOException, FileNotFoundException {
        File file = new File (fileName + ".md");
    
        String write = reminder + " " + day + "/" + month + "/" + year + " " + hour + ":" + minute;
    
        PrintWriter game = new PrintWriter(fileName + ".md");
    
        game.write(write);
        game.flush();
        game.close();
        }
}