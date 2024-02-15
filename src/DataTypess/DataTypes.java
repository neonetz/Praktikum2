package DataTypess;

import java.util.Scanner;


public class DataTypes {
    /**
     * Primitf used to hold integer values(byte,short,int and long)
     * A byte is an 8-bit signed integer.
     * A short is a 16-bit signed integer.
     * An int is a 32-bit signed integer.
     * A long is a 64-bit signed integer
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long n = scanner.nextLong();
                        System.out.println(n + " can be fitted in:");
                        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                            System.out.println("* byte");
                        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                            System.out.println("* short");
                        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                            System.out.println("* int");
                        if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                            System.out.println("* long");
                    } catch (Exception e) {
                        System.out.println(scanner.next() + " can't be fitted anywhere in java");
                    }
                }
    }
}

