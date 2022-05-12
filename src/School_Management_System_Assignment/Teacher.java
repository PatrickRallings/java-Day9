package School_Management_System_Assignment;

public class Teacher {
    private int id;
    private String name;
    private double salary;

    public Teacher(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
