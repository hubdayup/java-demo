package map;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        String info = "acaba";
        TreeMap<Character,Integer> tm = new TreeMap<>();
        char[] charArray = info.toCharArray();
        for(char c:charArray){
            if(!tm.containsKey(c)){
                tm.put(c,1);
            }else {
                tm.put(c,tm.get(c)+1);
            }
        }
        StringBuilder sb = new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb.append(key).append("(").append(value).append(")");

            }
        });
        System.out.println(sb);
    }
}
