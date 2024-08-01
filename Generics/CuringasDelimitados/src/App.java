import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(12);
        intList.add(14);

        List<? extends Number> list = intList;

        Number x = list.get(0);
        // list.add(25) dará erro de compilação 
        //Covariância permite get mas não permite put


        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(12);
        myNums.add(14);

        // Number x = myNums.get(0); dará erro de compilação 
        //Contravariância permite put mas não permite get


    }
}
