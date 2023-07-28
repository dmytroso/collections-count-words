# Collections. Count words

## Description
Count words in a text and return statistics.

## Details
1. Implement `countWords` method in [Words](src/main/java/com/epam/rd/autotasks/Words.java) class.

The input parameter is a list of strings representing lines of text.

Count how often the word occurs in the text.  
If the word *"kitten"* occurred in a text 23 times then its entry would be *"kitten - 23\n"*.
Return statistics as a String containing all the entries.

2. Omit all words which contain less than **4** letters and appear less  less than **10** (the words which are too small or to rare)
The entries in the resulting String should be also sorted by their amount and then in alphabetical order if it is needed.

Be sure to make your code handling texts that are not in English.

*You may not use streams, lambdas or method references in your code*

Входной параметр представляет собой список строк, представляющих строки текста.

Подсчитайте, как часто слово встречается в тексте.

Если слово "котенок" встречается в тексте 23 раза, то его запись будет "котенок - 23\n". Возвращает статистику в виде строки, содержащей все записи.

Пропустите все слова, которые содержат менее 4 букв и появляются менее 10 (слова, которые слишком малы или редки) Записи в результирующей строке также должны быть отсортированы по их количеству, а затем в алфавитном порядке, если это необходимо.

Обязательно сделайте так, чтобы ваш код обрабатывал тексты, которые не на английском языке.

Вы не можете использовать потоки, лямбды или ссылки на методы в своем коде
