package excercises.hashmap;

/**
 * Created by joschinc on 11/3/16.
 */
public final class Employee implements Comparable<Employee> {

    private final String name;
    private final int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        return name.equals(employee.name);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.getName());
    }
}
