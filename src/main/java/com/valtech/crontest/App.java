package com.valtech.crontest;

import java.text.ParseException;
import java.util.Date;

import org.quartz.CronExpression;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
	    throws ParseException
    {
	final String expression = args[0];
	System.out.printf("Next execution for [%s] expression :\n", expression); 

        final CronExpression cronExpression = new CronExpression(expression);
 
        final Date nextValidDate1 = cronExpression.getNextValidTimeAfter(new Date());
        final Date nextValidDate2 = cronExpression.getNextValidTimeAfter(nextValidDate1);
 
        System.out.println(nextValidDate1);
        System.out.println(nextValidDate2);
	    
    }
}
