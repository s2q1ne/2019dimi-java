package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("kor", 100);
        map.put("mat", 92);
        map.put("eng", 95);
        map.put("eng", 90);
        map.remove("eng");
        printMap(map);
        map.clear();

        Map<String, List<String>> map2 = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("노래1"); list.add("노래2"); list.add("노래3");
        map2.put("댄스", list);

        Map<String, String> map3 = new HashMap<>();
        map3.put("하이", "안녕");
        map3.put("하이2", "안녕2");
    }
    public static void printMap( Map<String,Integer> map){
        for(String key : map.keySet()){
            System.out.printf("%s : %d | ", key, map.get(key));
        }
    }
}
