package generic.app;

import generic.MyData;

/**
 * @author Novin on 03/07/2022
 * @project Learn-Java-Generic
 */
public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<String>("Novin"));
        print(new MyData<Integer>(100));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
