package m01.s12;

import java.util.Scanner;

public class Task3 {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number >= 0 && number < 10) {
            System.out.println("DIGIT");
        }
        else if (number > 9 && number <= 99) {
            System.out.println("NUM");
        }
        else System.out.println("OTHER");
=======
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a + 2 - a % 2);
>>>>>>> 7f13c519185c45ac4f8b4f2b0776d866c001231d
    }
}
