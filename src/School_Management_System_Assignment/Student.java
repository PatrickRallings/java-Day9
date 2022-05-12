package School_Management_System_Assignment;

//Class responsible for keeping track
// of students and their attributes
// (name, fees, grade, and ID)
public class Student {
    private int id;
    private String name;
    private int grade;
    private double feesPaid;
    private double feesTotal;

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0.00;
        this.feesTotal = 30000.00;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void updateFeesPaid(double fees){
        this.feesPaid += fees;
    }
    public String getName(){
        return this.name;
    }
    public int getGrade(){
        return this.grade;
    }
    public double getFeesPaid(){
        return this.feesPaid;
    }
    public double getFeesTotal(){
        return this.feesTotal;
    }
}
