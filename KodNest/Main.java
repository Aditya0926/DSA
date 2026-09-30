package KodNest;
import java.util.*;
// import java.util.jar.Attributes.Name;

class Student{
    int id;
    String name;
    String course;
    double javaScore;
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();

        s1.id = sc.nextInt();
        s1.name = sc.next();
        s1.course = sc.next();
        s1.javaScore = sc.nextDouble();
        s2.id = sc.nextInt();
        s2.name = sc.next();
        s2.course = sc.next();
        s2.javaScore = sc.nextDouble();

        //print
        System.out.println("student-1 profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " +s1.javaScore);

        System.out.println("student-2 profile");
        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
        System.out.println("Course: " + s2.course);
        System.out.println("Java Score: " +s2.javaScore);

        sc.close();
    }
}
