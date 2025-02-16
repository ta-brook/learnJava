import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Student implements Comparable{
    class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // public int compareTo(Student that) {
    //     if(that.age > that.age)
    //         return 1;
    //     else
    //         return 0;
    // }
}

public class Demo {
    public static void main(String[] args) {
        // Comparator<Student> com = new Comparator<Student>() {

        //     public int compare(Student i, Student j) {
        //         if(i.age > j.age)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

        // lambda --> this should be illegal why would you use something like this to confused the other or what
        Comparator<Student> com = (i, j) -> i.age > j.age?1:0;

        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Book"));
        students.add(new Student(41, "odk"));
        students.add(new Student(221, "ok"));
        students.add(new Student(27891, "Bok"));
        students.add(new Student(2881, "Bo"));
        
        Collections.sort(students, com);
        System.out.println(students);
    }
}
