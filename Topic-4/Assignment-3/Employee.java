public class Employee {
    int empid;
    String empname;
    String empemail;
    char empgender;
    double salary;

    public Employee(int empid, String empname, String empemail, char empgender, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.empemail = empemail;
        this.empgender = empgender;
        this.salary = salary;
    }

    public String getEmployeeDetails() {
        return ("empid: " + empid + "; empname: " + empname + "; empemail: " + empemail + "; empgender: " + empgender
                + "; salary: " + salary);
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }

    public char getEmpgender() {
        return empgender;
    }

    public void setEmpgender(char empgender) {
        this.empgender = empgender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
