public class Passenger extends Ground {
       public int  passenger;
       public String type;
       public String describe(){
           return super.describe() + " passengers =" + passenger +
                   "type = " + type;
       }
       public void wayLength(double time){
           double wayLength = time * MaxSpeed;
           System.out.println("За время " + time + " ч " + "авто " + brand +
                   "двизался с макс скоростью" + MaxSpeed + "км/ч " + "проедет" +
                   wayLength + "км " + " и израсходует" + fuel(wayLength) +
                   "литров топлива" + "\n");
       }
       private double fuel(double wayLength){
           double fuel = FuelConsumption * wayLength / 100;
           return fuel;
       }
    }


//private String passengers;
  //      double p = 4;
//private String BodyWork; // внедорожник 5дв.
  //      double t = 1;
    //    double k = 1.3d;
      //  double s;
        //double s2;
       // double r = 0.188d; // расход на 1км
