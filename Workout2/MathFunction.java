//TODO
// Create a class MathFunction containing the method ‘multiply’ to calculate the multiplication
//of the following arguments.
//
//
//
//two integers
//two floats
//one float and one integer

public class MathFunction {

    public double multiply(int num1,int num2)
    {
        return num1*num2;
    }
    public double multiply(float num1,float num2)
    {
        return num1*num2;
    }
    public double multiply(float num1,int num2)
    {
        return num1*num2;
    }
    public double multiply(int num1,float num2)
    {
        return num1*num2;
    }

    public static void main(String[] args) {
        MathFunction m1 = new MathFunction();
        System.out.println(m1.multiply(2,3));
        System.out.println(m1.multiply(2.5F,3.6F));
        System.out.println(m1.multiply(4.7F,5));
        System.out.println(m1.multiply(8,5.3F));

    }


}
