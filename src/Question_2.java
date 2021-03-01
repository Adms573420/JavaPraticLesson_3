public class Question_2 {
    public static void main(String[] args) {
        int numbers []={10, 4, 1, 4, -10, -50, 32, 21};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2==0){
                System.out.println("Cift olanlar:"+numbers[i] );
            }
        }
    }
}
