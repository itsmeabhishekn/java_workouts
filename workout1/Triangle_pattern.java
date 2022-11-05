import java.util.*;

public class Triangle_pattern {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the limit ");
        int limit = reader.nextInt();
        for( int i=1;i<=limit;i++){
            for(int j=1;j<=i;j++) {
                System.out.print((i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
