package m01.s12;

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(number + 2 - number % 2);
    }
}
