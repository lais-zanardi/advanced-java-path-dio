package exceeding.v;

import java.util.Scanner;

public class ExceedingV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int v = 0;
        int count = 1;
        do {
            v = sc.nextInt();

        } while (v<=r);



        while(r + r + count <= v) {
            count++;
        }

        System.out.println(count+1);
    }
}
