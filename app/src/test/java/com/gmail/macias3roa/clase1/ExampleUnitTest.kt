package com.gmail.macias3roa.clase1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    var arreglito = arrayOf (9, 6, 4, 8, 1)
    val posis = Suma(arreglito)
    print(posis)

    @Test
    fun Suma(arreglito: IntArray): Int {
        val sumaT = 12
        for (i in arreglito.indices) {
            for (j in i + 1 until arreglito.size) {
                if (arreglito[i] + arreglito[j] == sumaT) {
                    println(i)
                    println(j)
                }
            }
        }
        return 0
    }
}
