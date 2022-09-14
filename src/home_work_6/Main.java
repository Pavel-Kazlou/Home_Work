package home_work_6;
//Удалил лишний импорт
import home_work_6.Interface.ISearchEngine;
import home_work_6.Search.EasySearch;
import home_work_6.Search.IndexOfSearch;
import home_work_6.Search.RegExSearch;
import home_work_6.WorkWithT.*;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
//Тут был Максим
// Чтение из файла -> передача прочитанного в строку
        //Path filePath = Path.of("File_home_work_6.txt"); //Использовал бы reader а не path а путь к моей копии книги использую
        String filePath = Reader.toRead("C:\\Tools\\Java\\Proj\\Md-JC1-113-22\\HomeWork\\src\\warAndPeace.txt");
        //Убрал перевод в стринг за ненадобностью
        //  Разделение строки на отдельные слова -> передача в массив
        String[] words = WordsArray.addWordsToArray(filePath);

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

        ISearchEngine easySearch = new EasySearch(); //Зачем вводить и не использовать
        ISearchEngine regExSearch = new RegExSearch(); //Зачем вводить и не использовать
        ISearchEngine indexOfSearch = new IndexOfSearch();

        System.out.println("В тексте найдено - " + indexOfSearch.search(filePath, "война") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + indexOfSearch.search(filePath, "и") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + indexOfSearch.search(filePath, "мир") + " использований(ие) -> indexOf");
        System.out.println();
        System.out.println("В тексте найдено - " + easySearch.search(filePath, "война") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + easySearch.search(filePath, "и") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + easySearch.search(filePath, "мир") + " использований(ие) -> indexOf");
        System.out.println();
        System.out.println("В тексте найдено - " + regExSearch.search(filePath.toLowerCase(), "война") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + regExSearch.search(filePath.toLowerCase(), "и") + " использований(ие) -> indexOf");
        System.out.println("В тексте найдено - " + regExSearch.search(filePath.toLowerCase(), "мир") + " использований(ие) -> indexOf");

    }
}
// "Сказал сказал рассказала пересказал сказал.(сказал сказал? сказал1"