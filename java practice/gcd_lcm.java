import java.util.*;

public class gcd_lcm {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int on1 = n1;
        int on2 = n2;
        int gcd;
        int lcm;
        while ((n1%n2)!=0) {
            int rem=n1%n2;              // lcm*gcd=n1*n2
            n1=n2;
            n2=rem;
        }
        gcd=n2;

       lcm = (on1*on2)/gcd;

       

        System.out.println(gcd);
        System.out.println(lcm);
    }
}