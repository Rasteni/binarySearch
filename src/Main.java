public class Main {
    public static void main(String[] args) {
        //Arrays Example
        int[] intArray = {2,5,8,12,16,23,38,56,72,91};
        int key = 23;
        int foundIndex = Arrays.binarySearch(intArray,key);
        System.out.println("Index: " + foundIndex);


        String[] stringArray = {"apple","banana","cherry","date"};
        key = java.util.Arrays.binarySearch(stringArray,"date");
        System.out.println("Index: " + key);

        //Collections Example
        java.util.List<Integer> integerList = java.util.Arrays.asList(2,5,8,12,16,23,38,56,72,91);
        key = Collections.binarySearch(integerList, 56);
        System.out.println("Index: " + key);

        java.util.List<String> stringList = java.util.Arrays.asList("apple","banana","cherry","date");
        key = Collections.binarySearch(stringList, "cherry");
        System.out.println("Index: " + key);

        java.util.List<String> stringList2 = java.util.Arrays.asList("zebra","yogurt","xenon","waffle");
        key = Collections.binarySearch(stringList2,"waffle");
        System.out.println("Index: " + key);



    }
}