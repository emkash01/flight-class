
/**
 * Write a description of class Flight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flight
{
   // instance variabe declaration
   private Time departure;
   private Time arrival;
   
   // multi-argument constructor
   public Flight (Time Choosendeparture,Time Choosenarrival)
   {
      departure = Choosendeparture;
      arrival = Choosenarrival;
   }
   
   //getter to return time at which the flight departs
   public Time getDepartureTime ()
   {
       return departure;
   }
   
   //getter to return time at which flight arrives
   public Time getArrivalTime()
   {
       return arrival;
   }
   
   //to String to represent the flight object in string type
   public String toString()
   {
       //this. will help get the time and calling timeToString method from time class will print them in 12 hour clock 
       String FlightInfo ="Departure Time: " + this.getDepartureTime().timeToString()+ "   " + "Arrival Time: " + this.getArrivalTime().timeToString();
       return FlightInfo;
   }
}