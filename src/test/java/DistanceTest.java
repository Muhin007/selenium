

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {
    @Test
    public void testDistance() {
        Assert.assertEquals(Point.distance(new Point(2, 2), new Point(5, 6)) , 5.0);
    }
}
