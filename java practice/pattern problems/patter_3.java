import java.util.Scanner;

//    *
//   **
//  ***
// **** 

public class patter_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {                               
            for (int j = 1; j <= n; j++) { 
                if (j >= (n - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// Scanner in = new Scanner(System.in);
// int n = in.nextInt();
// int sp=n-1;
// int st=1;                              --> sp=space, st= star
// for(int i=1;i<=n;i++){     
//                                 --> conceptual approch
//                                                                // conceptual approch--> System.out.print(sp + "," + st);
//     for(int j=0;j<=sp;j++){
//         System.out.print(" ");
//     }
//     for (int j = 0; j <= st; j++) {
//         System.out.print("*");
//     }
//     sp--;
//     st++;
//     System.out.println();
// }

