import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class SequencedCollectionExample {
    void main(){
        List<Integer> l1 = Arrays.asList(5,6,8,5,2,9,4,7,1);
        System.out.println(l1.getFirst());
        System.out.println(l1.reversed());
        System.out.println(l1.getLast());

        LinkedHashSet<Integer> set= new LinkedHashSet<>(l1.reversed());
        System.out.println(set);
        System.out.println(set.getFirst());
        System.out.println(set.getLast());
        System.out.println(set.reversed());

        LinkedHashMap map=new LinkedHashMap();
        map.put(2,2);
        map.putFirst(1,1);
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

    }
}
