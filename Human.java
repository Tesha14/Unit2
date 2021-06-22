public class Human implements IHuman {
    private String Name;
    private ITrousers trousers;
    private ICoat coat;
    private IShoes shoes;

    public Human(ITrousers trousers, ICoat coat, IShoes shoes, String Name) {
        this.Name = Name;
        this.trousers = trousers;
        this.coat = coat;
        this.shoes = shoes;
    }

    public Human() {
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }

    public ITrousers PutOnTrousers() {
        return trousers;
    }

    public void setCoat(ICoat coat) {
        this.coat = coat;
    }

    public ICoat PutOnCoat() {
        return coat;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public IShoes PutOnShoes(IShoes shoes) {
        return shoes;
    }

    @Override
    public void action() {
        trousers.PutOn();
        trousers.TakeOff();
        coat.PutOn();
        coat.TakeOff();
        shoes.PutOn();
        shoes.TakeOff();
    }

    // public int getPrice() {
    //  int price = trousers.getPrice() + coat.getPrice() + shoes.getPice();
    //   return price;

    //    if ((trousers >= 796) && (coat >= 697) && (shoes >= 459)) {
    //      return true;

    // }
    //  }


}