package com.noproglem

class Problem15 extends Problem {

    private final int gridSize

    Problem15() {
        gridSize = given.gridSize
    }

    def solution1() {
        move(0, 0)

        pathsFound
    }

    long pathsFound = 0
    def pathCache = [:]

    def move(int x, int y) {
        if (x == gridSize && y == gridSize) {
            pathsFound++

            return
        }

        def cacheKey = "$x,$y"

        if (pathCache[cacheKey]) {
            pathsFound += pathCache[cacheKey]
            return
        }

        long knownPaths = pathsFound

        if (x < gridSize)
            move(x + 1, y)

        if (y < gridSize)
            move(x, y + 1)

        long newPathsFromHere = pathsFound - knownPaths
        pathCache[cacheKey] = newPathsFromHere
    }


}


