import java.util.ArrayList;
import java.util.Random;

public class OddNums {
    public static void main(String[] args){
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even= new ArrayList<>();

        int amountOfNumbers = 4;
        for(int z=0; z<amountOfNumbers; z++){
            arr.add(rand.nextInt(100) );
             }
        for (Integer integer : arr) {
            if (integer % 2 != 0) {
                odd.add(integer);
            } else {
                even.add(integer);
            }
        }
        System.out.print("Here are numbers in the original array: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Here are the odd numbers in the array: ");
        for(int num:odd){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Here are the even numbers in the array: ");
        for(int num:even){
            System.out.print(num + " ");
        }
    }
}
