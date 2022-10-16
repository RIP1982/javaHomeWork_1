// Вывести все простые числа от 1 до 1000

public class task_2 {
    public static void main(String[] args) {
        int[] nums = new int[1000];
        String simple_nums = "1, 2";
        System.out.println("simple_nums = " + simpleNums(fillArray(nums), simple_nums));
    }
    static String simpleNums(int[] arr, String a) {   
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]%2 != 0 && arr[i]%(Math.sqrt(i+1)) != 0) {
                a += ", " + arr[i];
            }
        }
        return a;
    }
    static int[] fillArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
                    arr[i] = i + 1;
        }
        return arr;
    }
}
