/*Given a string S of length N, write a Java function that transforms the string by reversing characters in  groups of four, and returns the transformed string.
        e.g. when S = 'Lorem at' the output should be 'eroLta m'
        when S = ' Tempor ip' the output should be 'meT roppi'*/

/**
 *
 * @author liz
 */
import java.util.Scanner;
public class ProblemTwo {
    public static void main(String args[])
    {
        //PROMPTING THE USER TO ENTER THE STRING
        Scanner sc= new Scanner(System.in);
        System.out.print("PLEASE ENTER THE STRING YOU WANT TO REVERSE: ");
        String string= sc.nextLine();
        System.out.print("THIS IS THE STRING THAT YOU HAVE ENTERED: "+string);
        //CONVERTING STRING TO ARRAY
        // CREATING AN ARRAY OF STRING LENGTH
        char[] array = new char[string.length()];
        // COPY CHARACTER BY CHARACTER INTO ARRAY
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);
        }
        //REVERSING ARRAY IN GROUPS OF FOUR
        int size = 4;
        int n = array.length;
        for (int i = 0; i < n; i += size) {
            int left = i;
            int right = Math.min(i + size - 1, n - 1);
            char temp;
            while (left < right) {
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left += 1;
                right -= 1;
            }
        }
        System.out.print("\nTHE REVERSED STRING IS: ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }
    }
