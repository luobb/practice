import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String[] strs = {"aa", "bb", "cc"};
        List<String> stringList = Arrays.asList(strs);
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("nihaome");
        System.out.println("hahaha");
        System.out.println("hahaha");
        System.out.println("hahaha");
    }
}
