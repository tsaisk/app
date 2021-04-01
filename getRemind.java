import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class getRemind {
    public static void menu() throws IOException, FileNotFoundException {
        Scanner scan = new Scanner(System.in);
    public getRemind(String remindName, String reminder, int day, int month, int year) throws IOException, FileNotFoundException {
    
        public static void reroll(String fileName, String character) throws IOException, FileNotFoundException {
            File file = new File (fileName + ".md");
            Scanner fileScan = new Scanner(file);
            Scanner text = new Scanner(System.in);
            String findName;
            String type;

            String write = "";
            fileScan.useDelimiter(",|/|\\n");

            PrintWriter game = new PrintWriter(fileName + ".md");
        
            game.write(write);
            game.flush();
            game.close();
            String wait = text.next();
            menu();
        }
    }

}