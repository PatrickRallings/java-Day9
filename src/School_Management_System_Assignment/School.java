package School_Management_System_Assignment;

import java.util.ArrayList;

public class School {
private ArrayList<Teacher> teachers;
private ArrayList<Student> students;
private double totalMoneyEarned;
private double totalMoneySpent;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(double totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(double totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
