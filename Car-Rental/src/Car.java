public class Car {
    private final String num;
    private final String maker;
    private final String model;
    private int price;

    public Car(String num, String maker, String model, int price) {
        this.num = num;
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
