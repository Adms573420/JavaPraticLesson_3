public class Question_3 {
    public static void main(String[] args) {
      int array[]={10,20,30,2,4};
      int toplam=0;


        for (int i = 0; i < array.length; i++) {

            toplam+= array[i];

        }
        System.out.println("Array elemanlarının toplamı:"+toplam);
        System.out.println("Array elemanlarının ortalaması:"+(toplam/ array.length));


    }
}
