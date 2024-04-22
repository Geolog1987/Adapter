package Adapter;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 4));
        System.out.println(calc.mult(2, 8));
        System.out.println(calc.pow(8, 4));


    }
}