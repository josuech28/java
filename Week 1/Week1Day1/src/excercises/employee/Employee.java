package excercises.employee;

/**
 * Created by joschinc on 10/31/16.
 */
public class Employee {

    private String name;
    private String departmentNumber;
    private VerifyDepartment checkDepartment;
    private VerifyBirthYear checkYear;
    private int birthYear;

    public Employee(){
        this.name = "";
        this.departmentNumber = "";
        this.checkDepartment = new VerifyDepartment();
        this.checkYear = new VerifyBirthYear();
        this.birthYear = 0;
    }

    public Employee(String name, int birthYear){
        this.name = name;
        this.departmentNumber = "";
        this.checkDepartment = new VerifyDepartment();
        this.checkYear = new VerifyBirthYear();
        this.birthYear = birthYear;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public boolean addDepartment(String departmentNumber) {
        boolean isAdded = false;
        if (checkDepartment.checkDepartment(departmentNumber)) {
            this.departmentNumber = departmentNumber;
            System.out.println("Employee was added to the department" + this.departmentNumber);
            isAdded = true;
        } else {
            System.out.println("Employee can not be added to the department");
            isAdded = false;
        }
        return isAdded;
    }

    public int yearLeft(int birthYear){
        if(checkYear.checkBirthYear(birthYear)){
            System.out.println("time to left" + checkYear.timeToLeft(2016,birthYear));
             return checkYear.timeToLeft(2016,birthYear);

        }else {
            System.out.println("Invalid number of year");
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " Department: " + this.departmentNumber;
    }
}
