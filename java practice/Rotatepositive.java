import java.util.Scanner;

public class Rotatepositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int times = in.nextInt();

        int j = n;
        int rn = 0;
        int b = 0;
        while (j != 0) {
            j = j / 10;
            b++;

        }
        times = times % b;               //special case if times is - or +
        if (times < 0) {                
            times = times + b;
        }

        int div = 1;
        int mul = 1;
        for (int i = 1; i <= b; i++) {

            if (i <= times) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }
        int c = n / div;
        int q = n % div;

        rn = q * mul + c;

        System.out.print(rn);

    }
}
