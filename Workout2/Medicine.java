//TODO
// Create a class Medicine to represent a drug manufactured by a pharmaceutical company.
//Provide a function displayLabel() in this class to print the Name and address of the company.
//Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the
//displayLabel() function in each of these classes to print additional information suitable to the
//type of medicine. For example, in the case of tablets, it could be “store in a cool dry place”, in
//the case of ointments it could be “for external use only” etc.
//Create a class TestMedicine and include the main function to do the following:
//Create three Medicine objects of the type as decided by a randomly generated integer in the
//range 1 to 3.
//Refer to Java API Documentation to find out the random generation feature.
//Check the polymorphic behavior of the displayLabel() method.

import java.util.Scanner;
import java.util.Random;

public class Medicine {
    String name;
    String address;
    Scanner reader = new Scanner(System.in);
    public Medicine(){
        System.out.println("Enter company Name : ");
        this.name = reader.next();

        System.out.println("Enter company address : ");
        this.address = reader.next();
    }

    void displayLabel()
    {

        //TODO this function body is not getting displayed when the overriden methode is called - need to check why
        System.out.println("Company Name :"+name);
        System.out.println("Company Address :"+address);
    }


}

class  Tablet extends Medicine{
    @Override
    void displayLabel()
    {
        System.out.println("Store in a cool dry place ");
    }

}

class Syrup extends Medicine
{
    @Override
    void displayLabel()
    {
        System.out.println("Only take 1 table spoon");
    }

}

class Ointment extends Medicine
{

    @Override
    void displayLabel()
    {
        System.out.println("For external use only ");
    }
}

class TestMedicine {
    public static void main(String[] args) {

        Random r1 = new Random();
        int randomNum = r1.nextInt(1,4);

        System.out.println(randomNum);



        switch (randomNum)
        {
            case 1:
                Tablet Tab1= new Tablet();
                Tablet Tab2 = new Tablet();
                Tablet Tab3 = new Tablet();
                Tab3.displayLabel();
                break;
            case 2:
                Syrup Syr1= new Syrup();
                Syrup Syr2= new Syrup();
                Syrup Syr3= new Syrup();
                Syr3.displayLabel();
                break;
            case 3:
                Ointment Oin1 = new Ointment();
                Ointment Oin2 = new Ointment();
                Ointment Oin3 = new Ointment();
                Oin3.displayLabel();
                break;
        }
    }
}

