package home_work_5;

import java.util.Objects;

public class Person {

    /** Поле имя */
    private String name;
    /** Поле пароль */
    private String password;
    /** Поле псевдоним */
    private String nick;

    /**
     * Конструктор создания нового обьекта с определёнными значениями
     * @param nick - псевдоним
     * @param password - пароль
     * @param name - имя
     */
    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    /**
     * Функция получения значения поля
     * @return возвращает имя человека
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(password, person.password) && Objects.equals(nick, person.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, nick);
    }

    /**
     * Функция получения значения поля
     * @return возвращает пароль человека
     */
    public String getPassword() {
        return password;
    }


    /**
     * Функция получения значения поля
     * @return возвращает псевдоним человека
     */
    public String getNick() {
        return nick;
    }
    @Override
    public String toString() {
        return  "Пароль: " + password + "| Псевдоним: " + nick;
    }
}
