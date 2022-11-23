package task4;

import java.util.Scanner;

/*
You are given an integer N, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts N into a string S
the code will print "Good job". Otherwise it will print "Wrong answer".

N can range between -100 to 100 inclusive.
 */
public class Main {


    public static void convertNtoS(int n){

        String s=n+"";  //only this string of code is a solution on hackerrank task

       // if ((S instanceof String)) {
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        convertNtoS(n);
    }
}
