package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // 1. List 계열
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("바나나");
        list.add("배");
        list.add("망고");
        list.add(1, "오징어");
        list.set(2, "두리안");
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        list.clear();
        printList(list);
    }

    public static void printList(List<String> list) {
        System.out.printf("List {");
        for( String str : list){
            System.out.print(String.format("%s |", str));
        }
        System.out.println("}");
    }
}
