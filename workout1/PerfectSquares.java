import java.util.Scanner;

public class PerfectSquares {

    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        int fn,en,i;
        System.out.println("Enter First Number: ");
        fn=reader.nextInt();
        System.out.println("Enter Last Number:");
        en=reader.nextInt();
        System.out.println("Perfect square numbers between "+fn+" and "+en+"are:");
        for (i=fn;i<=en;i++)
        {
            double sqr=Math.sqrt(i);
            if(sqr-Math.floor(sqr)==0)
                System.out.println(i+" ");
        }
    }
}
