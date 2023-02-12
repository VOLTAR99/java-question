//Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
//for calculating the minimum element.
import java.util.*;

class min{
    void minval(){
        int arr[]={2, -3, 5, 8, 1, 0, -4};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
         min=Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
}
public class ques4 {
    public static void main(String[] args) {
     min a=new min();
     a.minval();
    }
}
