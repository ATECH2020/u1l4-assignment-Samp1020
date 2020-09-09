import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int mins1 = scanner.nextInt();
        int secs1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int mins2 = scanner.nextInt();
        int secs2 = scanner.nextInt();
        int secInHour1, secInHour2;
        int secInMins1, secInMins2;
        int secInSecs1, secInSecs2;

        /*
         *  your code goes here
         */
        secInHour1 = hours1 * 3600;
        secInHour2 = hours2 * 3600;
        secInMins1 = mins1 * 60;
        secInMins2 = mins2 * 60;
        secInSecs1 = secs1 * 1;
        secInSecs2 = secs2 * 1;

        int deltaHour = secInHour2 - secInHour1;
        int deltaMin = secInMins2 - secInMins1;
        int deltaSec = secInSecs2 - secInSecs1;

        int totalSec = deltaHour + deltaMin + deltaSec;

        System.out.print(totalSec);

        // closing the scanner object
        scanner.close();
    }
}