public class Main {
    public static void main(String[] args) {
        Person person = new Person("Salem","0501331845");
        Student student = new Student("Reem","0564448202",200000,3.6);
        Employee employee = new Employee("Saad","0563428255",200003,1600);

        System.out.println(person.toString());
        System.out.println(student);
        System.out.println(employee);
        System.out.println(student.getClass().getName());
    }
}
