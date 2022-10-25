import java.util.*;

public class Fibonacci {

    static int fibRecursive(int limit)

    {
     if( limit==0)
     {
         return 0;
     }
     if(limit==1 || limit==2)
     {
         return 1;
     }

     return fibRecursive(limit-2)+fibRecursive(limit-1);
    }



    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the limit");
        int limit = reader.nextInt();

        for (int i = 0; i < limit; i++) {
            if (fibRecursive(i) <= limit) {
                System.out.println(fibRecursive(i) + " ");
            }
        }
    }
}
