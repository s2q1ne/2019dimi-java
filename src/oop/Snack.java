package oop;

public class Snack {
    private String name;
    private String company;
    private int price;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public Snack() {
    }

    public Snack(String name, String company, int price, int number) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return (
                new StringBuilder()
                        .append(String.format("이름 : %s\n",name))
                        .append(String.format("제조사 : %s\n", company))
                        .append(String.format("가격 : %,d원\n",price))
                        .append(String.format("개수 : %d개\n",number))
                    .toString()
        );
    }

    public int calcPrice(){
        return price*number;
    }

}
