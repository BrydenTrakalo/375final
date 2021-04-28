package com.uregina.app;
import com.uregina.app.*;
import com.uregina.exceptions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Time24Test{

    @Test
    public void toTime24_Coverage1()
    {
        Time24 time = null;
        Time24 expected = null;
        int hours = 4;
        int minutes = 20;
        AmPm am_pm = AmPm.am;
        time = Time24.toTime24(hours, minutes, am_pm);

        try{
            expected = new Time24(4, 20);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        String timeString = time.toString();
        String expectedString = expected.toString();
        assertTrue(timeString.equals(expectedString));
    }

    @Test
    public void toTime24_Coverage2()
    {
        Time24 time = null;
        Time24 expected = null;
        int hours = 4;
        int minutes = 20;
        AmPm am_pm = AmPm.pm;
        time = Time24.toTime24(hours, minutes, am_pm);

        try{
            expected = new Time24(16, 20);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        String timeString = time.toString();
        String expectedString = expected.toString();
        assertTrue(timeString.equals(expectedString));
    }


}