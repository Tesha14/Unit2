import java.util.Random;
import java.util.Scanner;

public class Computer1 {
    public static void main(String[] args) {
        Computer computer = new Computer(2000, 4, 12, 238, 11);
        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        System.out.println("your action is =" + action);
        Random random = new Random();
        int random0_1 = random.nextInt(2);
        System.out.println("random number = " + random0_1);
        System.out.println(computer.info());


    }
}

     class Computer {
        protected int processor; // частота?
        protected int cores; // ядра
        protected int ram; // оперативная память
        protected int hdd; // жесткий диск
        protected int cycle; //цикл

          Computer(int processor, int cores, int raw, int hdd, int cycle) {
            this.processor = processor;
            this.cores = cores;
            this.ram = raw;
            this.hdd = hdd;
            this.cycle = cycle;
        }
        double Price() {
            return (processor * cores / 4 + ram / 12 + hdd / 238);
        }
         boolean SuitableForUse() {
            if ((processor >= 2000) && (cores >= 4) && (ram >= 12) && (hdd >= 238)) {
                return true;
            }

            else {
                System.out.print("Сгорел =(");
                return false;

            }
        }
        String info() {
            return "Computer:\n" +
                    "  processor: " + processor + " MHz\n" +
                    "  cores: " + cores + "\n" +
                    "  RAM: " + ram + " MB\n" +
                    "  hdd: " + hdd + " GB\n" +
                    "  Price: " + Price() + "$\n" +
                    (SuitableForUse() ? "  включился" : " =)");
        }
    }

