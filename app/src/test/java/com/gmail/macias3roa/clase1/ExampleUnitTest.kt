package com.gmail.macias3roa.clase1

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    fun Suma(numeros: IntArray, num: Int): IntArray {
        var array = intArrayOf(0,0)
        for(i in numeros.indices) {
            for(j in i+1 until numeros.size)   {
                if(numeros[i]+numeros[j]==num)  {
                    array[0]=i
                    array[1]=j
                }
            }
        }
        return array
    }

    @Test
    fun primerTest() {
        var numeros = intArrayOf(9, 6, 4, 8, 1);
        var resultado = intArrayOf(2, 3);

        assertEquals(resultado.get(0), Suma(numeros,12).get(0));
    }
}
