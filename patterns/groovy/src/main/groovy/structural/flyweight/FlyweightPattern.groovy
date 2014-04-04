package structural.flyweight

 class FlyweightPattern {

    static class FlyWeight {
        String name
    }

    static class FlyweightFactory {
        def flyweightMap = [:]

        FlyWeight getFlyweight(String name) {
            if (!flyweightMap.containsKey(name))
                flyweightMap[name] = new FlyWeight(name: name)

            flyweightMap[name]
        }
    }

}
