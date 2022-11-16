package task1;
import java.util.Scanner;
/*
1 If n is odd, print Weird
2 If n is even and in the inclusive range of 2 to 5, print Not Weird
3 If n is even and in the inclusive range of 6 to 20, print Weird
4 If n is even and greater than 20, print Not Weird
 */
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if (N%2!=0) {System.out.println("Weird");} //1
            if ((N%2==0)&&((N>=2)&&(N<=5)||(N>20))) {System.out.println("Not Weird");} //2, 4
            if ((N%2==0)&&((N>=6)&&(N<=20))) {System.out.println("Weird");} //3
            scanner.close();
        }
    }