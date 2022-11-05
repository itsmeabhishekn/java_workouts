
import java.util.Scanner;

public class Faculty {
    public String facultyId;
    public double salary;

}

class fullTimeFaculty extends Faculty{
    double basic;
    double allowance;

    Scanner reader = new Scanner(System.in);

    void getInputFullTime()
    {
        System.out.println("Enter the faculty ID");
        facultyId = reader.next();

        System.out.println("Enter basic pay for full time faculty ");
        basic = reader.nextDouble();

        System.out.println("Enter allowance for the employee ");
        allowance = reader.nextDouble();
    }

    double calcSalaryFullTime(double basic,double allowance)
    {
        return basic+allowance;
    }

    void displayFullTIme()
    {
        System.out.println("Faculty ID : "+this.facultyId);
        System.out.println("Basic Pay  : "+this.basic);
        System.out.println("Allowance  : "+this.allowance);
        System.out.println("Salary     : "+calcSalaryFullTime(this.basic,this.allowance));
    }

}

class partTimeFaculty extends Faculty{
    int hour;
    double rate;
    Scanner reader = new Scanner(System.in);

    void getInputPartTime()
    {
        System.out.println("Enter the faculty ID");
        facultyId = reader.next();

        System.out.println("Enter number of hours worked by faculty. ");
        hour = reader.nextInt();

        System.out.println("Enter rate per hour for the employee. ");
        rate = reader.nextDouble();
    }
    double calcSalaryPartTime(int hour,double rate)
    {
        return hour*rate;
    }
    void displayPartTime()
    {
        System.out.println("Faculty ID : "+this.facultyId);
        System.out.println("Work hours : "+this.hour);
        System.out.println("Hour rate  : "+this.rate);
        System.out.println("Salary     : "+calcSalaryPartTime(this.hour,this.rate));

    }
}

class Driver
{
    public static void main(String[] args) {

        //storing 2 full time faculty information
        fullTimeFaculty f1 = new fullTimeFaculty();
        System.out.println("---------------");
        f1.getInputFullTime();
        System.out.println("---------------");

        fullTimeFaculty f2 = new fullTimeFaculty();
        f2.getInputFullTime();
        System.out.println("---------------");


        System.out.println("*************");
        f1.displayFullTIme();
        System.out.println("*************");
        f2.displayFullTIme();
        System.out.println("*************");

        //storing 2 part-time faculty information
        partTimeFaculty p1 = new partTimeFaculty();
        System.out.println("---------------");
        p1.getInputPartTime();
        System.out.println("---------------");

        partTimeFaculty p2= new partTimeFaculty();
        System.out.println("---------------");
        p2.getInputPartTime();
        System.out.println("---------------");

        System.out.println("*************");
        p1.displayPartTime();
        System.out.println("*************");
        p2.displayPartTime();

    }
}