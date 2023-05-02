import java.util.Arrays;

public class EmpoloyeeBook {
    private final Employee [] employees;

    public EmpoloyeeBook(Employee[] employees) {
        this.employees = new Employee [10];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "EmpoloyeeBook{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}



