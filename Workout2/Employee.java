//TODO
// Create a class Employee with fields Name, Emp ID, result and three assessment values (ass1,
//ass2 and ass3 (0-100)). If all the assessment values of the employee are above 75, then the
//result variable should be updated as "Promoted" else "Demoted". Also, calculate and display
//the total and percentage of the employee using functions.

public class Employee {

    String Name;
    String EmpId;

    float Assessment1;
    float Assessment2;
    float Assessment3;
    float totalMark;
    float totalPercentage;
    String Result="";

    public Employee(String name,String empid,float as1,float as2,float as3)
    {
        this.Name=name;
        this.EmpId=empid;
        this.Assessment1 = as1;
        this.Assessment2 = as2;
        this.Assessment3 = as3;

    }

    public void calcResult(){
        totalMark = this.Assessment1+this.Assessment2+this.Assessment3;
        totalPercentage = totalMark/300;


        if(this.Assessment1>75 && this.Assessment2>75&&this.Assessment3>75)
        {
            Result ="Promoted";

        }
        else
        {
            Result = "Demoted ";
        }

    }

    public void displayResult()
    {

        System.out.println("Total Mark : "+totalMark);
        System.out.println("Total Percentage : "+totalPercentage);
        System.out.println("Result is "+Result);

    }

    public static void main(String[] args) {
        //Employee e2 = new Employee();

        Employee e1 = new Employee("abhishek","1",80,81,85);

        e1.calcResult();
        e1.displayResult();
    }
}
