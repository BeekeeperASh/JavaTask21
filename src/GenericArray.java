import java.util.ArrayList;
import java.util.List;

public class GenericArray<T> {
    private List<T> array;

    public GenericArray() {
        array = new ArrayList<>();
    }

    public void add(T element) {
        array.add(element);
    }

    public T get(int index) {
        return array.get(index);
    }

    public int size() {
        return array.size();
    }

    public static void main(String[] args) {
        GenericArray<Integer> intArray = new GenericArray<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);

        System.out.println("Integer Array:");
        for (int i = 0; i < intArray.size(); i++) {
            System.out.println(intArray.get(i));
        }

        GenericArray<String> stringArray = new GenericArray<>();
        stringArray.add("Hello");
        stringArray.add("World");

        System.out.println("String Array:");
        for (int i = 0; i < stringArray.size(); i++) {
            System.out.println(stringArray.get(i));
        }
    }
}
