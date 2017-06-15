
/**
 * Write a description of class Trip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Trip
{
    private ArrayList<Flight> flights; // declaring an ArrayList.Will store flight in chronological
    
    // zero argument constructor
    public Trip()
    {
        flights = new ArrayList<Flight>(); // ArrayList initialized
        
        // adding flight object to the ArrayList
        flights.add( new Flight(new Time(11,30), new Time(12,15)));
        flights.add( new Flight(new Time(13,15), new Time(15,45)));
        flights.add( new Flight(new Time(16,00), new Time(18,45)));
        flights.add( new Flight(new Time(22,15), new Time(23,00)));
    }
    
    /**
     * returns number of minutes from the departure of first flight to the arrival of 
     * the last flight if there are one or more flight in the trip;
     * 0, if there are no flights in the trip.
     */
    public int getDuration()
    {
        if (flights.size()>0) // checks if the Arraylist of flights contain one or more flights
        {
            // 0 represents the first flight. getDepartureTime method is to get the departure time for the flight object
            Time departureTime = flights.get(0).getDepartureTime();
            Time arrivalTime = flights.get(flights.size()-1).getArrivalTime();// flights.length -1 represents last flight in the ArrayList
            int minutes = departureTime.minutesUntil(arrivalTime);// method from time class is used to find difference between departure and arrival time
            return minutes;
        }
        return 0;
    }
    
    /**
     * returns the smallest number of minutes between the arrival of the flight and
     * departure of the flight immediately after it if there are two or more flights in the trip;
     * -1, if there are fewer than two flights in the trip.
     */
    public int getShortestLayover()
    {
         if (flights.size() < 2)// checks if there are fewer than 2 flights in the ArrayList
         {
             return -1;
         }
         else
         {
          //initializing a local variable to store the first difference in time  
          int shortestTime = flights.get(0).getDepartureTime().minutesUntil(flights.get(1).getArrivalTime()); 
          for (int i = 0; i < flights.size()-1; i++) 
           //condition uses size()-1 because inside the loop i gets incremented by 1; 
           //there will be a point where there will be no index to check and will return index out of bound error
            {
               Time arrival = flights.get(i).getArrivalTime();// local variable stores arrival time of flight 
               Time departure = flights.get(i+1).getDepartureTime();// local variable stores departure time of flight immidiately after
               int layover = arrival.minutesUntil(departure);// local variable stores diffeence between arrival and departure of two flights 
               if (layover < shortestTime)// if statement to check for the shortest time diffrence 
               {
                   shortestTime = layover;//updates shortestTime if the if statement is true
               }
           }
           return shortestTime;
        }
    }

    // toString method 
    public String toString()
    {
        String TripInfo = "The flights are: " + "\n" ;
        {
            for ( int i = 0; i < flights.size(); i++ )
           {
               TripInfo += "Flight Number: " + (i+1) +"\n" + flights.get(i).toString() + "\n\n";
          }
          return TripInfo;
        }
    }
}