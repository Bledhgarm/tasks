package m01.s12;

import java.util.Scanner;

public class Task3 {
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
    }
}
