import javax.swing.*;  
import java.io.*;
public class Interface {
    
    public static void main(String[] args){
        createFrameHome();
    }


    static void createFrameHome(){
        JFrame frame=new JFrame();  
        frame.setSize(1000,1000);

        JButton currentEvents=new JButton("View Current Events");
        currentEvents.setBounds(350,100,300, 100);  
        currentEvents.addActionListener((e)-> {
            frame.dispose();
            createFrameNewEvents();
        });

        JButton newEvents=new JButton("Create New Event");
        newEvents.setBounds(0,100,300, 100);
        newEvents.addActionListener((e)-> {
            frame.dispose();
            createFrameNewEvents();
        });

        JButton edit=new JButton("Edit");
        edit.setBounds(700,100,300, 100);
        edit.addActionListener((e)-> {
            frame.dispose();
            createFrameEdit();
        });

        JLabel welcome;
        welcome = new JLabel("Welcome to App");
        // welcome.setBounds(500,0, 100,300);

        frame.add(newEvents);
        frame.add(currentEvents);
        frame.add(edit);        
        frame.add(welcome);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    static void createFrameNewEvents() throws IOException, FileNotFoundException{
        JFrame frame=new JFrame();  
        JTextField year, month, day, hour, minute;
        JButton add;

        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
        
        year = new JTextField("Year");
        year.setBounds(100,400,150,20); 
        
        month = new JTextField("Month");
        month.setBounds(250,400,150,20); 
        
        day = new JTextField("Day");
        day.setBounds(400,400,150,20); 
        
        hour = new JTextField("Hour");
        hour.setBounds(550,400,150,20); 
        
        minute = new JTextField("Minute");
        minute.setBounds(700,400,150,20); 
        
        add = new JButton();
        add.setBounds(850,400,40,20); 
        add.addActionListener((e)->  {
            NewRemind test = new NewRemind("Test", "This is a test", 1, 1, 22, 12, 24);
        });

        frame.add(year);
        frame.add(month);
        frame.add(day);
        frame.add(hour);
        frame.add(minute);
        frame.add(add);
        
    }

    static void createFrameEdit(){
        JFrame frame=new JFrame();  
        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    static void createFrameCurrentEvents(){
        JFrame frame=new JFrame();  
        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
