import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("A",18,"HN");
        Student student2 = new Student("D",21,"HY");
        Student student3 = new Student("C",20,"HP");
        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for(Student i : list){
            System.out.println(i.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        for (Student i : list){
            System.out.println(i.toString());
        }
    }
}