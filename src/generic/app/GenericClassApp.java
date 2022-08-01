package generic.app;

import generic.MyData;

/**
 * @author Novin on 23/06/2022
 * @project Learn-Java-Generic
 */
public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Novin");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();
        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
