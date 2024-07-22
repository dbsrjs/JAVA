package enumeration.test.ex2;

public class TestEmployee2 {
    public static void main(String[] args) {
        Employee[] employees = {new FullTimeEmployee(3000, 500),
                                new ContractEmployee(2500),
                                new InternEmployee(1500) };

        System.out.println("Full Time Employee Salary: " + employees[EmployeeType.FULL_TIME.ordinal()].calculateSalary());
        System.out.println("Contract Employee Salary: " +  employees[EmployeeType.CONTRACT.ordinal()].calculateSalary());
        System.out.println("Intern Employee Salary: " +    employees[EmployeeType.INTERN.ordinal()].calculateSalary());

        System.out.println();

        for(Employee emp : employees) {
            info(emp);
        }
    }

    private static void info(Employee emp) {
        System.out.println(emp.toString());
    }
}