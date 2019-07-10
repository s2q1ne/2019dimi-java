package some_test;

import jdk.swing.interop.SwingInterOpUtils;

public class RecursiveMethod {

    public static void main(String[] args) {
        System.out.println(getValue( 5, 1));
    }

    private static int getValue( int number, int min ){
        if( number == min ) return 1;
        return (int)(Math.pow(getValue(number-1, min), 2.0) ) *2 + 1;
    }
    // a[n+1] = a[n]^2*2-1
}
