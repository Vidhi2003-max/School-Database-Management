package school.management.system;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Teacher jaya = new Teacher(1,"jaya",500);
        Teacher rekha = new Teacher(2,"rekha",700);
        Teacher jay = new Teacher(3,"jay",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(jaya);
        teacherList.add(rekha);
        teacherList.add(jay);


        Student sameer = new Student(1,"sameer",4);
        Student ram = new Student(2,"ram",12);
        Student sonal = new Student(3,"sonal",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(sameer);
        studentList.add(ram);
        studentList.add(sonal);


        School ghs = new School(teacherList,studentList);


        sameer.payFees(5000);
        System.out.println("GHS has earned rupees" + ghs.getTotalMoneyEarned());
        ram.payFees(6000);
        System.out.println("GHS has earned rupees" + ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        jaya.receiveSalary(jaya.getSalary());
        System.out.println("GHS has spent for salary to " + jaya.getName()+"and now has rupees"+ ghs.getTotalMoneyEarned());



    }
}