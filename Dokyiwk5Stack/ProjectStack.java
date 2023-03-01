import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;
/**
 * Class creates a stack from keybord inputs and 
 * prints stack to console.
 * @author Derrick Dokyi
 * @version 2.0.0.0
 * @since wk 5 of CSC6301
 */
//Version number changed.
public class ProjectStack {
    /**
     * Main method of  the class
     * @param args default parameter for main- not used
     * @throws Exception e-when a non integer is entered.
     *         This exception  taken care of here.
     * @since wk 5 of CSC6301
     */
    public static void main(String args[])
    { 
        //Stack object is created     
        Stack<Integer> realStack = new Stack<>();          
        while (true) {
            //Scanner object is created and repeatedly asks for input
            Scanner sc = new Scanner (System.in);
            System.out.println ("Enter integer :");
            try {
                //adds correct integer input to stack and sorts it.
                int enteredNumber = sc.nextInt();
                realStack.push(enteredNumber);
                Collections.sort(realStack); 
                //Adds first integer out of the range to the stack and ends loop.
                if (enteredNumber<-20 || enteredNumber>20) {
                    break;
                }
            } catch (Exception e) {
            //prompts user to enter integer if non integer is entered.
            System.out.println("You should enter an integer!!!");      
            }
        }
        //Removes element from the top/last position
        realStack.pop();
        //prints stack the to console.
        System.out.println(realStack);
    } 
    
}
