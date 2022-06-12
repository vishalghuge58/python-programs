import java.util.*;


public class fibonachi {

     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the finnachi no.s ");
    int var=input.nextInt();
    System.out.println("print first "+var +" fibnnachi no.s ");

    int a=0;
    int b=1;
    int c;
    for (int i = 0; i < var; i++) {
        System.out.print(a+" ");
        c =a+b;
        a=b;
        b=c;

        
    }


    }
}