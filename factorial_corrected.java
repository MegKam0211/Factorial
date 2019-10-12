 import java.util.Scanner;

public class factorial_corrected
{
    public static void main(String[] args)
    {
    
      Scanner num = new Scanner(System.in); //Scanner object takes the users input
      int loop = 1; //ensuring that the loop is triggered
      int total = 0;
      int count = 0;
     
    

      while (loop != 0) { //while loop is = 1 and more, it     will keep running 
        System.out.println("Input your number to calculate the average: "); //user to input a number
        int inputNum = num.nextInt(); //return the int scanned from input

        if (inputNum == 0){ // loop breaks if the users input is 0
          break;
        }
        total += inputNum; // add all input numbers together
        count++; // count the number of times that the loop was triggered
      }

      System.out.println("The average is: " + total/count);{
        // print average number 
      }


    }
}