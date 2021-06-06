public class Unit3Task2 {
    public static void main (String [] args){
        int a = 0;
        for(int i = 1; i <= 99; i++){
            if(i % 2 != 0)a++;
        }
             int[] mass = new int[a];
            for(int i = 1, b = 0;i <= 99; i++){
                if(i % 2 != 0){
                    mass[b]= i;
                    System.out.print(mass[b]+" ");
                    b++;
                }
            }
        System.out.println(" ");
        for(int i = mass.length-1; i >= 0; i--){
            System.out.print(mass[i] + " ");
        }
    }
}


