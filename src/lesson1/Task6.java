package lesson1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int sum=a+b+c;
        int subtraction=a-b-c;
        int multiple=a*b*c;
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiple);
    }
}
