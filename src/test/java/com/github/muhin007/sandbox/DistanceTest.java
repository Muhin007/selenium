package com.github.muhin007.sandbox;

import org.testng.annotations.Test;

public class DistanceTest {
    @Test
    public void testDistance() {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(5, 6);
        assert Point.distance(point1, point2) == 5.0;
    }

}
