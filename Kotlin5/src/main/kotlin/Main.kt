import java.io.File
import java.util.concurrent.Executors

    /**
     * @author Naboychenko "insomnia" Nick
     * @version 1.0
     */

    /**
     * Реализовать многопоточное приложение, реализующее вывод всех четных слов из
     * списка файлов. Для каждого файла создается новый поток, но общее число потоков
     * не должно превышать 10.
     */
fun main() {
    val fileNames = listOf("src/main/resources/file1.txt", "src/main/resources/file2.txt",
        "src/main/resources/file3.txt", "src/main/resources/file4.txt", "src/main/resources/file5.txt")

    val executor = Executors.newFixedThreadPool(10)

    val result = mutableListOf<String>()

    fileNames.forEach { fileName ->
        executor.execute {
            val file = File(fileName)
            val words = file.readText().split("\\s+".toRegex()) // Делим текст на слова по пробельным символам

            val evenWords = words.filterIndexed { index, _ -> index % 2 == 0 } // Отбираем четные слова

            synchronized(result) {
                result.addAll(evenWords)
            }
        }
    }

    executor.shutdown()
    executor.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.DAYS)

    println("Все четные слова из списка файлов:")
    result.forEach { word ->
        println(word)
    }
}