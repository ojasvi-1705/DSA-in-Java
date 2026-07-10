import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {
    public static void printarr(Integer arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    public static void main(String args[]){
        Integer arr[] = {4,5,7,2,3};
        Arrays.sort(arr,  Collections.reverseOrder());
        printarr(arr);
    }
}
