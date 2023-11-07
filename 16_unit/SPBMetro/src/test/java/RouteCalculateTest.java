import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculateTest extends TestCase {

    List<Station> route;
    RouteCalculator calculator = new RouteCalculator();
    @Override
    protected void setUp() throws Exception {
        route = new ArrayList<>();
        Line lineOne = new Line(1, "One");
        Line lineTwo = new Line(2, "Two");
        Line lineThree = new Line(3, "Three");

        route.add(new Station("Apple", lineOne));
        route.add(new Station("Orange", lineOne));
        route.add(new Station("Pie", lineOne));

        route.add(new Station("Car", lineTwo));
        route.add(new Station("Fly", lineTwo));
        route.add(new Station("Train", lineTwo));

        route.add(new Station("Dog", lineThree));
        route.add(new Station("Cat", lineThree));
        route.add(new Station("Mouse", lineThree));
        route.add(new Station("Rabbit", lineThree));

    }

    public void testCalculateDuration(){
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 24.5;
        assertEquals(expected,actual);
    }

    public void testGetShortestRoute(){

    }

}
