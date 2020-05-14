/*
Lina Breunlin
9 / 17 / 2019
CIS 163 AA 20460
This program calculates different statisitics following the input of two whole
number



Inputs      Outputs(sum,avg, distance, max, min, respectively)       Passed
10, 5                       15, 7.50, 5, 10, 5                          Y
-3, -5                      -8, -4, 2, -3, -5                           Y
-10, 20                     10,  5, 30, 20, -10                         Y
100, 250                   350, 175, 150, 250, 100                      Y
1000, -100                900, 450, 1100, 1000, -100                    Y
-2565, -1234          -3799, -1899.5, 3799, -1234, -2565                Y

 */
package stats_calculator;
import java.util.Scanner;


public class Stats_calculator {

    
    
    public static void main(String[] args) {
      
        //declare variables
    
    int firstNum;
    int secondNum;
    int sum = 0;
    double average = 0;
    
    
    Scanner in = new Scanner(System.in);
    
    //prompt for first input
    
    System.out.print("Enter your first number: ");
    
    //get first input
    
    firstNum = in.nextInt();
    
    //prompt for second input
    
    System.out.print ("Enter your second number: ");
    
    //get second input
    
    secondNum = in.nextInt();
    
    //calculate sum
    
    sum = firstNum + secondNum;
    
    //display sum
    
    System.out.printf("The sum is: %d ", sum);
    System.out.println();
    
    //calculate average
    
    average = (sum) /2.0;
    
    //display average
    
     System.out.printf("The average is: %.2f ", average);
     System.out.println();
     
     //calculate distance and display
     
      System.out.print("The distance is: ");
      System.out.println(Math.abs(firstNum - secondNum));
     
      // calculate and display max
      
      System.out.print("The max is: ");
      System.out.println(Math.max(firstNum, secondNum));
      
      //calculate and display the min
      
      System.out.print("The min is: ");
      System.out.println(Math.min(firstNum, secondNum));
      
      //final output
      
      System.out.println("Thank you for using the Stats Calculator.");
    }
   
    
}


