package hashset;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("a");
        hs.add("a");
        hs.add("a");
        hs.add("f");
        hs.add("c");
        hs.add("d");
        System.out.println(hs);
    }
}
