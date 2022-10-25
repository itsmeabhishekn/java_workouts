import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the string you want to check if it's palindrome");
        String word = reader.nextLine();

        char[] charStrings = word.toCharArray();
        int len = charStrings.length;
        //System.out.println(len);
        String reverse = "";


        for(int i= len-1;i>=0;i--)
        {
            //reverse.append(charStrings[i]);
            //System.out.println(charStrings[i]);
            reverse = reverse + charStrings[i];
        }

        System.out.println("input string "+word);
        System.out.println("reverse string "+reverse);

        if(word.equals(reverse)){
            System.out.println("The word "+word+" is palindrome");
        }
        else{
            System.out.println("The word "+word+" is not palindrome ");
        }

    }
}
