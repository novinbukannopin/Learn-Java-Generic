package generic.app;

import generic.MyData;

/**
 * @author Novin on 03/07/2022
 * @project Learn-Java-Generic
 */
public class TypeErasureApp {


    public static void main(String[] args) {
        MyData myData = new MyData("Novin");
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }

}
