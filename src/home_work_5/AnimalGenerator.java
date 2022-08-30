package home_work_5;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class AnimalGenerator {

    /**
     * Функция создания обьекта с рандомными характеристиками(Возраст, Кличка)
     * @return - животное с возрастом и Кличкой
     */
    public Animal getRandomAnimal() {
        Animal animal = new Animal(getRandomAge(), getRandomRusNick(getStringLength()));
        return animal;
    }

    /**
     * Функция получения рандомной строки из заданных буквенно-цифровых значений
     * @param strLength - длинна строки
     * @return - рандомную строку заданной длинны
     */
    public String getRandomRusNick(int strLength) {
        String rangeOfChar = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < strLength; i++) {
            sb.append(rangeOfChar.charAt(random.nextInt(rangeOfChar.length())));
        }
        return sb.toString();
    }

    /**
     * Функция получения рандомной строки из букв Русского алфавита
     * @param strLength - длинна строки
     * @return - рандомную строку заданной длинны
     */
    public String getRandomRusString(int strLength) {
        String rangeOfRusChar = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < strLength; i++) {
            sb.append(rangeOfRusChar.charAt(random.nextInt(rangeOfRusChar.length())));
        }
        return sb.toString();
    }

    /**
     * Функция получения рандомного обьекта из списка кличек
     * @return - рандомный обьект с присвоеной кличкой
     */
    public String getRandomAnimalNick() {
        var random = new SecureRandom();
        var list = Arrays.asList("Бублик", "Огонёк", "Муся", "Батон", "Фродо", "Йода", "Обиван", "Бусинка", "Саламон", "Сруль", "Семёныч", "Вафля", "ВанДам", "Пушок", "Барбос", "Сучёк", "Чемодан", "Тарзан", "Бизон", "Джеки", "Люцифер", "Сосисочка", "Сухарик", "Кефир", "Нимбус", "Гром", "Арчибальд", "Тайсон", "Ниточка", "Даник", "Пряник", "Ричард", "ТарТар", "Тайфун", "Уголёк", "Фёдор", "Фиона", "Хитсугая", "Юстас", "Юла", "Ярополк", "Яша");
        var randomNick = list.get(random.nextInt(list.size()));
        return randomNick;
    }
    /**
     * Функция получения рандомного цифрового значения в пределах от 1 до 15 для генерации возраста
     * @return - рандомное цифровое значение
     */
    public int getRandomAge() {
        int result = 1 + (int) (Math.random() * 15);
        return result;
    }

    /**
     * Функция получения рандомного цифрового значения в пределах от 5 до 10 для генерации длинны клички
     * @return рандомное цивровое значение
     */
    public int getStringLength() {
        int result = 5 + (int) (Math.random() * 10);
        return result;
    }
}
