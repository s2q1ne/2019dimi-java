package oop;

public class Car {
    private String company;
    private String model;
    private String color;
    private int maxspeed;
    private int price;

    public String getModel() {
        return model;
    }

    static{
        int hello;

    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public Car setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Car setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Car setCompany(String company) {
        this.company = company;
        return this;
    }

    public Car(String company, String model, String color, int maxspeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxspeed = maxspeed;
        this.price = price;
    }

    public Car(String company, String model, String color, int maxspeed) {
        this(company, model, color, maxspeed, 0);
    }

    public Car(String company, String model, String color) {
        this(company, model, color, 0, 0);
    }

    public void showInfo(){
        System.out.println();
        System.out.println("제조사명 : "+company);
        System.out.println("모델명 : "+model);
        System.out.println("색상 : "+color);
        System.out.printf("최고 속도 : %dkm\n", maxspeed);
        System.out.printf("가격 : %,d원\n", price);
    }
}
