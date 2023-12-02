package aockt.y2015

import io.github.jadarma.aockt.test.AdventDay
import io.github.jadarma.aockt.test.AdventSpec

@AdventDay(2015, 3, "Perfectly Spherical Houses in a Vacuum")
class Y2015D03Test : AdventSpec<Y2015D03>({
    partOne {
        ">" shouldOutput 2
        "^>v<" shouldOutput 4
        "^v^v^v^v^v" shouldOutput 2
    }

    partTwo {
        "^v" shouldOutput 3
        "^>v<" shouldOutput 3
        "^v^v^v^v^v" shouldOutput 11
    }
})