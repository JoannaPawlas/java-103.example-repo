package arrays;

public class maxIndex {
    public static void main(String[] args) {
        int [] array = {10, 2, 10, 5, 14};
        int result = array[0];

        for (int i = 1; i < array.length; i++){
            if (array [i] > result){
                result = array[i];
            }else{
                array[i]= array[i]+1;

            }
        }
        System.out.println("Najwyższa wartość w tablicy to: " + result);
    }
}
