package difference.between.digits;

import java.util.*;

public class DifferenceBetweenDigits {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int sum = sumDigits(n);
            int mult = multiplyDigits(n);

            System.out.println(difference(mult, sum));



        }
        public static int difference(int n1, int n2) {
            return n1-n2;
        }
        public static int multiplyDigits(int n) {
            int multiply = 1;
            do {
                multiply *= (n % 10);
                n = (n - n % 10) / 10;
            } while (n!=0);
            return multiply;
        }

        public static int sumDigits(int n) {
            int sum = 0;
            do {
                sum += (n % 10);
                n = (n - n%10)/10;
            } while (n!=0);
            return sum;
        }
}

