//Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
//elements.
class E{
    void F(){
        int[] abc={1,2,3,4,5,6,7,8};
        for (int x:abc
             ) {
            if(x%2!=0){
                System.out.println(abc[x]);
            }
        }

        }
}
public class ques3 {
    public static void main(String[] args) {
        E obj= new E();
        obj.F();
    }
}
