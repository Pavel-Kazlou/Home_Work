package home_work_5;

import java.util.Comparator;

public class SortByPassLength implements Comparator<Person> {

    /**
     * Функция сравнения паролей по длинне
     * @param pass1 the first object to be compared.
     * @param pass2 the second object to be compared.
     * @return - пароль с меньшим колличеством символов в начало списка
     */
    @Override
    public int compare(Person pass1, Person pass2) {
        if (pass1.getPassword().length() > pass2.getPassword().length()) {
            return 1;
        } else {
            if (pass1.getPassword().length() < pass2.getPassword().length()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
