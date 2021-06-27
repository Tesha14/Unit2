package hands;

public class ToshibaHand implements IHand{
    private int price;
    public ToshibaHand(int price){
        this.price = price;}
    public ToshibaHand(){
    }
    public void upHand(){
        System.out.println("Toshiba Поднял руку");
    }
    @Override
    public int getPrice() {
        return 0;
    }


}
