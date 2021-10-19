package software.developer.generic.application;

import software.developer.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<String, Integer>("muhammadkpn", 23);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        Pair<String, Integer> pair2 = new Pair<>("muhammadkpn", 23);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());

        Pair<String, String> pair3 = new Pair<String, String>("muhammadkpn", "23");
        System.out.println(pair3.getFirst());
        System.out.println(pair3.getSecond());

    }
}
