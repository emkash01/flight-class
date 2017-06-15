
/**
 * Write a description of class Time here.
 * 
 * @author Vaishnavi 
 * @version 20
 */
public class Time
{
   //instance variable declaration
   private int hours; 
   private int mins;  
   
   // A multi-argument constructor.
   public Time( int chosenHours, int chosenMins )
   {
     hours = chosenHours;
     mins = chosenMins;
   }
   
   /**
    * getter to get instance variable hours when called on a time object
    * will be used in a method to get instance variable.
    */
   public int getHours()
   {
       return hours;
   }
    
   /**
    *  getter to get instance variable mins when called on a time object.
    *  will be used in a method to get instance variable.
    */
   
    public int getMins()
    {
        return mins;
    }
   
   /**
    * returns difference between current time object and another time object which is declared in the parameters.
    * uses getHours and getMins method  to get instance variable and then find the difference between two objects.
    */
   public int minutesUntil (Time other)
   {
       int currentTime = this.getHours()*60 +this.getMins();
       int otherTime = other.getHours()*60 +other.getMins();
       int Mins = otherTime - currentTime;
       return Mins;
   }

     // converts Time object in which time is represented with 24 hour clock into string which is in 12 hour clock
   public String timeToString()
   {
       String updtTime = "";
       
       if(this.getHours()==12)// if 12 in the noon adds pm
       {
           updtTime = "" + this.getHours() + ":" + this.getMins() + " pm" ;
       }
       else if(this.getHours()> 12)// if statement to check if hour is more than 12
       {
           int time = this.getHours()%12;//local variable, will store mod of the number; represents the time in 12 hour clock 
           if (this.getMins() == 0)
           {
               updtTime = ""+ time + ":" + "00" + " pm";
           }
           else
           {
               updtTime = ""+ time + ":" + this.getMins()+ " pm";
           }
       }
       else 
       {
            if (this.getMins() == 0)
           {
               updtTime = ""+ this.getHours()  + ":" + "00" + " am";
           }
           else
           {
               updtTime = "" + this.getHours() + ":" + this.getMins() + " am" ;
           }
       }
       return updtTime;
   }

  
}