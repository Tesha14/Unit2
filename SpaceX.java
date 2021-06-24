package cosmodrome;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean checkBeforeStart(){
        Random random = new Random();
        int number = random.nextInt(20);
        System.out.println(number);
        if (number % 2 == 0 ){
           return true;
        } else {
            return false;
        }
    }
    @Override
    public void setEngineStart(){
        System.out.println("Двагатели SpaceX запущены. Все системы в норме. ");
    }
    @Override
    public void setStart(){
        System.out.println("Старт шатла SpaceX");
    }
}
