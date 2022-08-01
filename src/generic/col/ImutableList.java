package generic.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Novin on 03/07/2022
 * @project Learn-Java-Generic
 */
public class ImutableList {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Novin");
        name.add("Ardian");
        List<String> stringList = Collections.unmodifiableList(name);
        name.add("Novin");
        stringList.add("Yulianto");
        for (var names: stringList
             ) {
            System.out.println(names);
        }
    }
}
