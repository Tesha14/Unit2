public abstract class Transport {

    public int power;
    public int MaxSpeed;
    public int weight;
    public String brand;


    public double recount(){
        double power1 = 0.74 * power;
        return power1;
    }
public String describe(){
        return "brand: " + " MaxSpeed = " +
                MaxSpeed + "км/ч" + "weight = " + weight + "кг" +
                " power1 = " + recount() + "Кв";
}

}