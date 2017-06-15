
/**
 * Write a description of class TripDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TripDriver
{
    public static void main(String[]args)
    {
     //creats a time object using multi-argument constructor
      Time t1 = new Time (16,00);
      Time t2 = new Time (15,45);
      
      //calls minutesUntil method 
      int minutes = t2.minutesUntil(t1);
     // System.out.println("Time difference is " + minutes + " minutes" + "\n");
      
      //creats a new Flight object using multi-argument constructor
      Flight fli = new Flight(t2,t1);
      
      //prints Flight object using toString
      System.out.println( fli.toString()+ "\n");
      
      //creats a new Trip object
      Trip trip = new Trip();
      
      //calls getDuartion method on the trip object 
      int d1 = trip.getDuration();
      System.out.println("Time between the departure of first flight and arrival of the last flight: " + d1+ "\n");
      
      //calls getShortestLayover on the trip object
      int Short = trip.getShortestLayover();
      System.out.println("Shortest Layover: " + Short  + " mins"+ "\n");
      
      //prints Trip object using toString method
      System.out.println(trip.toString());
      
    }
    
}
