package com.group.libraryapp.calculator

/**
 * packageName  : com.group.libraryapp.calculator
 * fileName     : Calculator
 * author       : sshan
 * date         : 2023-05-10
 * description  :
 * ========================================================
 *  DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-05-10          sshan            최초생성
 */
class Calculator(
    var number: Int
) {
    fun add(operand: Int){
        this.number += operand
    }

    fun minus(operand: Int){
        this.number -= operand
    }

    fun multiply(operand: Int){
        this.number *= operand
    }

    fun divide(operand: Int){
        if (operand == 0){
            throw IllegalArgumentException("0으로 나눌 수 없습니다")
        }
        this.number /= operand
    }
}