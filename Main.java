public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Michael", 1);
        m.setSalary(2000000);
        System.out.println("Manager name = "+ m.getName());
        System.out.println("Salary = "+ m.getSalary());
    }
}
