package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("张三","北京");
        hm.put("李四","上海");
        hm.put("王五","成都");
        //extracted(hm);
        //extracted1(hm);
        hm.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"---"+value);
            }
        });
    }

    private static void extracted1(HashMap<String, String> hm) {
        Set<Map.Entry<String, String>> entry = hm.entrySet();
        for(Map.Entry<String,String> entry1: entry){
            System.out.println(entry1.getKey()+"---"+entry1.getValue());
        }
    }

    private static void extracted(HashMap<String, String> hm) {
        Set<String> keyset = hm.keySet();
        for (String s : keyset) {
           String value = hm.get(s);
            System.out.println(s + value);

        }
    }
}
