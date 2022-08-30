import java.util.*;
import java.util.ArrayList;

public class DemoGenericArray {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);

        integerList.add(5);
        nameList.add("gionee");
        nameList.add("MI");
        nameList.add("TypeCast");
        nameList.add("PAC");
        nameList.add("hatcho");
        nameList.add("kasol");
        //processibg list
        int sum = 0;
        for (Integer element : integerList) {
            sum = sum + element;
        }
        System.out.println(sum);
        //processing secounsd list
        for (String element : nameList) {
            System.out.println(element.toUpperCase());
        }
    }

}
