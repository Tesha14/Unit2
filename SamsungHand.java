package hands;

public class SamsungHand implements IHand{
    private int price;
    public SamsungHand(int price){
        this.price = price;}
    public SamsungHand(){
    }
    public void upHand(){
        System.out.println("Samsung Поднял руку");
    }
    @Override
    public int getPrice() {
        return 0;
    }


}
