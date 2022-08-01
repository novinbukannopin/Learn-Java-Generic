package generic.app;

import generic.MyData;

/**
 * @author Novin on 23/06/2022
 * @project Learn-Java-Generic
 */
public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Novin");
        MyData<? super String> myData = objectMyData;
        process(objectMyData);
    }
    public static void process(MyData<?super String>myData){
        System.out.println(myData.getData());
    }
}
