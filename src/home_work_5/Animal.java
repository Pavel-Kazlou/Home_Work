package home_work_5;

public class Animal {

    /** Поле возраст */
    private int age;
    /** Поле кличка */
    private String nick;

    /**
     * Конструктор создания нового обьекта с определёнными значениями
     * @param age - возраст
     * @param nick - кличка
     */
    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    /**
     * Функция получения значения поля
     * @return возвращает возраст животного
     */
    public int getAge() {
        return age;
    }

    /**
     * Функция получения значения поля
     * @return возвращает кличку животного
     */
    public String getNick() {
        return nick;
    }
}
