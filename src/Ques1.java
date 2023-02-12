//Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
class A{
    static void B(){
        int[] arr={2,6,-5,-1,0,4,-9};
        for(int i=0;i<arr.length;i++){
            if (arr[i]>=0){
                System.out.println(arr[i]);
            }
        }
    }
}
public class Ques1 {
    public static void main(String[] args) {
        A obj=new A();
        obj.B();
    }
}
