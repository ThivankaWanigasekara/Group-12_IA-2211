//CarParking.java_Code-

import java.util.Scanner;

public class CarParking {
    public static void main(String argu[])
    {
        Scanner sc=new Scanner(System.in);
        Parking pa=new Parking();
        int choice;
        int car=0,bike=0,van=0;
        while (true)
        {
            System.out.println("Press 1 to enter car"); // add a car
            System.out.println("Press 2 to enter bike"); // add a bike
            System.out.println("Press 3 to enter van"); // add a van
            System.out.println("Press 4 to view data"); // view data
            System.out.println("Press 5 to delete data"); // delete data
            System.out.println("Press 6 to exit"); // exit
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    car++;
                    pa.setCar(car);
                    System.out.println(car+" cars is added");
                    break;
                case 2:
                    bike++;
                    pa.setBike(bike);
                    System.out.println(bike+" bikes is added");
                    break;
                case 3:
                    van++;
                    pa.setVan(van);
                    System.out.println(van+" vans is added");
                    break;
                case 4:
                    System.out.println("Cars: "+pa.getCar());
                    System.out.println("Bikes: "+pa.getBike());
                    System.out.println("Vans: "+pa.getVan());
                    break;
                case 5:
                    pa.delete();
                    System.out.println("All record is deleted");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;

            }

        }
    }
}
 
// car manegment system
 

 
