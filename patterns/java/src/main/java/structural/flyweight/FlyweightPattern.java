package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightPattern {

    public static class FlyWeight {
        String name;

        FlyWeight(String name) {
            // imagine this is a heavyweight operation and you wouldn't want to repeat it very often
            this.name = name;
        }
    }

    public static class FlyweightFactory {
        public Map<String, FlyWeight> flyweightMap = new HashMap<>();

        public FlyWeight createFlyweight(String name) {
            if (!flyweightMap.containsKey(name))
                flyweightMap.put(name, new FlyWeight(name));

            return flyweightMap.get(name);
        }
    }

}
