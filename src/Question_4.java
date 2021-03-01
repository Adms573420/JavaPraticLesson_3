import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Question_4 {
    public static void main(String[] args) {
        int array[]={5,2,41,57,21,36,52};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array);
            System.out.print(array[i]+" ");
        }

    }
}
