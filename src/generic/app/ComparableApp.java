package generic.app;

import generic.Person;

import java.util.Arrays;

/**
 * @author Novin on 03/07/2022
 * @project Learn-Java-Generic
 */
public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Novin", "Lamongan"),
                new Person("Ukil", "Nganjuk"),
                new Person("Budi", "Jogja")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

    }
}
