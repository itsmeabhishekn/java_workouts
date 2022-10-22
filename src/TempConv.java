import java.util.*;
public class TempConv {
    public static void main(String[] args) {
        float Temp_far;
        float Temp_cel;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit ");
        Temp_far = reader.nextInt();
        Temp_cel = ((Temp_far-32)*5)/9;
        System.out.println(Temp_far+"F Temperature is "+Temp_cel+"C" );
    }
}
