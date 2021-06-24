package legs;

public class SamsungLeg implements ILeg{
    private int price;
    public SamsungLeg(int price){
        this.price = price;
    }
    public SamsungLeg(){
    }
    public void step(){
        System.out.println("Samsung Сделал шаг");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
