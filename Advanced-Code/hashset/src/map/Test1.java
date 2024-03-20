package map;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
        list.stream().filter(s -> s.length() == 3).filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        System.out.println("------------------");
        list.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("------------------");
        list.stream().skip(3).forEach(s -> System.out.println(s));
        System.out.println("------------------");
        list.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
        System.out.println("-------------------");
        Stream<String> stream = list.stream().limit(4);
        System.out.println("--------------------");
        Stream<String> stream1 = list.stream().skip(2);
        System.out.println("--------------------");
        Stream<String> concat = Stream.concat(stream1, stream);
        //concat.forEach(s -> System.out.println(s));
        concat.distinct().forEach(s -> System.out.println(s));
    }
}
