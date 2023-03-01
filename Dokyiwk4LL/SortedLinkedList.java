import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
/**
 * Class creates a linked list from keybord inputs and 
 * prints linked list to console.
 * @author Derrick Dokyi
 * @version 1.0.0.0
 * @since wk 4 of CSC6301
 */
//The version number was changed to the above
public class SortedLinkedList {
    /**
     * Main method of  the class
     * @param args default parameter for main- not used
     * @throws Exception e-when a non integer is entered.
     *         This exception  taken care of here.
     * @since wk 4 of CSC6301
     */
        public static void main(String args[])
        { 
        //Linked list object is created     
        LinkedList<Integer> LL = new LinkedList<>();          
        while (true) {
            //Scanner object is created and repeatedly asks for input
            Scanner sc = new Scanner (System.in);
            System.out.println ("Enter integer :");
            try {
                //adds correct integer input to linked list and sorts it.
                int enteredNumber = sc.nextInt();
                LL.add(enteredNumber);
                Collections.sort(LL); 
                //Adds first integer out of the range to the linked list and ends loop.
                if (enteredNumber<-20 || enteredNumber>20) {
                    break;
                }
            } catch (Exception e) {
                //prompts user to enter integer if non integer is entered.
                System.out.println("You should enter an integer!!!");      
            }
        }
        //prints sorted linked list to console.
        System.out.println(LL);
    }
}
    

