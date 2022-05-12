package School_Management_System_Assignment;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Teacher Lizzy = new Teacher(1, "Lizzy", 500.00);
        Teacher Melinda = new Teacher(2, "Melinda", 700.00);
        Teacher Guy = new Teacher(3, "Guy", 600.00);

        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Melinda);
        teacherList.add(Guy);

        Student Tap = new Student(1, "Tap", 4);
        Student Rack = new Student(2, "Rack", 12);
        Student Rav = new Student(3, "Rav", 5);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(Tap);
        studentList.add(Rack);
        studentList.add(Rav);

        School phs = new School(teacherList, studentList);


        Tap.payFees(5000.00);
        Rack.payFees(6000.00);
        System.out.println("PHS has earned $"+phs.getTotalMoneyEarned());

        System.out.println("--- PHS PAYING SALARY---");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println(Lizzy.getName()+" was paid $"+Lizzy.getSalary()+".");
        System.out.println("PHS has now earned $"+phs.getTotalMoneyEarned()+".");
        Guy.receiveSalary(Guy.getSalary());
        System.out.println(Guy.getName()+" was paid $"+Guy.getSalary()+".");
        System.out.println("PHS has now earned $"+phs.getTotalMoneyEarned()+".");

        System.out.println(Lizzy.toString());

    }
}
