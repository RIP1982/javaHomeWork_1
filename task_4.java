// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.
public class task_4 {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        int[] nums_x = new int [10];
        int[] nums_y = new int [100];
        nums_x = fillArray(nums_x);
        nums_y = fillArray(nums_y);
        System.out.println(equation);
        searchSolution(nums_x, nums_y);  
    }

    static void searchSolution(int [] arr1, int [] arr2) {
        try {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    int x = 0;
                    int y = 0;
                    if(arr2[j]%10 == 0) {
                        if(20 + arr1[i] + arr2[j] + 5 == 69) {
                            x = arr1[i] + 20;
                            y = arr2[j] + 5;
                            System.out.println(x + " + " + y + " = 69");
                        }
                    }
                }
            }
        }
        catch (ArithmeticException e) {
            System.out.println("There is no solution!");
        }

    }

    static int[] fillArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}
