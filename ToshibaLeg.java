package legs;

public class ToshibaLeg implements ILeg{
    private int price;
    public ToshibaLeg(int price){
        this.price = price;
    }
    public ToshibaLeg(){
    }
    public void step(){
        System.out.println("Toshiba Сделал шаг");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
