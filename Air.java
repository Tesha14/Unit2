public abstract class Air extends Transport {
    public int Wingspan;
    public int MinRunway;
    public String describe(){
        return super.describe() + "Wingspan" + Wingspan +
                "MinRunway" + MinRunway + "м";
}




    //double w = 56.4d; //размах крыла военного
    //double p = 34; //размах крыла пассажирского


}
