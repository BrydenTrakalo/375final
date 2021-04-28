package com.uregina.app;
import com.uregina.exceptions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class DateTest{
    @Test
    public void lessThan_Coverage1()
    {
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = new Date(5, 5, 2021);
            d2 = new Date(5, 5, 2021);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        assertFalse(Date.lessThan(d1, d2));
    }

    @Test
    public void lessThan_Coverage2()
    {
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = new Date(5, 7, 2022);
            d2 = new Date(5, 5, 2021);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        assertFalse(Date.lessThan(d1, d2));
    }

    @Test
    public void lessThan_Coverage3()
    {
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = new Date(5, 5, 2020);
            d2 = new Date(5, 8, 2021);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        assertTrue(Date.lessThan(d1, d2));
    }

    @Test
    public void lessThan_Coverage4()
    {
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = new Date(7, 7, 2020);
            d2 = new Date(5, 5, 2021);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        assertTrue(Date.lessThan(d1, d2));
    }

    @Test
    public void lessThan_Coverage5()
    {
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = new Date(7, 5, 2022);
            d2 = new Date(5, 5, 2021);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        assertFalse(Date.lessThan(d1, d2));
    }

    @Test
    public void lessThan_Coverage6()
    {
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = new Date(7, 5, 2022);
            d2 = new Date(5, 5, 2021);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        assertFalse(Date.lessThan(d1, d2));
    }

    @Test
    public void lessThan_Coverage7()
    {
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = new Date(5, 5, 2022);
            d2 = new Date(7, 7, 2021);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        assertFalse(Date.lessThan(d1, d2));
    }

    @Test
    public void lessThan_Coverage8()
    {
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = new Date(5, 5, 2021);
            d2 = new Date(7, 5, 2022);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        assertTrue(Date.lessThan(d1, d2));
    }

    @Test
    public void lessThan_Coverage9()
    {
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = new Date(5, 7, 2021);
            d2 = new Date(7, 5, 2021);
        }
        catch(InvalidDateException e){
            System.out.println( "\tInvalid date" );
        }
        assertTrue(Date.lessThan(d1, d2));
    }

   
}