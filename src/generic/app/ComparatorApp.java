package generic.app;

import generic.Person;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Novin on 03/07/2022
 * @project Learn-Java-Generic
 */
public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Udin", "Jombang"),
                new Person("Alif", "Kediri"),
                new Person("Novin", "Lamongan")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }



}
