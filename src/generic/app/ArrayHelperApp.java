package generic.app;

import generic.util.ArrayHelper;

/**
 * @author Novin on 23/06/2022
 * @project Learn-Java-Generic
 */
public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Novin", "Ardian", "Yulianto"};
        Integer[] numbers = {1,2,3,4,5};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));

    }
}
