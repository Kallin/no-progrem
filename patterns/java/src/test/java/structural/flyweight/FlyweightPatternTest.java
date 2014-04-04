package structural.flyweight;

import org.junit.Assert;
import org.junit.Test;


public class FlyweightPatternTest {

    @Test
    public void testFlightweightCreation() {
        final FlyweightPattern.FlyweightFactory flyweightFactory = new FlyweightPattern.FlyweightFactory();

        FlyweightPattern.FlyWeight flyweight1 = flyweightFactory.createFlyweight("NAME1");
        FlyweightPattern.FlyWeight flyweight2 = flyweightFactory.createFlyweight("NAME1");
        FlyweightPattern.FlyWeight flyweight3 = flyweightFactory.createFlyweight("NAME2");

        Assert.assertSame("flyweights with the same name should have been the same object", flyweight1, flyweight2);
        Assert.assertNotSame("flyweights with different names should have been different objects", flyweight1, flyweight3);
        Assert.assertEquals("should have been exactly two entries in the flyweight factory map", 2, flyweightFactory.flyweightMap.keySet().size());
    }

}
