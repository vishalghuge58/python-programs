import java.util.Scanner;

public class count  {
    public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
      int var=in.nextInt();
      int a=0;
     while (var>0) {
         var=var/10;

         a+=1;
     }
     System.out.println(a);

    }
    
}
