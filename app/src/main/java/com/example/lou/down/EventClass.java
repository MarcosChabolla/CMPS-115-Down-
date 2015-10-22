package com.example.lou.down;
import java.util.*;
/**
 * Created by Lou on 10/14/2015.
 */
public class EventClass {
    private String eventName;
    private String eventDiscription;
    private String location;
    private int time;
    private int date;

    /*constructor sets everything to null
     *use mutators to set variables
     */
    public EventClass(){
        eventName = "";
        eventDiscription = "";
        location = "";
        time = 0000;
        date = 01010000;
    }


    /*mutators*/
    public void setName(String Name){
        eventName = Name;
    }

    public void setEventDiscription(String EventDisc){
        eventDiscription = EventDisc;
    }

    public void setLocation(String Location){
        location = Location;
    }

    public void setTime(int Time){          //military time 0000 - 2400
        if (Time > 2400){
            System.out.println("Invalid time entered.");
        }
        time = Time;
    }

    public void setDate(int Date) {                  //MMDDYYYY (8 digit unsigned)
        if (Date < 01010000 || Date > 12319999) {    //01010000 - 12319999
            System.out.println("Invalid date entered.");
        }
        date = Date;
    }

    /*accessors*/
    public String getName(){ return eventName; }
    public String getDiscription(){ return eventDiscription; }
    public String getLocation(){ return location; }
    public int getTime(){ return time; }
    public int getDate(){ return date; }

}//EventClass
