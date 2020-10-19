/*Given an array K with N integers from 1 to N+1 such that the array has exactly one integer missing, write a Java function that returns the missing integer.
        e.g. given K = [3,5,4,1], the function should return 2*/

/**
 *
 * @author liz
 */

import java.util.Scanner;
public class ProblemOne {
//FUNCTION TO FIND THE MISSING NUMBER IN AN INTEGER SEQUENCE
    static int MissingInteger(int K[], int n)
    {
        int Missing = 1;//VARIABLE "Missing" TO STORE THE MISSING INTEGER
        for (int i = 2; i <= (n + 1); i++) //INITIATE COUNTER i=2
        {
            Missing += i;
            Missing -= K[i - 2];//Missing = Missing – array[i] + counter
        }
        return Missing;    //PRINT THE MISSING INTEGER AS Missing

    }
    //TEST FUNCTION
    public static void main(String args[]) {
        {
            //TEST ARRAY WITH NO USER INPUT
            int[] k = { 3, 5, 4, 1 };
            System.out.println("EXAMPLE");
            System.out.println("From the test array: {3,5,4,1}, The missing integer is: ");
            System.out.println(MissingInteger(k, k.length));
            System.out.println("INTEGER SEQUENCE ENTRY:");
            //TEST ARRAY ENABLING USER TO ENTER ARRAY DATA
            Scanner input = new Scanner(System.in);
            //ALLOWING USER TO ENTER THE ARRAY DATA
            System.out.println("How many numbers are in your sequence/array");//LENGTH OF THE ARRAY
            int numbers = input.nextInt();
            int K[] = new int[numbers];
            System.out.println("Kindly enter the " + numbers + " numbers now.");//USER ENTERS
            for (int i = 0 ; i < K.length; i++ ) {
                K[i] = input.nextInt();
            }
            System.out.println("THIS IS THE MISSING INTEGER FROM YOUR ARRAY:");
            System.out.println(MissingInteger(K, K.length));
            System.out.println("TEST COMPLETE. THANK YOU!!!");
            input.close();
        }
    }
}
