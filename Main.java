import java.util.Scanner;
public class Main {

    public static void Vibor(int[] arr){
        if (arr[SearchMinimum1(arr)] == arr[SearchMaximum(arr)]) {
            System.out.println("Такого элемента не существует");
        } else {
            System.out.println(SearchMinimum2(arr));
        }
    }
    public static int SearchMinimum2(int[] a) {
        int indexMin = a[0];
        a = changeMin(a, SearchMinimum1(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= a[0]) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int SearchMinimum1(int[] arr) {
        int indexMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[0]) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int SearchMaximum(int[] arr) {
        int indexMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[indexMax]) {
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static int[] changeMin(int[] arr, int indexMin) {
        for (int i = indexMin; i <= arr.length - 1; i++) {
            if (indexMin == arr.length - 1) {
                arr[indexMin] = arr[indexMin - 1];
            } else {
                arr[indexMin] = arr[indexMin + 1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Vibor(inputArr());
    }
    public static void test(){
        System.out.println("test1 {1, 1, 1, 1, 1, 1, 1} ответ: " );
        Vibor(test1());
        System.out.println("test2 {1,2,3,4,5,6,7} ответ: " );
        Vibor(test2());
        System.out.println("test3 {55,432,999,2,44,29} ответ: " );
        Vibor(test3());
        System.out.println("test4 {2,1,2,1,2,22,44,3} ответ: " );
        Vibor(test4());

    }

    public static int[] inputArr() {
        Scanner sc = new Scanner(System.in);
        test();
        System.out.println("Введите элементы массива ");
        String line = sc.nextLine();
        String[] lineArray = line.split(" ");
        int[] numbers = new int[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            numbers[i] = Integer.parseInt(lineArray[i]);
        }
        return numbers;
    }
    public static int[ ] test1() {
        return new int[]{1, 1, 1, 1, 1, 1, 1};
    }
    public static int[ ] test2() {
        return new int[]{1,2,3,4,5,6,7};
    }
    public static int[ ] test3() {
        return new int[]{55,432,999,2,44,29};
    }
    public static int[ ] test4() {
        return new int[]{2,1,2,1,2,22,44,3};
    }
}
