package structural.flyweight

class FlyweightFactory {
    def flyweightMap = [:]

    Flyweight getFlyWeight(String name) {
        if (!flyweightMap.containsKey(name))
            flyweightMap[name] = new Flyweight(name: name)

        flyweightMap[name]
    }
}