import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        findPlanesLeavingInTheNextTwoHours(airport);
        System.out.println(airport);

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        long currentTime = System.currentTimeMillis();
        long newTime = currentTime + (2 * 60 * 60 * 1000);

        Date newT = new Date(newTime);
        System.out.println(newT);

        List<Terminal> terminals = airport.getTerminals();
        List<Flight> result = terminals.stream().map(Terminal::getFlights)
                .flatMap(f -> f.stream()).filter( fly -> fly.getType() == Flight.Type.DEPARTURE
                && fly.getDate().getTime() >= currentTime && fly.getDate().getTime() <= newTime )
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        return result;
    }

}