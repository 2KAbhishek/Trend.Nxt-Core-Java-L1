public class EmployeeDemo {
    public static void main(String[] args) {

        EmployeeDB empDb = new EmployeeDB();

        Employee emp1 = new Employee(101, "2KAbhishek", "me@2kabhishek.com", 'M', 25000);
        Employee emp2 = new Employee(102, "Nishita", "nishita@email.com", 'F', 30000);
        Employee emp3 = new Employee(103, "Rohit", "rohit@email.com", 'M', 20000);
        Employee emp4 = new Employee(104, "Karan", "karan@email.com", 'M', 50000);

        empDb.addEmployee(emp1);
        empDb.addEmployee(emp2);
        empDb.addEmployee(emp3);
        empDb.addEmployee(emp4);

        for (Employee emp : empDb.listAll())
            System.out.println(emp.getEmployeeDetails());

        System.out.println();
        empDb.deleteEmployee(102);

        for (Employee emp : empDb.listAll())
            System.out.println(emp.getEmployeeDetails());

        System.out.println();

        System.out.println(empDb.showPaySlip(103));
    }

}
