package com.org.lab3

import org.apache.logging.log4j.LogManager
import java.nio.file.Files
import java.nio.file.Paths
import org.apache.logging.log4j.Logger

val logger: Logger = LogManager.getLogger("MyLogger")

/**
 * @author Naboychenko "insomnia" Nick
 * @version 1.0
 */

fun main() {
    val exmpl = Lab3()
    var n: Int = -1
    while (n != 0) {

        println("---------------------------------------")
        println("Выберите задание")
        n = readln().toInt()

        /**
         * @see Lab3
         */

        try {
            processInput(n, exmpl)
        } catch (e: Exception) {
            logger.fatal("Something went wrong\n${e.javaClass.name}\n${e.message}")
        }
    }
}

private fun processInput(n: Int, exmpl: Lab3) {

    when (n) {
        1 -> {
            logger.debug("Выбрано задание 1")
            println("Выберите ввод: 1 - из файла, 2 - из консоли (иное - из консоли)")
            val a = readln().toInt()
            case1(a, exmpl)
        }

        2 -> {
            logger.debug("Выбрано задание 2")
            println("Выберите ввод: 1 - из файла, 2 - из консоли (иное - из консоли)")
            val a = readln().toInt()
            case2(a, exmpl)
        }

        3 -> {
            logger.debug("Выбрано задание 3")
            println("Выберите ввод: 1 - из файла, 2 - из консоли (иное - из консоли)")
            val a = readln().toInt()
            case3(a, exmpl)
        }

        4 -> {
            logger.debug("Выбрано задание 4")
            println("Выберите ввод: 1 - из файла, 2 - из консоли (иное - из консоли)")
            val a = readln().toInt()
            case4(a, exmpl)
        }

        5 -> {
            logger.debug("Выбрано задание 5")
            println("Выберите ввод: 1 - из файла, 2 - из консоли (иное - из консоли)")
            val a = readln().toInt()
            case5(a, exmpl)
        }

        6 -> {
            logger.debug("Выбрано задание 6")
            println("Выберите ввод: 1 - из файла, 2 - из консоли (иное - из консоли)")
            val a = readln().toInt()
            case6(a, exmpl)
        }

        7 -> {
            logger.info("Выбрано задание 7")
            println("Выберите ввод: 1 - из файла, 2 - из консоли (иное - из консоли)")
            val a = readln().toInt()
            case7(a, exmpl)
        }

        8 -> {
            logger.debug("Выбрано задание 8")
            println("Выберите ввод: 1 - из файла, 2 - из консоли (иное - из консоли)")
            val a = readln().toInt()
            case8(a, exmpl)
        }

        else -> println("CrItIcAl ErRoR")
    }
}

private fun case8(a: Int, exmpl: Lab3) {
    println("Задание 8")
    if (a == 1) {
        val path = "src/main/resources/aboba8.txt"
        val encoded = Files.readAllLines(Paths.get(path))
        exmpl.ex8(encoded[0].toInt(), encoded[1].toInt(), encoded[2].toInt())
    } else {
        println("Введите натуральное число M")
        val m: Int = readln().toInt()
        println("Введите натуральное число N")
        val n: Int = readln().toInt()
        println("Введите натуральное число k")
        val k: Int = readln().toInt()
        exmpl.ex8(m, n, k)
    }
}

private fun case7(a: Int, exmpl: Lab3) {
    println("Задание 7")
    if (a == 1) {
        val path = "src/main/resources/aboba7.txt"
        val encoded = Files.readAllLines(Paths.get(path))
        exmpl.ex7(encoded[0].toInt(), encoded[1].toFloat())
    } else {
        println("Введите натуральное число n")
        val n: Int = readln().toInt()
        println("Введите действительное число x")
        val x: Float = readln().toFloat()
        exmpl.ex7(n, x)
    }
}

private fun case6(a: Int, exmpl: Lab3) {
    println("Задание 6")
    if (a == 1) {
        val path = "src/main/resources/aboba6.txt"
        val encoded = Files.readAllLines(Paths.get(path))
        exmpl.ex6(encoded[0].toInt())
    } else {
        println("Введите натуральное число n")
        val n: Int = readln().toInt()
        exmpl.ex6(n)
    }
}

private fun case5(a: Int, exmpl: Lab3) {
    println("Задание 5")
    if (a == 1) {
        val path = "src/main/resources/aboba5.txt"
        val encoded = Files.readAllLines(Paths.get(path))
        exmpl.ex5(encoded[0].toInt())
    } else {
        println("Введите номер класса")
        val k: Int = readln().toInt()
        exmpl.ex5(k)
    }
}

private fun case4(a: Int, exmpl: Lab3) {
    println("Задание 4")
    if (a == 1) {
        val path = "src/main/resources/aboba4.txt"
        val encoded = Files.readAllLines(Paths.get(path))
        exmpl.ex4(
            encoded[0].toInt(), encoded[1].toInt(), encoded[2].toInt(),
            encoded[3].toInt(), encoded[4].toInt(), encoded[5].toInt(),
            encoded[6].toInt(), encoded[7].toInt()
        )
    } else {
        println("Введите X координату точки A")
        val x: Int = readln().toInt()
        println("Введите Y координату точки A")
        val y: Int = readln().toInt()
        println("Введите x1 координату вершины треугольника")
        val x1: Int = readln().toInt()
        println("Введите y1 координату вершины треугольника")
        val y1: Int = readln().toInt()
        println("Введите x2 координату вершины треугольника")
        val x2: Int = readln().toInt()
        println("Введите y2 координату вершины треугольника")
        val y2: Int = readln().toInt()
        println("Введите x3 координату вершины треугольника")
        val x3: Int = readln().toInt()
        println("Введите y3 координату вершины треугольника")
        val y3: Int = readln().toInt()
        exmpl.ex4(x, y, x1, y1, x2, y2, x3, y3)
    }
}

private fun case3(a: Int, exmpl: Lab3) {
    println("Задание 3")
    if (a == 1) {
        val path = "src/main/resources/aboba3.txt"
        val encoded = Files.readAllLines(Paths.get(path))
        exmpl.ex3(encoded[0].toDouble(), encoded[1].toDouble(), encoded[2].toDouble())
    } else {
        println("Введите число a")
        val a: Double = readln().toDouble()
        println("Введите число b")
        val b: Double = readln().toDouble()
        println("Введите число c")
        val c: Double = readln().toDouble()
        exmpl.ex3(a, b, c)
    }
}

private fun case2(a: Int, exmpl: Lab3) {
    println("Задание 2")
    if (a == 1) {
        val path = "src/main/resources/aboba2.txt"
        val encoded = Files.readAllLines(Paths.get(path))
        exmpl.ex2(encoded[0].toInt(), encoded[1].toInt(), encoded[2].toDouble())
    } else {
        println("Введите большое основание a")
        val a: Int = readln().toInt()
        println("Введите основание b")
        val b: Int = readln().toInt()
        println("Введите угол при большем основании")
        val corner: Double = readln().toDouble()
        exmpl.ex2(a, b, corner)
    }
}

private fun case1(a: Int, exmpl: Lab3) {
    println("Задание 1")
    if (a == 1) {
        val path = "src/main/resources/aboba1.txt"
        val encoded = Files.readAllLines(Paths.get(path))
        exmpl.ex1(encoded[0].toDouble(), encoded[1].toDouble())
    } else {
        println("Введите X")
        val x: Double = readln().toDouble()
        println("Введите Y")
        val y: Double = readln().toDouble()
        exmpl.ex1(x, y)
    }
}
