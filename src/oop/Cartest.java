package oop;

public class Cartest {
    public static void main(String[] args) {
        Car[] car = new Car[3];
//        car[0] = new Car("현대자동차", "제네시스", "검정색", 225, 50000000);
//        car[1] = new Car("기아자동차", "K7", "흰색", 246, 40000000);
//        car[2] = new Car("삼성자동차", "SM7", "회색", 200, 38000000);
        car[0] = new Car("현대자동차", "제네시스", "검정색", 225, 50000000);
        car[1] = new Car("기아자동차", "K7", "흰색", 246);
        car[2] = new Car("삼성자동차", "SM7", "회색");
//        car[0] = new Car()
//                .setCompany("현대자동차")
//                .setModel("제네시스")
//                .setColor( "검정색")
//                .setMaxspeed(225)
//                .setPrice(50000000);
//        car[1] = new Car()
//                .setCompany("기아자동차")
//                .setModel("K7")
//                .setColor("흰색")
//                .setMaxspeed(246)
//                .setPrice(40000000);
//        car[2] = new Car()
//                .setCompany("삼성자동차")
//                .setModel("SM7")
//                .setColor("회색")
//                .setMaxspeed(200)
//                .setPrice(38000000);

        System.out.println("<< 자동차 목록 >>");
        car[0].showInfo();
        car[1].showInfo();
        car[2].showInfo();
    }
}
