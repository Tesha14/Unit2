package legs;

public class SonyLeg implements ILeg{
    private int price;
    public SonyLeg(int price){
        this.price = price;
    }
    public SonyLeg(){
    }
    public void step(){
        System.out.println("Sony Сделал шаг");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
