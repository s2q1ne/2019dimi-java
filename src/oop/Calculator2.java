package oop;

public class Calculator2 {

    public static final double PI = 3.141592;
    private boolean powerFlag;

    public static void main(String[] args) {
        Calculator2 cal = new Calculator2();
        int a=10, b=20;
        System.out.println(Calculator2.PI);
        System.out.printf("%d + %d = %d", a, b, add(a,b,cal));
        System.out.printf("%d - %d = %d", a, b, sub(a,b,cal));
        System.out.printf("%d * %d = %d", a, b, mul(a,b,cal));
        System.out.printf("%d / %d = %f",a, b, div(a,b,cal));
        cal.powerOff();
    }

    public static int add(int num1, int num2, Calculator2 c){
        c.powerOn();
        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        return num1 + num2;
    }
    public static int sub(int num1, int num2, Calculator2 c){
        c.powerOn();
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        return num1 - num2;
    }
    public static int mul(int num1, int num2, Calculator2 c){
        c.powerOn();
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        return num1 * num2;
    }
    public static double div(int num1, int num2, Calculator2 c){
        c.powerOn();
        System.out.printf("%d / %d = %f\n", num1, num2, (double)num1 / num2);
        return (double)num1 / num2;
    }

    public void powerOn(){
        if(!powerFlag)
            System.out.println("전원을 켭니다.");
        powerFlag = true;
    }
    public void powerOff(){
        if(powerFlag)
            System.out.println("전원을 끕니다.");
        powerFlag=false;
    }
}
