package com.uregina.app;
import com.uregina.exceptions.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Time12Test{
    @Test
    public void subtract_Coverage1()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(6,30,pm);
            t2 = new Time12(3,30,am);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == 900);
    }

    @Test
    public void subtract_Coverage2()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(6,30,am);
            t2 = new Time12(6,40,pm);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == -730);
    }

    @Test
    public void subtract_Coverage3()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(7,50,pm);
            t2 = new Time12(6,30,pm);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == 80);
    }

    @Test
    public void subtract_Coverage4()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(6,30,am);
            t2 = new Time12(6,30,pm);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == -720);
    }

    @Test
    public void subtract_Coverage5()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(6,30,pm);
            t2 = new Time12(6,40,pm);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == -10);
    }


    @Test
    public void subtract_Coverage6()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(6,50,am);
            t2 = new Time12(6,40,am);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == 10);
    }

    @Test
    public void subtract_Coverage7()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(6,50,pm);
            t2 = new Time12(6,40,am);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == 730);
    }

    @Test
    public void subtract_Coverage8()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(4,30,am);
            t2 = new Time12(6,40,am);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == -130);
    }

    @Test
    public void subtract_Coverage9()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(5,40,pm);
            t2 = new Time12(6,30,am);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == 670);
    }

    @Test
    public void subtract_Coverage10()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(5,50,am);
            t2 = new Time12(6,40,pm);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == -770);
    }

    @Test
    public void subtract_Coverage11()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(4,30,pm);
            t2 = new Time12(6,30,pm);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == -120);
    }

    @Test
    public void subtract_Coverage12()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(8,30,am);
            t2 = new Time12(6,30,am);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == 120);
    }

    @Test
    public void subtract_Coverage13()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(8,30,pm);
            t2 = new Time12(6,40,am);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == 830);
    }

    @Test
    public void subtract_Coverage14()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(6,30,am);
            t2 = new Time12(6,30,am);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = Time12.subtract(t1, t2);
        assertTrue(difference == 0);
    }

    @Test
    public void subtract_Coverage15()
    {
        Time12 t1 = null;
        Time12 t2 = null;
        AmPm am = AmPm.am;
		AmPm pm = AmPm.pm;
        try{
            t1 = new Time12(6,30,pm);
            t2 = new Time12(6,30,pm);
        }
        catch(InvalidTimeException e){
            System.out.println( "\tInvalid Time" );
        }
        int difference = t1.subtract(t1, t2);
        assertTrue(difference == 0);
    }




}