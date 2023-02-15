public class Employee extends Person {

    private int id;
    private int salary;

    public Employee(){

    }
    public Employee(String name, String phone, int id, int salary){
        super(name, phone);
        this.id = id;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString() + ", ID: " +id+ ", Monthly salary: " +salary+" SAR";
    }
}
