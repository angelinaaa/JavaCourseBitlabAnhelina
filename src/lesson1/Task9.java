package lesson1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c=in.nextInt();
        int task9=(a*2)+(b-3)+(c*c);
        System.out.println(task9);
    }
}
