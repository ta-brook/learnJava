import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class array {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(1);
        nums.add(45);
        nums.add(80);
        nums.add(4);

        System.out.println(nums.get(2));

        for(Object n: nums) {
            int num = (Integer)n;
            System.out.println(num*5);
        }
    }
}
