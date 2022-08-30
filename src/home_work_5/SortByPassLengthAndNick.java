package home_work_5;

import java.util.Comparator;

public class SortByPassLengthAndNick implements Comparator<Person> {

    /**
     * Функция сравнения обьектов по длинне пароля(первичное сравнение) и псевдониму
     * @param person1 the first object to be compared.
     * @param person2 the second object to be compared.
     * @return - пароль с меньшим колличеством символов в начало списка, иначе сортирует псевдонимы по алфовиту
     */
    @Override
    public int compare(Person person1, Person person2) {
        int comparedPassLength = person1.getPassword().length() - person2.getPassword().length();
        if (comparedPassLength == 0) {
            return person1.getNick().compareTo(person2.getNick());
        }
        return comparedPassLength;
    }
}
