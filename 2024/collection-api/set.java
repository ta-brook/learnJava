import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(1);
        nums.add(5);
        nums.add(3);
        nums.add(4);
        
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

        for(Object n: nums) {
            System.out.println(n);
        }
    }
}
