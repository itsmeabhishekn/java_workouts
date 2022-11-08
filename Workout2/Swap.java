//TODO
// Write a program to swap the value of two numbers by call by value and call by reference
//methods

class Variables {
    int a = 40;
    int b = 10;
}
public class Swap {
    static void swap(int a,int b){

        System.out.println("before swapping values a="+a+" b="+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("after swapping values a="+a+" b="+b);


    }
    public static void main(String[] args) {
        System.out.println("Call By value \n **********************");
        int a = 40;
        int b = 60;
        swap(a, b);

        System.out.println("********************** \n Call by Reference");
        Variables o1 = new Variables();

        swap(o1.a, o1.b);
    }

}