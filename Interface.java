import javax.swing.*;  
public class Interface {
    
    public static void main(String[] args){
        JFrame frame=new JFrame();  
        frame.setSize(1000,1000);
        JButton a=new JButton("View Current Events");//creating instance of JButton  
        a.setBounds(300,0,300, 100);  
        JButton b=new JButton("Create New Event");//creating instance of JButton  
        b.setBounds(0,0,300, 100);  
        frame.add(a);
        frame.add(b);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
