package home_work_5;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class PersonGenerator {

    /**
     * Функция создания обьекта с рандомными характеристиками(Ник(5-10 символов), Пароль(5-10 символов), Имя(из списка имён)
     * @return - человека с псевдонимиом, паролем и именем
     */
    public Person getRandomPerson() {
        Person person = new Person(getRandomEngString(getStringLength()), getRandomPassword(getStringLength()), getRandomName());
        return person;
    }

    /**
     * Функция получения рандомной строки из заданных буквенно-цифровых значений
     * @param strLength - длинна строки
     * @return - рандомную строку заданной длинны
     */
    public String getRandomString(int strLength) {
        String rangeOfChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZабвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ0123456789";
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
     * Функция получения рандомной строки из букв Английского алфавита
     * @param strLength - длинна строки
     * @return - рандомную строку заданной длинны
     */
    public String getRandomEngString(int strLength) {
        String rangeOfEngChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < strLength; i++) {
            sb.append(rangeOfEngChar.charAt(random.nextInt(rangeOfEngChar.length())));
        }
        return sb.toString();
    }

    /**
     * Функция получения рандомного обьекта из списка имён
     * @return - рандомный обьект с присвоеным именем
     */
    public String getRandomName() {
        var random = new SecureRandom();
        var list = Arrays.asList("Антон", "Анна", "Борис", "Божена", "Виктор", "Василиса", "Георгий", "Галина", "Дмитрий", "Диана", "Евгений", "Елена", "Жан", "Жанна", "Захар", "Зоя", "Игорь", "Инна", "Константин", "Кристина", "Леонид", "Ларисса", "Макар", "Мария", "Николай", "Надежда", "Олег", "Ольга", "Павел", "Полина", "Ринат", "Раиса", "Святослав", "Светлана", "Тарас", "Таиса", "Ульяна", "Фёдор", "Фаина", "Харитон", "Юрий", "Юлия", "Ярослав", "Яна");
        var randomName = list.get(random.nextInt(list.size()));
        return randomName;
    }

    /**
     * Функция получения рандомного обьекта из списка псевдонимов
     * @return - рандомный обьект с присвоеным псевлонимом
     */
    public String getRandomNick() {
        var random = new SecureRandom();
        var list = Arrays.asList("Bublick", "FireMan", "PeasOfBread", "Frodo", "Magistrate", "Duke", "SuneShine", "SalmonKane", "Siting", "MrValera", "Miami", "JanKlot", "SnowStorm", "Barbosa", "Stick", "VojagVojag", "WhereIsJane", "Bull", "Mao", "Cake", "Mushroom", "Lord", "MilkShake", "Potter", "Thunder", "Imo", "BoxerChick", "DentalFlos", "Bullet", "HandsUp", "Runner", "ClapClap", "Lightning", "GoldenDust", "Flint", "Mutant", "NoFuel", "LastProgrammer", "YoungAndShine", "Knight");
        var randomNick = list.get(random.nextInt(list.size()));
        return randomNick;
    }

    /**
     * Функция получения рандомной строки из заданных буквенно-цифровых значений
     * @param strLength - длинна строки
     * @return - рандомную строку заданной длинны
     */
    public String getRandomPassword(int strLength) {
        String rangeOfChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < strLength; i++) {
            sb.append(rangeOfChar.charAt(random.nextInt(rangeOfChar.length())));
        }
        return sb.toString();
    }

    /**
     * Функция получения рандомного цифрового значения в пределах от 5 до 10
     * @return - рандомное цифровое значение
     */
    public int getStringLength() {
        int result = 5 + (int) (Math.random() * 10);
        return result;
    }
}

