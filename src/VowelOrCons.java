import java.util.Scanner;

public class VowelOrCons
{
    public static void main(String[] args) {
        boolean bool = false;
        System.out.println("Enter The character :");
        Scanner reader = new Scanner(System.in);
        char ch = reader.next().charAt(0);
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'o':
            case 'i':
            case 'u':
                bool = true;

        }
        if (bool)
        {
            System.out.println("Entered character is a vowel ");
        }
        else
        {
            System.out.println("Entered character is a consonant ");
        }
    }
}