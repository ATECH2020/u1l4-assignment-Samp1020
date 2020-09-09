import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hHand = scanner.nextInt();

        /*
         *  your code goes here
         */

        int hours = hHand / 30;
        int dPast = hours * 30;
        int mPast = hHand - dPast;//gets left over min
        
        int mHandDg = (30 - mPast) * 6;

        System.out.print(mHandDg);
        // closing the scanner object
        scanner.close();
    }
}