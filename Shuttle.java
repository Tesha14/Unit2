package cosmodrome;

import java.util.Random;

public class Shuttle implements IStart {
    public boolean checkBeforeStart();

    {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println(number);
        if (number > 3) {
            return true;
        } else {
            return false;
        }
    }

    public void setEngineStart(){
        System.out.println("Двигатели запущены. Все системы в норме.");
    }
    public void setStart(){
        System.out.println("Старт шатла");
    }
}