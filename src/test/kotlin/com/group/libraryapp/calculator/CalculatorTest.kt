package com.group.libraryapp.calculator

/**
 * packageName  : com.group.libraryapp.calculator
 * fileName     : CalculatorTest
 * author       : sshan
 * date         : 2023-05-10
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-10          sshan            최초생성
 */
fun main(){
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
}

class CalculatorTest {
    fun addTest() {
        // given
        val calculator = Calculator(5)

        // when
        calculator.add(3)

        // then
        if (calculator.number != 8){
            throw IllegalArgumentException()
        }
    }
}