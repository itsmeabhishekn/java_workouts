//TODO
// Create an application program to track and display the number of instances of the class
//created, destroyed and live during the program execution

public class InstanceUpdater {
    static int InstanceCreated=0;
    static int InstanceDeleted=0;

    InstanceUpdater()
    {
        InstanceCreated = InstanceCreated + 1;
    }

    public void finalize()throws Throwable
    {
        InstanceDeleted=InstanceDeleted+1;
    }

    public static void main(String[] args) {
        InstanceUpdater u1 = new InstanceUpdater();
        InstanceUpdater u2 = new InstanceUpdater();
        InstanceUpdater u3 = new InstanceUpdater();
        InstanceUpdater u4 = new InstanceUpdater();
        InstanceUpdater u5 = new InstanceUpdater();
        InstanceUpdater u6 = new InstanceUpdater();

        u2=u3=null;

        Runtime.getRuntime().gc();;

        System.out.println("Number of objects created "+InstanceCreated);
        System.out.println("Number of objects deleted "+ InstanceDeleted);
        System.out.println("Number of objects alive : "+(InstanceCreated-InstanceDeleted));
    }
}

