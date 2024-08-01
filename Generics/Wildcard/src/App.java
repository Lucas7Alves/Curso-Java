import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> myInts = Arrays.asList(1, 2 , 3 ,4);
        List<String> myStr = Arrays.asList("Maria, Alex, Bob");

        printList(myStr);
        printList(myInts);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    } 
}
