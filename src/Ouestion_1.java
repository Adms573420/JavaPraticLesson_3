import java.util.ArrayList;

public class Ouestion_1 {
    public static void main(String[] args) {
//differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
//// Smallest number is -50, biggest is 32.
        int numbers []={10, 4, 1, 4, -10, -50, 32, 21};
        int max=0;
        int min=0;

        for (int i = 0; i < numbers.length; i++) {
            if(max<numbers[i]) {
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];

            }

        }
        System.out.println("maximum deger="+max);
        System.out.println("minumum deger="+min);

        System.out.println("Fark =" + (max - min));

    }
}
