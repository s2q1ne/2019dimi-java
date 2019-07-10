package inheritance;

public abstract class SmartPhone {
    private String model;
    private String company;
    private int price;

    public SmartPhone(){ }

    public SmartPhone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void turnOn(){
        System.out.printf("%s의 전원을 켭니다.\n", model);
    }

    public void turnOff(){
        System.out.printf("%s의 전원을 끕니다.\n", model);
    }

    public abstract void pay();

    public void useSpecialFunction() {
        if( this instanceof Galaxy ){
            ((Galaxy)this).useWirelessCharging();
        }
        else if( this instanceof IPhone) {
            ((IPhone)this).useAirDrop();
        }
    }
    public String toString(){
        return String.format("모델명 : %s, 제조사 : %s, 가격 : %,d원", model, company, price);
    }
}
