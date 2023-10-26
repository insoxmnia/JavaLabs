import java.nio.file.Files
import java.nio.file.Paths
import java.io.File

/**
 * @author Naboychenko "insomnia" Nick
 * @version 1.0
 */

/**
 * На вход подается текстовый файл. При помощи регулярных выражений программа
 * разбивает текст на отдельные слова и находит частоту встречаемости отдельных
 * слов.
 */
fun main(args: Array<String>) {

    val file = File("src/main/resources/source.txt")
    val text = file.readText()

    val words = text.split("[^а-яА-Яa-zA-Z]+".toRegex())
        .filter { it.isNotEmpty() }

    val wordFrequency = mutableMapOf<String, Int>()

    for (word in words) {
        val count = wordFrequency.getOrDefault(word, 0)
        wordFrequency[word] = count + 1
    }

    for ((word, frequency) in wordFrequency) {
        println("Слово '$word' встречается $frequency раз")
    }
}