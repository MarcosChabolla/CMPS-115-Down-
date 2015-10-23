package com.example.lou.down;
import java.io.Serializable;
import java.util.*;
/**
 * Created by Lou on 10/14/2015.
 */
public class EventClass implements Serializable {
    private String eventName;
    private String eventDiscription;
    private String location;
    private int hour;
    private int minute;
    private int month, day, year;
    private String accept;
    private String deny;

    /*constructor sets everything to null
     *use mutators to set variables
     */
    public EventClass(){
        eventName           = "";
        eventDiscription    = "";
        location            = "";
        hour                = 0;
        minute              = 0;
        month               = 0;
        day                 = 0;
        year                = 0;
        accept              = "";
        deny                = "";
    }


    /*mutators*/
    public void setName(String Name)                 { eventName = Name; }
    public void setEventDiscription(String EventDisc){ eventDiscription = EventDisc; }
    public void setLocation(String Location)         { location = Location; }

    public void setHour(int Hour)       { hour = Hour; }
    public void setMinute(int Minute)   { minute = Minute; }

    public void setMonth(int Month)     { month = Month; }
    public void setDay(int Day)         { day = Day; }
    public void setYear(int Year)       { year = Year;}

    public void setAccept(String Accept){ accept = Accept; }
    public void setDeny(String Deny)    { deny = Deny; }

    /*accessors*/
    public String getName()             { return eventName; }
    public String getDiscription()      { return eventDiscription; }
    public String getLocation()         { return location; }
    public int getHour()                { return hour; }
    public int getMinute()              { return minute; }
    public int getDay()                 { return day; }
    public int getMonth()               { return month; }
    public int getYear()                { return year; }
    public String getAccept()           { return accept; }
    public String getDeny()             { return deny; }

}//EventClass
