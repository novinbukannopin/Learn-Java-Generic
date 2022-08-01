package generic.app;

import generic.Pair;

/**
 * @author Novin on 23/06/2022
 * @project Learn-Java-Generic
 */
public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Novin", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.setFirst("Novan");
        System.out.println(pair.getFirst());
    }
}
