
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){


        int[] arr = {1, 3, 4, 3, 6, 10, 6, 4, 5, 9, 1};

        Arrays.sort(arr);
        ArrayList<Integer> sorted = new ArrayList<>();
        for(int i = 0; i<arr.length -1 ; i++){
            if(arr[i] != arr[i+1]){
                sorted.add(arr[i]);
            }
        }
        sorted.add(arr.length-1 );
        for(int num: sorted){
            System.out.println(num + " ");
        }
    }
}
