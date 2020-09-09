import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();

        int classB = scanner.nextInt();
        
        int classC = scanner.nextInt();

        int inClassA = classA / 2 + classA % 2;
        int inClassB = classB / 2 + classB % 2;
        int inClassC = classC / 2 + classC % 2;

        int totalStuDesks =  inClassA + inClassB + inClassC ;

        System.out.print(totalStuDesks); 
        // closing the scanner object
        scanner.close();
    }
}