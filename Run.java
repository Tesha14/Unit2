import hands.SamsungHand;
import hands.SonyHand;
import hands.ToshibaHand;
import heads.SamsungHead;
import heads.SonyHead;
import heads.ToshibaHead;
import legs.SamsungLeg;
import legs.SonyLeg;
import legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead(94);
        SamsungHead samsungHead = new SamsungHead(93);
        ToshibaHead toshibaHead = new ToshibaHead(95);

        SonyHand sonyHand = new SonyHand(78);
        SamsungHand samsungHand = new SamsungHand(77);
        ToshibaHand toshibaHand = new ToshibaHand(79);

        SonyLeg sonyLeg = new SonyLeg(61);
        SamsungLeg samsungLeg = new SamsungLeg(60);
        ToshibaLeg toshibaLeg = new ToshibaLeg(62);

        Robot robot1 = new Robot(sonyHead, sonyHand, sonyLeg);
        Robot robot2 = new Robot(samsungHead, samsungHand, samsungLeg);
        Robot robot3 = new Robot(toshibaHead, toshibaHand, toshibaLeg);
        robot1.action();
        robot2.action();
        robot3.action();

        System.out.println("PriceRobot1 =" + robot1.getPrice());
        System.out.println("PriceRobot2 =" + robot2.getPrice());
        System.out.println("PriceRobot3 =" + robot3.getPrice());

        int price1 = robot1.getPrice();
        int price2 = robot2.getPrice();
        int price3 = robot3.getPrice();
        int maxPrice;
        if(price1 > price2){
            maxPrice = price1;
            if (maxPrice > price3){
                System.out.println("maxPrice robot1 = " + maxPrice);}
            else { maxPrice = price3;
                System.out.println("maxPrice robot3 = " + maxPrice);
            }
        }
         else {
            maxPrice = price2;
            if (maxPrice > price3) {
                System.out.println("maxPrice robot2 = " + maxPrice);
            } else {
                maxPrice = price3;
                System.out.println("maxPrice robot3 = " + maxPrice);
            }
        }

         if (price1 == price2 && price1 < price3){
             System.out.println("maxPrice robot3 = " + price3);
         }
         if (price1 == price2 && price1 > price3){
             System.out.println("maxPrice robot1 = robot2 = " + price1);
         }
         if (price1 == price3 && price1 < price2){
             System.out.println("maxPrice robot2 = " + price2);
         }
         if (price1 == price3 && price1 > price2){
             System.out.println("maxPrice robot1 = robot3 =" + price1);
         }
         if (price2 == price3 && price2 < price1){
             System.out.println("maxPrice robot1 = " + price1);
         }
         if (price2 == price3 && price2 > price1){
             System.out.println("maxPrice robot2 = robot3 =" + price2);
         }
         if (price1 == price2 && price1 == price3){
             System.out.println("maxPrice robot1 = robot2 = robot3 = " + price1);
         }


        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
