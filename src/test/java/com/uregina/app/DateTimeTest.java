package com.uregina.app;
import com.uregina.exceptions.*;
import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class DateTimeTest{
    //This uses a lambda expression on line 33 and wouldnt run on my jenkins instance
    // @Test
    // public void subtract_Case012()
    // {
    //     Time12 time1 = null;
    //     Date date1 = null;
    //     Time12 time2 =null;
    //     Date date2 = null;
    //     try{
    //         time1 = new Time12(1,1,AmPm.am);
    //         date1 = new Date(1, 2, 2020);
    //         time2 = new Time12(1,1,AmPm.am);
    //         date2 = new Date(1, 25, 2020);
    //     }
    //     catch(InvalidDateException e){
    //         System.out.println( "\tInvalid date" );
    //     }
    //     catch(InvalidTimeException e){
    //         System.out.println( "\tInvalid Time" );
    //     }
    //     final DateTime d1 = new DateTime(date1, time1);
    //     final DateTime d2 = new DateTime(date2, time2);
    //     int difference=0;
    //     assertThrows(MoreThanOneDayException.class, () -> {
    //         DateTime.subtract(d1, d2);
    //     });
    // }

    @Test
    public void subtract_Case01346()
    {
        Time12 time1 = null;
        Date date1 = null;
        Time12 time2 =null;
        Date date2 = null;
        DateTime d1 = null;
        DateTime d2 = null;
        try{
            time1 = new Time12(1,1,AmPm.am);
            date1 = new Date(1, 3, 2020);
            time2 = new Time12(1,1,AmPm.am);
            date2 = new Date(1, 2, 2020);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        d1 = new DateTime(date1, time1);
        d2 = new DateTime(date2, time2);
        int difference=0;
        try{
            difference = DateTime.subtract(d1, d2);
        }
        catch(MoreThanOneDayException e){
            System.out.println( "\tMore than one day between DateTimes" );
        }
        assertTrue(difference == 1440);
    }

    @Test
    public void subtract_Case01356()
    {
        Time12 time1 = null;
        Date date1 = null;
        Time12 time2 =null;
        Date date2 = null;
        DateTime d1 = null;
        DateTime d2 = null;
        try{
            time1 = new Time12(1,1,AmPm.am);
            date1 = new Date(1, 2, 2020);
            time2 = new Time12(1,1,AmPm.am);
            date2 = new Date(1, 3, 2020);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        d1 = new DateTime(date1, time1);
        d2 = new DateTime(date2, time2);
        int difference=0;
        try{
            difference = DateTime.subtract(d1, d2);
        }
        catch(MoreThanOneDayException e){
            System.out.println( "\tMore than one day between DateTimes" );
        }
        assertTrue(difference == -1440);
    }

    @Test
    public void subtract_Case06()
    {
        Time12 time1 = null;
        Date date1 = null;
        Time12 time2 =null;
        Date date2 = null;
        DateTime d1 = null;
        DateTime d2 = null;
        try{
            time1 = new Time12(1,1,AmPm.am);
            date1 = new Date(1, 2, 2020);
            time2 = new Time12(1,20,AmPm.am);
            date2 = new Date(1, 2, 2020);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        d1 = new DateTime(date1, time1);
        d2 = new DateTime(date2, time2);
        int difference=0;
        try{
            difference = DateTime.subtract(d1, d2);
        }
        catch(MoreThanOneDayException e){
            System.out.println( "\tMore than one day between DateTimes" );
        }
        assertTrue(difference == -19);
    }




}