import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Nữ", 18, "HY");
        Student student3 = new Student("Null", 0, "Null");
        Map<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, student1);
        for (Map.Entry<Integer, Student> student : map.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("--------------------------");
        Set<Student> hashSet = new HashSet<Student>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student1);
        for (Student student : hashSet){
            System.out.println(student.toString());
        }
    }
}