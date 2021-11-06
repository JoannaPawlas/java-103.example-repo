package arrays;

public class minIndex {
    public static void main(String[] args) {
        int [] array= {8, 10, 5, 1, 3};
        int result = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i]<result){
                result = array[i];

            }else{
                array [i] = array[i]+1;

            }
        }
        System.out.println("Najmniższa wartość w tablicy to: " + result);





    }
}
