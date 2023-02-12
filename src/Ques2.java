//Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
//strings stored on odd indices of the array.
class C{
    static void D(){
        String[] str={"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        for(int i=0;i<=str.length;i++){
            if (i%2!=0){
                System.out.println(str[i]);
            }
        }
    }
}
public class Ques2 {
    public static void main(String[] args) {
        C obj=new C();
        obj.D();
    }
}
