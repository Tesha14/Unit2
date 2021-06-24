package hands;

public class SonyHand implements IHand{
    private int price;
    public SonyHand(int price){
        this.price = price;}
    public SonyHand(){
    }
    public void upHand(){
        System.out.println("Sony Поднял руку");
    }
    @Override
    public int getPrice() {
        return 0;
    }


}
