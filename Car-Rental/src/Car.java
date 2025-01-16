public class Car {
    private final String num;
    private final String maker;
    private final String model;
    private final int price;
    private final CarType type;
    private CarStatus status;


    public Car(String num, String maker, String model, CarType type, int price,CarStatus status) {
        this.num = num;
        this.maker = maker;
        this.model = model;
        this.type = type;
        this.price = price;
        this.status=status;
    }

    public void setStatus(CarStatus status){
        this.status=status;
    }

    public CarType getType() {
        return type;
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

    public CarStatus getStatus(){
        return status;
    }

}
