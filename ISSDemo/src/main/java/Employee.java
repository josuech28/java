/**
 * Created by joschinc on 12/8/16.
 */
public final class Employee {
    private final String name;
    private final String lastName;
    private final String email;
    private final String genre;

    public Employee(String name, String lastName, String email, String genre) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!getName().equals(employee.getName())) return false;
        if (!getLastName().equals(employee.getLastName())) return false;
        if (getEmail() != null ? !getEmail().equals(employee.getEmail()) : employee.getEmail() != null) return false;
        return getGenre().equals(employee.getGenre());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + getGenre().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
