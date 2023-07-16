package CaglaSonmez;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // (n!) = 1 * 2 * 3 * 4 * ... * n

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        int faktoriyel = 1;
        for (int i = 1; i <= r; i++) {
            faktoriyel *= (n - r + i);
            faktoriyel /= i;
        }

        System.out.println(+n + " ve " + r + " değerlerinin faktöriyeli " + faktoriyel);
    }
}