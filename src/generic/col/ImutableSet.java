package generic.col;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Novin on 03/07/2022
 * @project Learn-Java-Generic
 */
public class ImutableSet {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Novin");
        stringSet.add("Ardian");
        Set<String> frozSet = Collections.unmodifiableSet(stringSet);
//        frozSet.add("Yulianto");
        stringSet.add("Yulianto");
        for (var result : stringSet) {
            System.out.println(result);
        }
        for (var result1 : frozSet) {
            System.out.println(result1);
            System.out.println("woi");
        }
    }
}
