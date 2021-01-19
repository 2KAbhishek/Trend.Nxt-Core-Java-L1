import java.util.*;

public class EmployeeDB {
    List<Employee> employeeDB = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return employeeDB.add(e);
    }

    public boolean deleteEmployee(int empid) {
        boolean rem = false;
        Iterator<Employee> it = employeeDB.iterator();
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getEmpid() == empid) {
                rem = true;
                it.remove();
            }
        }
        return rem;
    }

    public String showPaySlip(int empid) {
        String paySlip = "Invalid emp id";
        for (Employee e : employeeDB) {
            if (e.empid == empid) {
                paySlip = "Payslip of empid " + empid + " is " + e.getSalary();
            }
        }
        return paySlip;
    }

    public Employee[] listAll() {
        Employee[] e = new Employee[employeeDB.size()];
        for (int i = 0; i < employeeDB.size(); i++) {
            e[i] = employeeDB.get(i);
        }
        return e;
    }
}
