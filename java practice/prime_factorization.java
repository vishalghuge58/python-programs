import java.util.Scanner;

public class prime_factorization {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       for (int div = 2; div*div <=n ; div++) {      //<--(Optimized solution) (Less Optimized)--> for (int div = 2; div <n ; div++)
           while ((n%div)==0) {
               n=n/div;
              System.out.print( div + " ");
            
            }
        }
        if(n!=1){
        System.out.print( n);
        }
       
    }
}
