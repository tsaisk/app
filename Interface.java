import javax.swing.*;

import jdk.jfr.Description;

import java.io.*;
public class Interface {
    
    public static void main(String[] args) throws IOException, FileNotFoundException{
        createFrameHome();
    }


    static void createFrameHome() throws IOException, FileNotFoundException{
        JFrame frame=new JFrame();  
        frame.setSize(1000,1000);

        JButton currentEvents=new JButton("View Current Events");
        currentEvents.setBounds(350,100,300, 100);  
        currentEvents.addActionListener((e)-> {
            frame.dispose();
            createFrameCurrentEvents();
        });

        JButton newEvents=new JButton("Create New Event");
        newEvents.setBounds(0,100,300, 100);
        newEvents.addActionListener((e)-> {
            frame.dispose();
            try {
                createFrameNewEvents();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
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
        JTextField year, month, day, hour, minute, name, description;
        JButton add;

        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
        
        name = new JTextField("Name of Event");
        name.setBounds(250,550,150,20);

        description = new JTextField("Description");
        description.setBounds(550,550,150,20); 

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
        
        add = new JButton("Push");
        add.setBounds(850,400,100,20); 
        add.addActionListener((e)->  {
            try {
                pushDate(year.getText(), month.getText(), day.getText(), hour.getText(), minute.getText(), name.getText(), description.getText());
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        frame.add(year);
        frame.add(month);
        frame.add(day);
        frame.add(hour);
        frame.add(minute);
        frame.add(add);
        frame.add(name);
        frame.add(description);

        
    }

    private static void pushDate(String year, String month, String day, String hour, String minute, String name, String description) throws IOException, FileNotFoundException{
        NewRemind test = new NewRemind(name, description, Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year), Integer.parseInt(hour), Integer.parseInt(minute));
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
