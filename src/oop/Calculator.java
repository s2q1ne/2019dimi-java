package oop;

public class Calculator {
    //인스턴스 필드
    private final int num1, num2;
    private boolean power;



    public static void main(String[] args) {
        Calculator cal = new Calculator(10, 20);
        cal.powerOn();
        System.out.printf("%d + %d = %d", cal.getNum1(), cal.getNum2(), cal.add());
        System.out.printf("%d - %d = %d", cal.getNum1(), cal.getNum2(), cal.sub());
        System.out.printf("%d * %d = %d", cal.getNum1(), cal.getNum2(), cal.mul());
        System.out.printf("%d / %d = %f",cal.getNum1(), cal.getNum2(), cal.div());
        cal.powerOff();
    }

    public Calculator() {
        this( 0, 0);
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    // 인스턴스 메소드
    public void powerOn(){
        if(!power)
            System.out.println("전원을 켭니다.");
        power = true;
    }
    public void powerOff(){
        if(power)
            System.out.println("전원을 끕니다.");
        power=false;
    }
    public int add(){
        if( !power ) powerOn();
        System.out.printf("%d + %d = %d\n", this.num1, this.num2, this.num1 + this.num2);
        return this.num1 + this.num2;
    }
    public int sub(){
        if( !power ) powerOn();
        return this.num1 - this.num2;
    }
    public int mul(){
        if( !power ) powerOn();
        return this.num1 * this.num2;
    }
    public double div(){
        if( !power ) powerOn();
        return (double)this.num1 / this.num2;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }
}
