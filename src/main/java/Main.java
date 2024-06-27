import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */

public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        int sum = sumOfNumbers(number);
        System.out.println(sum);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
      //  int input = getInputNumber();
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    
    static int getInputNumber() { // gee, maybe this is useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        // This method reads the number provided using keyboard
        int num = scan.nextInt();
//        if (num <= 0) {
//            System.out.println("This isn't a positive number, try again.");
//        } else {
//            return num;
//        }

        // Closing Scanner after the use
        scan.close();
        return num;

    }
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
