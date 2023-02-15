public class Student extends Person {
    private int id;
    private double gpa;


    public Student() {
    }

    public Student(String name,String phone,int id, double gpa){
        super(name, phone);
        this.id = id;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return super.toString()+ ", ID: "+id+", GPA: "+gpa;
    }
}
