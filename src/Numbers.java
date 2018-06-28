import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Numbers {
    public static void main(String[] args) {
        TreeSet<Integer> tSet = new TreeSet<>();
        Random random = new Random();

        int average = 0;

        while (tSet.size()<50){
            int number= random.nextInt(1001);
            tSet.add(number);
            average+=number;
        }
        System.out.println("Najmniejsza liczba to: " + tSet.first());
        System.out.println("Najwieksza liczba to: " + tSet.last());
        System.out.println("Srednia wszystkich liczb: " + average/tSet.size());
        System.out.println("Wszystkie liczby większe od średniej: ");
        Iterator<Integer> iterator = tSet.iterator();
        while (iterator.hasNext()){
            Integer nast = iterator.next();
            if (nast >average / tSet.size()){
                System.out.println(nast);
            }
        }
    }
}
