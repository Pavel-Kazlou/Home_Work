package home_work_6;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

// Чтение из файла -> передача прочитанного в строку
        Path filePath = Path.of("File_home_work_6.txt");
        String fileToString = Files.readString(filePath);

//  Разделение строки на отдельные слова -> передача в массив
        String[] words = WordsArray.addWordsToArray(fileToString);

// Создание коллекции уникальных слов -> подсчёт уникальных слов
        SetUniqueWords.wordsToSet(words);

// Создание Map, где ключ = слово, значение = количество повторений
        WordsMap.mapCollection(words);

// Создание коллекции из Мар с 2мя аргументами
        Conversion.toConvert(WordsMap.mapCollection(words));

// Сортировка
        List<Map.Entry<String, Integer>> arrList = Conversion.toConvert(WordsMap.mapCollection(words));
        Sort.toSort(arrList);

        NElements.someElements(arrList, 100);

        ISearchEngine easySearch = new EasySearch();

        ISearchEngine indexOfSearch = new IndexOfSearch();
        System.out.println("В тексте найдено - " + indexOfSearch.search(fileToString, "война") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + indexOfSearch.search(fileToString, "и") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + indexOfSearch.search(fileToString, "мир") + " использований(ие) -> indexOf");
        System.out.println();

        System.out.println("В тексте найдено - " + indexOfSearch.search(fileToString.toLowerCase(), "война") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + indexOfSearch.search(fileToString.toLowerCase(), "и") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + indexOfSearch.search(fileToString.toLowerCase(), "мир") + " использований(ие) -> indexOf");

        ISearchEngine regExSearch = new RegExSearch();
    }
}
// "Сказал сказал рассказала пересказал сказал.(сказал сказал? сказал1"