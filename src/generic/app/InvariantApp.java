package generic.app;

import generic.MyData;

/**
 * @author Novin on 23/06/2022
 * @project Learn-Java-Generic
 */
public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Novin");
//        MyData<Object> objectMyData = stringMyData;
        MyData<? extends Object> objectMyData = stringMyData;
        System.out.println(objectMyData.getData());
    }
}
