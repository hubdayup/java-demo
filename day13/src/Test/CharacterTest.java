package Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class CharacterTest {
    public static void main(String[] args) throws IOException {
        HashMap<Character,Integer> hm = new HashMap<>();
        FileReader fr = new FileReader("D:\\B.txt");
        int i;
        while ((i = fr.read())!=1){
            char c = (char) i;
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else {
                hm.put(c,hm.get(c)+1);
            }

        }fr.close();
        StringBuilder sb =new StringBuilder();
        hm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer vaule) {
                sb.append(key).append("(").append(vaule).append(")");
            }
        });
        System.out.println(sb);
    }
}
