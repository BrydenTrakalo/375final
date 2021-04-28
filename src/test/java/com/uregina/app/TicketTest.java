// package com.uregina.app;

// import com.uregina.app.*;
// import com.uregina.exceptions.*;

// import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertThrows;

// import java.util.ArrayList;
// import org.junit.Test;

// public class TicketTest{
//     @Test
//     public void CheckTicket_True()
//     {
//         Ticket myTicket = new Ticket();
//         ArrayList<Flight> ticket;
//         int maxFlightsCount = 3;
//         int maxFlightTime = 20;
//         int maxLayoverTime = 10;
//         boolean hasSchengenVisa = true;
//         boolean valid = myTicket.checkTicket(ticket, maxFlightsCount, maxFlightTime, maxLayoverTime, hasSchengenVisa);
//         assertTrue( valid );
//     }


//     @Test
//     public void CheckTicket_InvalidSchengenVisa_False()
//     {
//         Ticket myTicket = new Ticket();
//         ArrayList<Flight> ticket;
//         int maxFlightsCount = 3;
//         int maxFlightTime = 20;
//         int maxLayoverTime = 10;
//         boolean hasSchengenVisa = false;
//         boolean valid = myTicket.checkTicket(ticket, maxFlightsCount, maxFlightTime, maxLayoverTime, hasSchengenVisa);
//         assertFalse( valid );
//     }


//     @Test
//     public void CheckTicket_maxFlightTime_throwsNegativeTimeException(){
//         Ticket myTicket = new Ticket();
//         ArrayList<Flight> ticket;
//         int maxFlightsCount = 3;
//         int maxFlightTime = -20;
//         int maxLayoverTime = 10;
//         boolean hasSchengenVisa = false;
//         assertThrows(NegativeTimeException.class, () -> {
//             myTicket.checkTicket(ticket, maxFlightsCount, maxFlightTime, maxLayoverTime, hasSchengenVisa);
//         });
//     }
// }