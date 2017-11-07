public class Manager extends Employee {

    private int type;

    public Manager(String name, int type) {
        super(name);
        this.type = type;
    }

    public void setType(int type) {
        if (type >= 1 && type <= 2) {
            this.type = type;
        }
    }

    @Override
    public void setSalary(double salary) {
        if (type == 1) {
            super.salary = 1.25 * salary;
        } else if (type == 2) {
            super.salary = 1.5 * salary;
        } else {
            super.salary = salary;
        }
    }

}
