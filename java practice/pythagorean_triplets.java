import java.util.Scanner;

public class pythagorean_triplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int max = n1;
        if (n2 >= max) {
            max = n2;

        }
        if (n3 >= max) {
            max = n3;
        }

        if (max == n1) {
            boolean flag = (n1 * n1) == (n2 * n2) + (n3 * n3);
            System.out.print(flag);
        } else if (max == n2) {
            boolean flag = (n2 * n2) == (n1 * n1) + (n3 * n3);
            System.out.print(flag);
        } else {
            boolean flag = (n3 * n3) == (n2 * n2) + (n1 * n1);
            System.out.print(flag);
        }

    }
}
