package com.org.lab3

import kotlin.math.*

class Lab3 {

    /**
     * @author Naboychenko "insomnia" Nick
     * @version 1.0
     */

    /** Задание 1
     *  Вычислить значения выражения по формуле:
     *  (2x^-x) - cos(x) + sin(2xy)
     *  @param x - первое число
     *  @param y - второе число
     */

    fun ex1(x: Double, y: Double) {
        val function = (2 * x.pow(-x) - cos(x) + sin(2 * x * y))
        logger.info("Задание 1 выполнено. Значение выражения равно $function")
        println()
    }

    /** Задание 2
     *  Найти площадь равнобедренной трапеции с основаниями а и b и углом а при большем
     *  основании а.
     *  @param a - большее основание
     *  @param b - меньшее основание
     *  @param corner - угол при большем основании
     */

    fun ex2(a: Int, b: Int, corner: Double) {
        if (a > 0 && b > 0 && corner >= 0) {
            val result = (a * a - b * b) * tan(corner * PI / 180) / 4
            logger.info("Задание 1 выполнено. Площадь трапеции равна $result")
        } else {
            logger.error("Задание 2, ошибка! Неверные значения")
        }
        println()
    }

    /** Задание 3
     *  Подсчитать количество отрицательных чисел среди чисел а, b, с
     *  @param a - первое число
     *  @param b - второе число
     *  @param c - третье число
     */

    fun ex3(a: Double, b: Double, c: Double) {
        var result = 0
        if (a < 0) {
            result++
        }
        if (b < 0) {
            result++
        }
        if (c < 0) {
            result++
        }
        logger.info("Задание 3 выполнено. Количество отрицательных чисел равно $result")
        println()
    }

    /** Задание 4
     *  Дана точка A(x, у). Определить, принадлежит ли она треугольнику с вершинами в
     *  точках (x1, у1), (х2, у2), (х3, у3).
     *  @param x - координата x точки А
     *  @param y - координата y точки A
     *  @param x1 - координата x первой вершины треугольника
     *  @param y1 - координата y первой вершины треугольника
     *  @param x2 - координата x второй вершины треугольника
     *  @param y2 - координата y второй вершины треугольника
     *  @param x3 - координата x третьей вершины треугольника
     *  @param y3 - координата y третьей вершины треугольника
     */

    fun ex4(x: Int, y: Int, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int) {
        if ((x - x1) * (y1 - y2) - (y - y1) * (x1 - x2) >= 0 &&
            (x - x2) * (y2 - y3) - (y - y2) * (x2 - x3) >= 0 &&
            (x - x3) * (y3 - y1) - (y - y3) * (x3 - x1) >= 0
        ) {
            logger.info("Задание 4 выпонлено. Точка принадлежит треугольнику!")
        } else {
            logger.info("Задание 4 выполнено. Точка не принадлежит треугольнику")
        }
        println()
    }

    /** Задание 5
     *  Написать программу, которая по вводимому числу от 1 до 11 (номеру класса) выдает
     *  соответствующее сообщение «Привет, k-классник». Например, если k = 1, «Привет,
     *  первоклассник»; при k = 4: «Привет, четвероклассник». (switch)
     *  @param k - вводимое число
     */

    fun ex5(k: Int) {
        if (k in 1..11) {
            when (k) {
                1 -> logger.info("Задание 5 выполнено. Привет, первоклассник")
                2 -> logger.info("Задание 5 выполнено. Привет, второклассник")
                3 -> logger.info("Задание 5 выполнено. Привет, третьеклассник")
                4 -> logger.info("Задание 5 выполнено. Привет, четвероклассник")
                5 -> logger.info("Задание 5 выполнено. Привет, пятиклассник")
                6 -> logger.info("Задание 5 выполнено. Привет, шестиклассник")
                7 -> logger.info("Задание 5 выполнено. Привет, семиклассник")
                8 -> logger.info("Задание 5 выполнено. Привет, восьмиклассник")
                9 -> logger.info("Задание 5 выполнено. Привет, девятиклассник")
                10 -> logger.info("Задание 5 выполнено. Привет, десятиклассник")
                11 -> logger.info("Задание 5 выполнено. Привет, одиннадцатиклассник")
            }
        } else {
            logger.error("Задание 5, ошибка! Введено неверное число")
        }
        println()
    }

    /** Задание 6
     *  Найти все делители натурального числа n
     *  @param n - вводимое натуральное число
     */

    fun ex6(n: Int) {
        if (n >= 0) {
            logger.info("Задание 6 выполнено. Делителями числа $n являются:")
            for (i in 1..n) {
                if (n % i == 0) {
                    print("$i ")
                }
            }
        } else {
            logger.error("Задание 6, ошибка! Вы ввели не натуральное число")
        }
        println()
    }

    /** Задание 7
     *  Дано натуральное число n и действительное x. Найти сумму n членов ряда:
     *  @param x - действительное число
     *  @param n - натуральное число
     */

    fun ex7(n: Int, x: Float) {
        var s = 0.0
        if (n >= 0) {
            for (i in 1..n) {
                s += cos(2 * i * x) / i
            }
        }
        logger.info("Сумма $n членов ряда равна: $s")
    }

    /** Задание 8
     *  Даны натуральные числа M, N, k. Написать программу для вычисления суммы целых
     *  положительных чисел, больших M, меньших N и кратных k. Полученное число вывести на
     *  экран.
     *  @param m число, больше которого должно быть вводимое
     *  @param n число, меньше которого должно быть вводимое
     *  @param k число, кратное которому должно быть вводимое
     *  @param number сравнимаемое число
     */

    fun ex8(m: Int, n: Int, k: Int) {
        var sum = 0
        var number = m + 1
        if (m<n) {
            while (number < n) {
                if (number % k == 0) {
                    sum += number
                }
                number += 1
            }
        } else {
            logger.error("Задание 8, ошибка! Число m больше n")
        }
        logger.info("Задание 8 выполнено. Полученная сумма равна: $sum")
    }
}