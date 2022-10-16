//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input n: ");
        int n = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        System.out.println("1 + ... + n = " + sum(n)); 
        System.out.println("1 * ... * n = " + multiply(n));
    }
    static int sum(int a) {
        return a*(a + 1)/2;   
    }
    static int multiply(int a) {
        int[] arr = new int [a];
        int multiply = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            multiply *= arr[i];
        }
        return multiply;
    }

}