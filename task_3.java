// Реализовать простой калькулятор

import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
       double a = addNum();
       double b = addNum(); 
       String symbol = sign();
       calc(a, b, symbol);   
    }

    static void calc(double a, double b, String symbol) {
        if (symbol.equalsIgnoreCase("+")) {
            System.out.println(a + " + " + b + " = " + sum(a, b));
        }
        else if (symbol.equalsIgnoreCase("-")) {
            System.out.println(a + " - " + b + " = " + deduct(a, b));
        }
        else if (symbol.equalsIgnoreCase("*")) {
            System.out.println(a + " * " + b + " = " + multiply(a, b));
        }
        else if (symbol.equalsIgnoreCase("/")) {
            System.out.println(a + " / " + b + " = " + div(a, b));
        }
        else if (symbol.equalsIgnoreCase("V")) {
            System.out.println(b + " V " + a + " = " + root(a, b));
        }
        else if (symbol.equalsIgnoreCase("^")) {
            System.out.println(a + " ^ " + b + " = " + pow(a, b));
        }
        else {
            System.out.println("Input incorrect symbol!");
        }
    }

    static String sign() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input sign('+', '-', '*', '/', '^', 'V'): ");
        String symbol = iScanner.nextLine();
        return symbol;        
    }

    static double addNum() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input num: ");
        double n = Integer.parseInt(iScanner.nextLine());
        //iScanner.close();
        return n;
    }

    static double sum(double a, double b) {
        return a + b;
    }
    static double deduct(double a, double b) {
        return a - b;
    }
    static double multiply(double a, double b) {
        return a * b;
    }
    static double div(double a, double b) {
        return a / b;
    }
    static double root(double a, double b) {
        return Math.pow(a, 1/b);
    }
    static double pow(double a, double b) {
        return Math.pow(a, b);
    }
    
}
