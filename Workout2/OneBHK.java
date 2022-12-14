//TODO
// Create class OneBHK with instance variable roomArea, hallArea and price
//a. Create a default and parameterized constructor;
//b. Method show(): to print OneBHK data member information;
//Create another class TwoBHK which has all the properties and behaviour of OneBHK and a
//new instance variable room2Area.
//a. Create a default and parameterized constructors;
//b. Method show(): to print all data member information;
//Write the main function in another class (Say DriverClass), store three TwoBHK flat’s
//information and print information using the show method. Also, print the total amount of all
//flat

public class OneBHK {
    double roomArea;
    double hallArea;
    double price;

    public OneBHK()
    {
        System.out.println("This is the default constructor for OneBHK");
    }

    //parameterized constructor
    public OneBHK(double rmA , double hlA , double prc)
    {
        roomArea = rmA;
        hallArea = hlA;
        price = prc;
    }

    public void showOneBHK()
    {
        System.out.println("Room area : "+this.roomArea);
        System.out.println("Hall area : "+this.hallArea);
        System.out.println("Price     : "+this.price);
    }
}

class TwoBHK extends OneBHK
{
    double room2Area ;

    public TwoBHK(){
        System.out.println("This is the default constructor for TwoBHK");
    }

    //parameterized constructor
    TwoBHK(double r2A,double rmA,double hlA,int price)
    {
        super(rmA,hlA,price);

        room2Area =r2A;
    }
    public void showTwoBHK()
    {
        System.out.println("Room area   : "+this.roomArea);
        System.out.println("Hall area   : "+this.hallArea);
        System.out.println("Price       : "+this.price);
        System.out.println("Room 2 Area : " +this.room2Area);
    }
}

class Driver1 {
    public static void main(String[] args) {
        System.out.println("-------------------------------");

        TwoBHK t1= new TwoBHK(1000,1200,1110,110);
        t1.showTwoBHK();

        System.out.println("-------------------------------");

        TwoBHK t2= new TwoBHK(1400,1900,2110,130);
        t2.showTwoBHK();

        System.out.println("-------------------------------");

        TwoBHK t3= new TwoBHK(2000,2200,1010,210);
        t3.showTwoBHK();

        System.out.println("-------------------------------");

        double totalPrice = ((t1.hallArea+t1.roomArea+t1.room2Area)* t1.price) +
                ((t2.hallArea+t2.roomArea+t2.room2Area)* t2.price)+
                ((t3.hallArea+t3.roomArea+t3.room2Area)* t3.price);

        System.out.println("Total Price : "+totalPrice);
    }
}