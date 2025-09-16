
package day3;

public class GenericMethods {
    public static <T extends Number> double sum(T[] arr) {
        double total = 0.0;
        for (T item : arr) {
            total += item.doubleValue(); // Convert each item to double
        }
        return total;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 5, 3, 10, 12, 15};
        Double[] floatNums = {5.5, 2.4, 2.0};

        double sumOfNums = GenericMethods.sum(nums);
        double sumFloatNums = GenericMethods.sum(floatNums);

        System.out.println("Sum of integers: " + sumOfNums);
        System.out.println("Sum of floats: " + sumFloatNums);
    }
}