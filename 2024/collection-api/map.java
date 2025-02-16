import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map <String, Integer> student = new HashMap<>();
        student.put("Book", 56);
        student.put("aa", 69);
        student.put("bb", 69);
        student.put("ccc", 888);

        System.out.println(student.get("Book"));
        System.out.println(student.keySet());

        for(String key: student.keySet()) {
            System.out.println(key + " : " + student.get(key));
        }
    }
}
