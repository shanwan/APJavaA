/**
 * Try to fill in the statements under the comments
 * 
 * First, students need to use the System.currentTimeMillis() as described in 
 * the problem description video to get current time span from 1, 1, 1970. 
 * 
 * Then, get the total second. 
 * 
 * Calculate for current seconds, current minutes and current hour. 
 * 
 * Those variables are described in output part. You need to declare them first. 
 * 
 * @author (Your name)
 * @version (version, date)
 */
public class DisplayCurrentTime {
    public static void main(String[] args) {
          // Obtain the total milliseconds since midnight, Jan 1, 1970
          long millis = System.currentTimeMillis();
  
          // Obtain the total seconds since midnight, Jan 1, 1970
          long seconds = millis / 1000;
  
          // Compute the current second in the minute in the hour
          long currentSecond = seconds % 60;
      
          // Obtain the total minutes
          long minutes = seconds / 60;
      
          // Compute the current minute in the hour
          long currentMinute = minutes % 60;
      
          // Obtain the total hours
          long hours = minutes / 60;
          
          // Compute the current hour
          long currentHour = hours % 24;
          long localHour = (currentHour-8) % 24; 
      
          // Display results
          System.out.println("Current time is " + currentHour + ":"
      + currentMinute + ":" + currentSecond + " GMT");
      System.out.println("Current time is " + localHour + ":"
      + currentMinute + ":" + currentSecond + " PST");
        }
}
