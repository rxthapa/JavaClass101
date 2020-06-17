public class Employee {
    private String Fname;
    private String Mnane;
    private String Lname;
    private long ph;
    private int id;
    private int Salary;
    private String dept;

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getMnane() {
        return Mnane;
    }

    public void setMnane(String mnane) {
        Mnane = mnane;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public long getPh() {
        return ph;
    }

    public void setPh(long ph) {
        this.ph = ph;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
