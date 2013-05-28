package com.noproglem

class Problem11 extends Problem {

    def solution1() {
        final grid = given.grid

        // assume a square grid
        def length = grid.size()

        def maxProduct = 0
        // we could optimize by storing some of the calculate results

        // scan each row, from top-left to bottom-right. we only need to look right, down, diag down-right or diag down-left.
        for (row in 0..length - 1) {
            for (column in 0..length - 1) {
                final cellValue = grid[row][column]

                final roomRight = column < length - 3
                final roomBelow = row < length - 3
                final roomLeft = column > 2

                if (roomRight) {
                    def product = cellValue * grid[row][column + 1] * grid[row][column + 2] * grid[row][column + 3]
                    if (product > maxProduct)
                        maxProduct = product
                }
                if (roomBelow) {
                    def product = cellValue * grid[row + 1][column] * grid[row + 2][column] * grid[row + 3][column]
                    if (product > maxProduct)
                        maxProduct = product
                }
                if (roomRight && roomBelow) {
                    def product = cellValue * grid[row + 1][column + 1] * grid[row + 2][column + 2] * grid[row + 3][column + 3]
                    if (product > maxProduct)
                        maxProduct = product
                }
                if (roomLeft && roomBelow) {
                    def product = cellValue * grid[row + 1][column - 1] * grid[row + 2][column - 2] * grid[row + 3][column - 3]
                    if (product > maxProduct)
                        maxProduct = product
                }
            }
        }

        return maxProduct
    }

}
