package oop;

public class Singleton {

    private static Singleton instance;

    Singleton(){

    }

    public static Singleton getInstance() {
        if( instance == null ) instance = new Singleton();
        return instance;
    }
}
