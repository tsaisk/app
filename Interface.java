import javax.swing.*;  
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

    static void createFrameNewEvents(){
        JFrame frame=new JFrame();  
        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
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
