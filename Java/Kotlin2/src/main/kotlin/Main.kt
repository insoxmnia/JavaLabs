import java.nio.file.Files
import java.nio.file.Paths

        /**
         * @author Naboychenko "insomnia" Nick
         * @version 1.0
         */

fun main() {
    val example = Labs()

    var n: Int = -1
    while (n != 0) {
        println("Выберите задание")
        n = readln().toInt()
        when (n) {
            1 -> {
                println("Задание 1")
                println("Выберите ввод: 1 - из файла, 2 - из консоли")
                val a = readln().toInt()
                if (a == 1) {
                    val path = "src/main/resources/source1.txt"
                    val encoded = Files.readAllLines(Paths.get(path))
                    example.ex1(encoded[0].toDouble(), encoded[1].toDouble())
                } else {
                    println("Введите X")
                    val x: Double = readln().toDouble()
                    println("Введите Y")
                    val y: Double = readln().toDouble()
                    example.ex1(x, y)
                }
            }

            2 -> {
                println("Задание 2")
                println("Выберите ввод: 1 - из файла, 2 - из консоли")
                val a = readln().toInt()
                if (a == 1) {
                    val path = "src/main/resources/source2.txt"
                    val encoded = Files.readAllLines(Paths.get(path))
                    example.ex2(encoded[0].toInt(), encoded[1].toInt(), encoded[2].toDouble())
                } else {
                    println ("Введите большое основание a")
                    val a: Int = readln().toInt()
                    println ("Введите основание b")
                    val b: Int = readln().toInt()
                    println ("Введите угол при большем основании")
                    val corner: Double = readln().toDouble()
                    example.ex2(a, b, corner)
                }
            }

            3 -> {
                println("Задание 3")
                println("Выберите ввод: 1 - из файла, 2 - из консоли")
                val a = readln().toInt()
                if (a == 1) {
                    val path = "src/main/resources/source3.txt"
                    val encoded = Files.readAllLines(Paths.get(path))
                    example.ex3(encoded[0].toDouble(), encoded[1].toDouble(), encoded[2].toDouble())
                } else {
                    println("Введите число a")
                    val a: Double = readln().toDouble()
                    println("Введите число b")
                    val b: Double = readln().toDouble()
                    println("Введите число c")
                    val c: Double = readln().toDouble()
                    example.ex3(a, b, c)
                }
            }

            4 -> {
                println("Задание 4")
                println("Выберите ввод: 1 - из файла, 2 - из консоли")
                val a = readln().toInt()
                if (a == 1) {
                    val path = "src/main/resources/source4.txt"
                    val encoded = Files.readAllLines(Paths.get(path))
                    example.ex4(
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
                    example.ex4(x, y, x1, y1, x2, y2, x3, y3)
                }
            }

            5 -> {
                println("Задание 5")
                println("Выберите ввод: 1 - из файла, 2 - из консоли")
                val a = readln().toInt()
                if (a == 1) {
                    val path = "src/main/resources/source5.txt"
                    val encoded = Files.readAllLines(Paths.get(path))
                    example.ex5(encoded[0].toInt())
                } else {
                    println("Введите номер класса")
                    val k: Int = readln().toInt()
                    example.ex5(k)
                }
            }

            6 -> {
                println("Задание 6")
                println("Выберите ввод: 1 - из файла, 2 - из консоли")
                val a = readln().toInt()
                if (a == 1) {
                    val path = "src/main/resources/source6.txt"
                    val encoded = Files.readAllLines(Paths.get(path))
                    example.ex6(encoded[0].toInt())
                } else {
                    println("Введите натуральное число n")
                    val n: Int = readln().toInt()
                    example.ex6(n)
                }
            }

            7 -> {
                println("Задание 7")
                println("Выберите ввод: 1 - из файла, 2 - из консоли")
                val a = readln().toInt()
                if (a == 1) {
                    val path = "src/main/resources/source7.txt"
                    val encoded = Files.readAllLines(Paths.get(path))
                    example.ex7(encoded[0].toInt(), encoded[1].toFloat())
                } else {
                    println("Введите натуральное число n")
                    val n: Int = readln().toInt()
                    println("Введите действительное число x")
                    val x: Float = readln().toFloat()
                    example.ex7(n, x)
                }
            }

            8 -> {
                println("Задание 8")
                println("Выберите ввод: 1 - из файла, 2 - из консоли")
                val a = readln().toInt()
                if (a == 1) {
                    val path = "src/main/resources/source8.txt"
                    val encoded = Files.readAllLines(Paths.get(path))
                    example.ex8(encoded[0].toInt(), encoded[1].toInt(), encoded[2].toInt())
                } else {
                    println("Введите натуральное число M")
                    val m: Int = readln().toInt()
                    println("Введите натуральное число N")
                    val n: Int = readln().toInt()
                    println("Введите натуральное число k")
                    val k: Int = readln().toInt()
                    example.ex8(m, n, k)
                }
            }
            else -> println("Ошибка")
        }
    }
}