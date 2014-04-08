package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    public Map<String, Flyweight> flyweightMap = new HashMap<>();

    public Flyweight createFlyweight(String name) {
        if (!flyweightMap.containsKey(name))
            flyweightMap.put(name, new Flyweight(name));

        return flyweightMap.get(name);
    }
}