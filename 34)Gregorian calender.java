import java.util.*;
 
class GetCurrentDateAndTime
{
   public static void main(String args[])
   {
      int day, month, year,weekday,dayofyear;
      boolean daylight;
      int second, minute, hour;
      import java.util.*;
 
class GetCurrentDateAndTime
{
   public static void main(String args[])
   {
      int day, month, year,weekday,dayofyear;
      boolean daylight;
      int second, minute, hour;
      GregorianCalendar date = new GregorianCalendar();
 
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
      weekday=date.get(Calendar.DAY_OF_WEEK);
      dayofyear=date.get(Calendar.DAY_OF_YEAR);
      daylight=TimeZone.getDefault().inDaylightTime( new Date());
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
      System.out.println("Seconds:"+second);
      System.out.println("Minutes:"+minute);
      System.out.println("Hours:"+hour);
      System.out.println("Day of month:"+day);
      System.out.println("Month of year:"+(month+1));
      System.out.println("Year:"+year);
      System.out.println("Weekday:"+weekday);
      System.out.println("Day of year:"+dayofyear);
      System.out.println("Daylight savings:"+daylight);
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
}
Program 34= new GregorianCalendar();
 
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
      weekday=date.get(Calendar.DAY_OF_WEEK);
      dayofyear=date.get(Calendar.DAY_OF_YEAR);
      daylight=TimeZone.getDefault().inDaylightTime( new Date());
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
      System.out.println("Seconds:"+second);
      System.out.println("Minutes:"+minute);
      System.out.println("Hours:"+hour);
      System.out.println("Day of month:"+day);
      System.out.println("Month of year:"+(month+1));
      System.out.println("Year:"+year);
      System.out.println("Weekday:"+weekday);
      System.out.println("Day of year:"+dayofyear);
      System.out.println("Daylight savings:"+daylight);
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
}
