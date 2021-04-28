package com.uregina.app;

import com.uregina.exceptions.*;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Class Ticket, a List of Flights in ordered sequences
 *
 */
public class Ticket
{
	
	private static final String [] SchengenAirportsCode = new String[] { "VIE","BRU","PRG","CPH","TLL","HEL","CDG","FRA","MUC","ATH","BUD","KEF","CIA","RIX","VNO","LUX","MLA","AMS","OSL","WAW","LIS","LJU","KSC","MAD","ARN","BRN"};
	/**
	 * The function checks the validaity of a ticket
	 * It checks
	 *		1. airports code are in IATA format (any three uppercases letters)
	 *        2. maximum flights Count >= number of flights in the ticket
     *        3. maximum flight time >= Total flight times ( sum of flight time of each flight)
     *        4. maximum layover time >= Total layover times ( sum of layover time between each two consecutive flight)
	 *		5. no flight between two airports in the Schengen area unless the passenger has a valid SchengenVisa
	 *		6. no cyclic trip
	 *		7. The sequence of flights in correct ( the arrival airport of a flight is the departure airport of the next flight)
	 * 		8. any other logical constraints 
	 * @param	ticket				List of ordered sequences of flights
	 * @param	maxFlightsCount		Maximum number of flights in the ticket
	 * @param	maxFlightTime		Maximum allowable total flight times in minutes
	 * @param	maxLayoverTime		Maximum allowable total layover times in minutes
	 * @param	hasSchengenVisa		to indicate if the passenger has a valid Schengen Visa or not
	 * @return	true if the ticket is valid, false otherwise
	 * usefeul functions that you may use
	 * 		(class: Flight , method: getArrivalAirport)
	 * 		(class: Flight , method: getDepatureAirport)
	 * 		(class: Flight , method: calculateFlightTime)
	 * 		(class: Flight , method: calculateLayoverTime)
	 * 		(class: ticket , method: hasCyclicTrip)
	*/
	public static boolean checkTicket( ArrayList<Flight> ticket, int maxFlightsCount, int maxFlightTime, int maxLayoverTime, boolean hasSchengenVisa)
	{
		//Todo: add your code here
		int flightAmount = ticket.size();
		if(maxFlightsCount < flightAmount){
			return false;
		}

		int totalFlightTime=0;
		try{
            for(int i=0;i<=flightAmount;i++){
				totalFlightTime += ticket.get(i).calculateFlightTime();
			}
        }
        catch(MoreThanOneDayException e){
            System.out.println( "\tMore than one day between DateTimes" );
        }
		catch(NegativeTimeException e){
            System.out.println( "\tNegative time on flight" );
        }
		if(maxFlightTime < totalFlightTime){
			return false;
		}

		int totalLayoverTime=0;
		try{
			for(int i=0;i<=flightAmount;i++){
				totalLayoverTime += Flight.calculateLayoverTime(ticket.get(i), ticket.get(i+1));
			}
        }
        catch(MoreThanOneDayException e){
            System.out.println( "\tMore than one day between DateTimes" );
        }
		catch(NegativeTimeException e){
            System.out.println( "\tNegative time on flight" );
        }
		if(maxLayoverTime < totalLayoverTime){
			return false;
		}

		if(!hasSchengenVisa){
			for(int i=0;i<=flightAmount;i++){
				for(int j=0;i<=SchengenAirportsCode.length;j++){
					if(ticket.get(i).getDepatureAirport().equals(SchengenAirportsCode[j])){
						if (ticket.get(i).getArrivalAirport().equals(SchengenAirportsCode[j])){
							return false;
						}
					}
				}
			}
		}

		for(int i=0;i<=flightAmount-1;i++){
			if(!ticket.get(i).getArrivalAirport().equals(ticket.get(i+1).getDepatureAirport())){
				return false;
			}
		}

		if(Ticket.hasCyclicTrip(ticket)){
			return false;
		}
		//end of your code
		return true;
	}
		/**
	 * The function checks if the ticket has a cyclic trip
	 * (that is, no passenger can arrive at the same airport more than once within the same ticket)
	 * @param	ticket				List of ordered sequences of flights
	 * @return	true if the ticket has a cyclic trip, false otherwise
	 * usefeul functions that you may use
	 * 		(class: Flight , method: getArrivalAirport)
	 * 		(class: Flight , method: getDepatureAirport)
	*/
	public static boolean hasCyclicTrip(ArrayList<Flight> ticket)
	{
		//Todo : add your code here
		String airportsString="";
		for(int i=0;i<=ticket.size();i++){
			if(airportsString.indexOf(ticket.get(i).getDepatureAirport())!=-1){
				return true;
			}
			else{
				airportsString += " " + ticket.get(i).getDepatureAirport();
			}
		}
		//Todo : end of your code
		return false;
	}
}