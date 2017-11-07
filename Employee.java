public class Employee extends Person{
    
    protected double salary; 

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public Employee(String name) {
        super(name);
    }
    
}
