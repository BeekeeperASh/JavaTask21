import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution { //<T, K, V>
//    private T variableT;
//    private K variableK;
//    private V variableV;
//
//    public Solution(T variableT, K variableK, V variableV) {
//        this.variableT = variableT;
//        this.variableK = variableK;
//        this.variableV = variableV;
//    }

    public static <T> List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public static <T> Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Количество ключей и значений не совпадает");
        }

        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {

        List<String> list = newArrayList("A", "B", "C");
        System.out.println(list);

        Set<Integer> set = newHashSet(1, 3, 4, 6);
        System.out.println(set);

        Integer[] keys = {1, 2, 3};
        String[] values = {"One", "Two", "Three"};
        HashMap<Integer, String> map = newHashMap(keys, values);
        System.out.println(map);
    }
}
