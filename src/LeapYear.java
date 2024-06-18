import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year;

        System.out.print("Give a year: ");
        year = scan.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println("The year is a leap year.");
                } else {
                    System.out.println("The year is not a leap year.");
                }
            } else {
                System.out.println("The year is a leap year.");
            }
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}