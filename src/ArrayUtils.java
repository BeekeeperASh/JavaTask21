public class ArrayUtils {
    public static <T> T getElementAtIndex(T[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс вне диапазона массива");
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer element = ArrayUtils.getElementAtIndex(intArray, 2);
        System.out.println(element);

        String[] stringArray = {"Hello", "World", "Java"};
        String element2 = ArrayUtils.getElementAtIndex(stringArray, 1);
        System.out.println(element2);
    }
}
