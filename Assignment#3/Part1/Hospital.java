//********************************************************************
//  Hospital.java       Authors: Lewis/Loftus
//
//  Solution to Programming Project 9.2 
//********************************************************************

public class Hospital
{
   //-----------------------------------------------------------------
   //  Creates several objects from classes derived from
   //  HospitalEmployee.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      HospitalEmployee vito = new HospitalEmployee ("Vito", 123);
      Doctor michael = new Doctor ("Michael", 234, "Heart");
      Surgeon vincent = new Surgeon ("Vincent", 645, "Brain", true);
      Nurse sonny = new Nurse ("Sonny", 789, 6);
      

      // print the employees
      // print the employees in the desired format
      System.out.println(vito.getName() + " " + vito.getNumber());
      System.out.println(michael.getName() + " " + michael.getNumber() + " " + michael.getSpecialty());
      System.out.print(vincent.getName() + " " + vincent.getNumber() + " " + vincent.getSpecialty() + " ");
      if (vincent.isOperating()) {
         System.out.println("Operating: true");
      } else {
         System.out.println("Operating: false");
      }
      System.out.println(sonny.getName() + " " + sonny.getNumber() + " has " + sonny.getNumOfPatients() + " patients.");


      // invoke the specific methods of the objects
      vito.work();
      michael.work();
      vincent.work();
      sonny.work();
     
   }
}
