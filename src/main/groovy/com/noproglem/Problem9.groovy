package com.noproglem
/*
A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.

Find the product abc
*/
public class Problem9 extends Problem {

    def solution1() {
        def a = 1
        def b = 2
        def c = 997
        def squares
        def isTriplet
        while (true) {
            isTriplet = (a * a + b * b) == c * c
            if (isTriplet) {
                return [
                        a: a,
                        b: b,
                        c: c
                ]
            }

            b++
            c--
            if (b > c) {
                a++
                b = a + 1
                c = 1000 - b - a
            }
        }
    }
}

