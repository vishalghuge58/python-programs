import java.util.Scanner;

// ****
//  ***
//   **
//    *

public class pattern_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sp = 1;
        int st = n-1;
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= st; j++) {
                System.out.print("*");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}
