package home_work_5;

import java.util.*;
import java.util.stream.Collectors;

public class MainHashSet {

    /**
     * Главный метод создает HashSet-ы из 1000000 человек и животных:
     * значения nick, password, name и age устанавливает для них рандомно,
     * затем выводит на экран(в отсортированном виде), выводит время компиляции
     */
    public static void main(String[] args) {

//Работа с коллекцией людей
        Set<Person> personList = new HashSet<>();                   // Инициализация коллекции
        PersonGenerator personGenerator = new PersonGenerator();    // Инициализация генератора рандомных людей

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {                         // Наполнение коллекции
            personList.add(personGenerator.getRandomPerson());
        }
        long stop1 = System.currentTimeMillis();

        // LinkedHashSet поддерживает связный список элементов набора в том порядке, в котором они вставлялись.
        // Это позволяет организовать упорядоченную итерацию вставки в набор.

        LinkedHashSet<Person> sortedPersonSet = personList          // Сортировка
                .stream()
                .sorted(new SortByPassLengthAndNick())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        long start2 = System.currentTimeMillis();
        personForeach(sortedPersonSet);
        long stop2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        personList.remove(sortedPersonSet);                       // Удаление всех элементов коллекции
        long stop3 = System.currentTimeMillis();
        System.out.println();

//Работа с коллекцией животных
        Set<Animal> animalList = new HashSet<>();                    // Инициализация коллекции
        AnimalGenerator animalGenerator = new AnimalGenerator();     // Инициализация генератора рандомных животных

        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {                          // Наполнение коллекции
            animalList.add(animalGenerator.getRandomAnimal());
        }
        long stop4 = System.currentTimeMillis();

        LinkedHashSet<Animal> sortedAnimalSet = animalList           // Сортировка
                .stream()
                .sorted(new SortByAgeAndAnimalNick())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Iterator<Animal> animalIterator = sortedAnimalSet.iterator();// Итератор
        long start5 = System.currentTimeMillis();
        while (animalIterator.hasNext()) {
            Animal element = animalIterator.next();
            System.out.println("Возраст: " + element.getAge() + " | " + " " + "Кличка: " + element.getNick());
        }
        long stop5 = System.currentTimeMillis();

        Iterator<Animal> animalIterator1 = sortedAnimalSet.iterator();// Удаление элементов при помощи итератора
        long start6 = System.currentTimeMillis();
        while (animalIterator1.hasNext()) {
            Animal animal = animalIterator1.next();
            if (animal.getAge() == 15) {                              // Удалены будут все животные возрастом 15 лет
                animalIterator1.remove();
            }
        }
        long stop6 = System.currentTimeMillis();
        System.out.println();

        System.out.println("Коллекция <Person> после удаления - " + personList);
        System.out.println();

        System.out.println("Наполнение коллекции людьми заняло: " + (stop1 - start1) + "мс");
        System.out.println("Сортировка людей заняла: " + (stop2 - start2) + "мс");
        System.out.println("Удаление коллекции заняло: " + (stop3 - start3) + "мс");
        System.out.println();

        System.out.println("Наполнение коллекции животными заняло: " + (stop4 - start4) + "мс");
        System.out.println("Сортировка животных заняла: " + (stop5 - start5) + "мс");
        System.out.println("Удаление элементов коллекции заняло: " + (stop6 - start6) + "мс");
    }

    public static void personForeach(Set<Person> collection) {
        for (Person person : collection) {
            System.out.println("Пароль: " + person.getPassword() + " | " + " " + "Ник: " + person.getNick());
        }
    }
}