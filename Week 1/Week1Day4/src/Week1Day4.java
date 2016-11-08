import excercises.Investment.Investment;
import excercises.Investment.InvestmentDao;
import excercises.autoboxing.Number;
import excercises.autoboxing.NumberTest;
import excercises.circle.Circle;
import excercises.connection.DB;
import excercises.department.Department;
import excercises.department.DepartmentDAO;
import excercises.employee.Employee;
import excercises.employee.EmployeeDAO;
import excercises.employee.EmployeeTest;
import excercises.user.User;
import excercises.user.UserDao;
import excercises.varargs.HardCoded;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by joschinc on 11/4/16.
 */
public class Week1Day4 {

    public static void main(String[] args){
        /*
            Employees with enhanced for

        Employee e1 = new Employee(115400450,"Josue Chinchilla",new BigDecimal("1200"));
        Employee e2 = new Employee(212402420,"Oscar Rojas",new BigDecimal("2200"));
        Employee e3 = new Employee(335200351,"John Smith",new BigDecimal("3200"));

        EmployeeTest employees = new EmployeeTest();
        employees.addEmployee(e1);
        employees.addEmployee(e2);
        employees.addEmployee(e3);

        // Print with out for enhanced
        System.out.println("Print Employees with out enhanced for");
        employees.printEmployeeTraditional();

        // Print with iterator
        System.out.println("Print Employees with itetator");
        employees.printEmployeeIterator();

        // Print with enhanced for
        System.out.println("Print Employees with  enhanced for");
        employees.printEmployeeIterator();

        */

        /*
            Sort ArrayList

        Number a = new Number(29);
        Number b = new Number(63);
        Number c = new Number(11);
        Number d = new Number(109);

        NumberTest numberTest = new NumberTest();
        numberTest.addNumber(a);
        numberTest.addNumber(b);
        numberTest.addNumber(c);
        numberTest.addNumber(d);

        numberTest.print();

        */
        /*
            Circle Class

        Circle c1 = new Circle(3);
        Circle c2 = new Circle(9);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        */
        /*
            Varargs

             HardCoded hc = new HardCoded();
             hc.average(3,3,3);
             hc.average(4,8,96,74,2);
         */
        /*
            Employee - Departmennt

        //Employee e1 = new Employee(1);
        //e1.setName("Josue Chinchilla");
        //e1.setSalary(new BigDecimal("1200"));

        //Employee e2 = new Employee(3);
        //e2.setName("Oscar Rojas");
        //e2.setSalary(new BigDecimal("2200"));

        //Employee e3 = new Employee(4);
        //e3.setName("Leonardo Vargas");
        //e3.setSalary(new BigDecimal("3200"));

        EmployeeDAO dao = new EmployeeDAO();
        DepartmentDAO daoDepartment = new DepartmentDAO();

        //dao.addEmployee(e1);
        //dao.addEmployee(e2);
        //dao.addEmployee(e3);

        //dao.deleteEmployee(e1.getEmployeeId());
        dao.getAccountEmployee();
        //dao.getEmployees();
        //dao.getEmployee(e1.getEmployeeId());

        //dao.increaseSalary(e1,new BigDecimal("50")); // 50 Porcent
        //dao.getEmployee(e1.getEmployeeId());

        BigDecimal salarySapien = new BigDecimal("2000");
        Employee e1 = new Employee(1,"Josue Chinchilla", salarySapien);
        Employee e2 = new Employee(2,"Oscar  Cartin", salarySapien);
        Employee e3 = new Employee(3,"Leonardo  Chacon", salarySapien);
        Employee e4 = new Employee(4,"Shashank",salarySapien);
        Employee e5 = new Employee(5,"Daniel QA",salarySapien);

        dao.addEmployee(e1);
        dao.addEmployee(e2);
        dao.addEmployee(e3);
        dao.addEmployee(e4);
        dao.addEmployee(e5);

        Department sapiens = new Department(1,"Sapiens");
        sapiens.addEmployee(e1);
        sapiens.addEmployee(e2);
        sapiens.addEmployee(e3);
        sapiens.addEmployee(e4);
        sapiens.addEmployee(e5);

        daoDepartment.addDepartment(sapiens);


        BigDecimal salaryRazor = new BigDecimal("1000");
        Employee e6 = new Employee(6,"Victor Casanova", salaryRazor);
        Employee e7 = new Employee(7,"Roberto Gomez", salaryRazor);
        Employee e8 = new Employee(8,"Javier  Hernandez", salaryRazor);
        Employee e9 = new Employee(9,"Origi Levatan",salaryRazor);
        Employee e10 = new Employee(10,"Lusiana Andrade",salaryRazor);

        dao.addEmployee(e6);
        dao.addEmployee(e7);
        dao.addEmployee(e8);
        dao.addEmployee(e9);
        dao.addEmployee(e10);

        Department razor = new Department(2,"02-Razor");
        razor.addEmployee(e6);
        razor.addEmployee(e7);
        razor.addEmployee(e8);
        razor.addEmployee(e9);
        razor.addEmployee(e10);

        daoDepartment.addDepartment(razor);

        BigDecimal salaryStudio = new BigDecimal("1500");
        Employee e11 = new Employee(11,"Victor Montero", salaryStudio);
        Employee e12 = new Employee(12,"Jose Pablo Granados", salaryStudio);
        Employee e13 = new Employee(13,"Maikol Zumbado", salaryStudio);
        Employee e14 = new Employee(14,"Marvin Solano ",salaryStudio);
        Employee e15 = new Employee(15,"Carlos Benavidez",salaryStudio);

        dao.addEmployee(e11);
        dao.addEmployee(e12);
        dao.addEmployee(e13);
        dao.addEmployee(e14);
        dao.addEmployee(e15);

        Department studio = new Department(3,"03-Studio");
        studio.addEmployee(e11);
        studio.addEmployee(e12);
        studio.addEmployee(e13);
        studio.addEmployee(e14);
        studio.addEmployee(e15);

        daoDepartment.addDepartment(studio);

         */
        /*
            User - Investments
         */
        DB db = new DB();
        try {
            db.connect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        User u1 = new User(1,"Josue","j12345");
        User u2 = new User(2,"Shashank","s12345");
        User u3 = new User(3,"Leonardo","l12345");




        UserDao daoUser = new UserDao();
        daoUser.addUser(u1);
        daoUser.addUser(u2);
        daoUser.addUser(u3);
        daoUser.findUser(1,"j12346");

        Investment i1 = new Investment(1,"GOOGLE",1340, new BigDecimal("1200"),1);
        Investment i2 = new Investment(2,"FACEBOOK",1341, new BigDecimal("3200"),1);
        Investment i3 = new Investment(3,"TESLA MOTORS",1343, new BigDecimal("1400"),1);
        Investment i4 = new Investment(4,"GOOGLE",1343, new BigDecimal("200"),1);
        Investment i5 = new Investment(5,"GOOGLE",1344, new BigDecimal("12000"),1);

        InvestmentDao daoInvestment = new InvestmentDao();
        daoInvestment.addInvestment(i1);
        daoInvestment.addInvestment(i2);
        daoInvestment.addInvestment(i3);
        daoInvestment.addInvestment(i4);
        daoInvestment.addInvestment(i5);

        daoInvestment.getInvestmentByUser(u1);
        //daoUser.deleteUser(u1);
        /* With Scanner

        Scanner in = new Scanner(System.in);
        int id = 0;
        String password = "";
        System.out.println("Digit ID User please");
        id = in.nextInt();
        System.out.println("Digit your password");
        password = in.next();
        if(daoUser.findUser(id,password).equals(null)){
            System.out.println("User not found or password dont match");
        } else {
            User temp = new User();
            temp = daoUser.findUser(id,password);
            daoInvestment.getInvestmentByUser(temp);
        }



         */
        db.closeConnection();
    }




}