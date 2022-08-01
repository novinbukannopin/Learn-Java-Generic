package generic.app;

import generic.MyData;

/**
 * @author Novin on 23/06/2022
 * @project Learn-Java-Generic
 */
public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Novin");
        process(stringMyData);

        MyData<Integer> integerMyData = new MyData<>(100);
        MyData<? extends Object> myData = integerMyData;
        process(integerMyData);
//        Covariant memperbolehkan konversi Tipe Data Parent ke Child ataupun sebaliknya
    }

    public static void process(MyData<?extends Object> myData){
        System.out.println(myData.getData());

    }
}
