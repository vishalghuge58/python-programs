import java.util.Scanner;

public class reverse  {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int var=in.nextInt();
        while(var>0){
            
            int c=var%10;
            var=var/10;
            System.out.println(c);

        }
    }
    
}
