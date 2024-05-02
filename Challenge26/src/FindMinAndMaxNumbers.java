import java.util.ArrayList;
import java.util.Random;

public class FindMinAndMaxNumbers {
    public static void main(String[] args) {
        Random random= new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<10; i++) {
            numbers.add(random.nextInt(100));
        }
        int smallest= numbers.get(0);
        int largest= numbers.get(0);
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Lista numerelor: "+ numbers);
        System.out.println("Numarul minim: "+smallest);
        System.out.println("Numarul maxim: "+largest);

    }
}
