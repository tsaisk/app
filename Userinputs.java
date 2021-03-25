import java.util.Scanner;

public class Userinputs
{
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int neworreview;
        
        System.out.print("Welcome to Reminder! Please press 1 to Enter a New Event or 2 to View Upcoming Events!");
        neworreview = scan.nextInt();

        if (neworreview != 1 || neworreview != 2)
        {    
            System.out.println("Sorry, that is not a valid response. Please press 1 to Enter a New Event or 2 to View Upcoming Events!");
            neworreview = scan.nextInt();
        }
        else 
            if (neworreview == 1)
            {
                // call kyles code
            }
            else
                if  (neworreview == 2)
                {
                // call kyles code #2 for saved events
            }
    }
}